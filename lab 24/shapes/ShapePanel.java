/**Lab 24
  * Kimberlene Sharma
  * panel class for Shape
  * 6th October
  **/
package shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class ShapePanel extends JPanel
{
  ArrayList<Shape> shapes = new ArrayList<Shape>();
  
  private JPanel controlPanel;
  private JTextField showNum;
  private JLabel removeLabel;
  Timer timer;
  private final int DELAY = 10;
  private JButton [] array = { new JButton("Circle"), new JButton("Square"), new JButton("Oval"), new JButton("Smiley"), new JButton("Swirl"), new JButton("Start"), new JButton("Stop"), new JButton("Remove")}; // array of JButtons
  private DrawingPanel drawPanel = new DrawingPanel();
  
  public static void main(String args[])
  {
    JFrame frame = new JFrame("Lab 24");
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
    removeLabel = new JLabel("Remove which?");
    
    ButtonListener listener = new ButtonListener();
    
    for(JButton s: array)
    {
      s.addActionListener(listener);
      controlPanel.add(s);
    }
    
    timer = new Timer(DELAY, listener);
    
    controlPanel.setPreferredSize( new Dimension(100,400));
    controlPanel.add(removeLabel);
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
      for( Shape s: shapes) 
      {
        s.display(g);
        s.showIndex(g, shapes.indexOf(s));
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
        for(Shape k: shapes)
        {
          k.move();
        }
      }
      
      else
      {
        JButton button = (JButton) event.getSource();
        
        if(button.getText().equals("Circle"))
        {
          shapes.add(new Circle()) ; // to add another circle
          
        }
        
        else if(button.getText().equals("Square"))
        {
          shapes.add(new Square()); // to add another square
          
        }
        
        else if(button.getText().equals("Oval"))
        {
          shapes.add(new Oval()); // to add another oval
          
        }
        
        else if(button.getText().equals("Smiley"))
        {
          shapes.add(new Smiley()); // to add another smiley
          
        }
        
        else if(button.getText().equals("Swirl"))
        {
          shapes.add(new Swirl()); // to add another swirl
          
        }
                
        else if(button.getText().equals("Stop"))
        {
          timer.stop(); // stop the shapes from moving
        }
        
        else 
        {
          timer.start(); // to make shapes start moving
        }
        showNum.setText(Integer.toString(shapes.size() - 1));
        
        if(shapes.size() == 0)
          showNum.setText("");
        
        if(button.getText().equals("Remove"))
        {
          /** try catch block to catch the exceptions */
          try
          {
            
            int c = Integer.parseInt(showNum.getText());
            shapes.remove(c);
            
          }catch (NumberFormatException e)
          {
            System.out.println("Cannot convert blank field to integer");
          }
          catch(IndexOutOfBoundsException e)
          {
            System.out.println("The index inputed does not exist");
          }
        }
      }
      
      repaint();
    }
  }
}
