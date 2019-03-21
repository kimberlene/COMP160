/**Lab 21
  * Kimberlene Sharma
  * panel class for Shape
  * 6th October
  **/
package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ShapePanel extends JPanel
{
  Shape [] shapes = new Shape [20];
  
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel countLabel;
  Timer timer;
  private final int DELAY = 10;
  private JButton [] array = { new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop")}; // array of JButtons
  
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
    showNum = new JTextField(2);
    countLabel = new JLabel("Count");
    
    ButtonListener listener = new ButtonListener();
    
    for(JButton s: array)
    {
      s.addActionListener(listener);
      controlPanel.add(s);
    }
    
    timer = new Timer(DELAY, listener);
    
    controlPanel.setPreferredSize( new Dimension(100,400));
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
      
      if(source == timer)
      {
        for(int k=0; k<count; k++)
        {
          shapes[k].move();
        }
      }
      else
      {
        JButton button = (JButton) event.getSource();
        if(button.getText().equals("Circle"))
        {
          
          if(count<20)
          {
            shapes[count] = new Circle() ; // to add another circle
            count++;
          }
        }
        
        if(button.getText().equals("Square"))
        {
          if(count<20){
            shapes[count] = new Square(); // to add another square
            count++;
          }
        }
        
        if(button.getText().equals("Oval"))
        {
          if(count<20){
            shapes[count] = new Oval(); // to add another oval
            count++;
          }
        }
        
        if(button.getText().equals("Smiley"))
        {
          if(count<20){
            shapes[count] = new Smiley(); // to add another smiley
            count++;
          }
        }
        
        if(button.getText().equals("Swirl"))
        {
          if(count<20){
            shapes[count] = new Swirl(); // to add another swirl
            count++;
          }
        }
        
        showNum.setText(Integer.toString(count)); // to show the counting of shapes
        
        
        if(button.getText().equals("Stop"))
        {
          timer.stop(); // stop the shapes from moving
        }
        
        if(button.getText().equals("Start"))
        {
          timer.start(); // to make shapes start moving
        }
        
        repaint();
      }
    }
  }
}
