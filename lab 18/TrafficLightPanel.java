/** Lab 18
  * Kimberlene Sharma
  * 21st September 2016
  * panel class to create the traffic lights panel that changes colours when buttons are clicked
  **/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TrafficLightPanel extends JPanel{
  private JButton red;
  private JButton amber;
  private JButton green;
  private JLabel buttonLabel;
  private JLabel lastPressed;
  private JPanel buttonPanel;
  
  /** constructor for panel class that imports packages and creates the buttons **/
  public TrafficLightPanel(){
    red = new JButton("Red");
    amber = new JButton("Amber");
    green = new JButton("Green");
    
    ButtonListener listener = new ButtonListener();
    red.addActionListener(listener);
    green.addActionListener(listener);
    amber.addActionListener(listener);
    
    
    buttonLabel = new JLabel("Button Panel");
    lastPressed = new JLabel("Last Pressed");
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension(80,290));
    
    buttonPanel.setBackground(Color.white);
    buttonPanel.add(buttonLabel);
    buttonPanel.add(red);
    buttonPanel.add(amber);
    buttonPanel.add(green);
    
    LightPanel panel = new LightPanel();
     add(panel);    
    
    setPreferredSize(new Dimension(200,300));
    setBackground(Color.blue);
    
    
    add (buttonPanel);
     
    add(panel); 
     
  }
  
  /** private inner class **/
  private class LightPanel extends JPanel{
    
    /** constructor for inner class **/
    private LightPanel(){
      setPreferredSize(new Dimension(80,290));
      setBackground(Color.cyan);
    }
   
    /** paint component for drawing circles **/
    public void paint(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.black);
      g.fillOval(40,30,40,40);
      g.setColor(Color.black);
      g.fillOval(40,80,40,40);
      g.setColor(Color.black);
      g.fillOval(40,130,40,40);
      
      if(lastPressed.getText().equalsIgnoreCase("red")){
        g.setColor(Color.red);
        g.fillOval(40,30,40,40);
      }
      if(lastPressed.getText().equalsIgnoreCase("Amber")){
        g.setColor(Color.orange);
        g.fillOval(40,80,40,40); 
      }
      if(lastPressed.getText().equalsIgnoreCase("Green")){
        g.setColor(Color.green);
        g.fillOval(40,130,40,40);
      }
      
    }
  }
  
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
      
      
      if(e.getSource() == red){
        lastPressed.setText("Red");
        
      }
      else if(e.getSource() == amber){
        lastPressed.setText("Amber");
        
      }
      else
      {
        lastPressed.setText("Green");
       
      }
      
      repaint();
    }
  }
}
