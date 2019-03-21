
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/** lab 14
  *Kimberlene Sharma
  * application class of Diner containing the main method
  **/
public class DinerApp{
  
  public static void main(String args[]){
    
    JFrame frame = new JFrame ("DinerApp");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TablePanel());
    frame.pack();
    frame.setVisible(true);  
  }
}
