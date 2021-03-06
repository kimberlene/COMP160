/**Lab 21
  * Kimberlene Sharma
  * panel class for Shape
  * 6th October
  **/
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShapePanel extends JPanel
{
  Shape [] shapes = new Shape [20];
  
  private JPanel controlPanel;
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  
  private DrawingPanel drawPanel = new DrawingPanel();
  private int count=0;
  
  public static void main(String args[])
  {
    JFrame frame = new JFrame("Lab 21");
    frame.getContentPane().add(new ShapePanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  
  /* constructor which adds the buttons and panels*/
  public ShapePanel()
  {
    controlPanel = new JPanel();
    addShape = new JButton("Add Shape");
    showNum = new JTextField(2);
    countLabel = new JLabel("Count");
    
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener(listener);
    
    controlPanel.setPreferredSize( new Dimension(100,400));
    controlPanel.add(addShape);
    controlPanel.add(countLabel);
    controlPanel.add(showNum);
    
    
    add(controlPanel);
    add(drawPanel);
  }
  
  private class DrawingPanel extends JPanel
  {
    public DrawingPanel()
    {
      setPreferredSize( new Dimension(400,400));
      setBackground(Color.pink);
      
    }
    
    /* paint component method */
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g);
      for(int x=0; x<count; x++) 
      {
        shapes[x].display(g);
      }
      repaint();
    }
  }
  
  
  private class ButtonListener implements ActionListener
  {
    public void actionPerformed(ActionEvent event)
    {
      Object source = event.getSource();
      if(source == addShape)
      {

        if(count<20)
        {

          shapes[count] = new Shape() ;
          count++;
        }
     showNum.setText(Integer.toString(count));
      }
      
      
    }
  }
}
