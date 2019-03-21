/** lab 24
  * Kimberlene Sharma
  * class oval which extends shape class to draw the ovals on the screen
  * 10th october 2017
  */
package shapes;
import java.awt.*;
import java.util.Random;

public class Oval extends Shape
{
  public Oval()
  {
    Random generator = new Random();    
    height = width * 4;
    y = generator.nextInt(400 - height);
  }
  
  /** draws and displays the ovals */
   public void display( Graphics g) 
  {
    g.setColor(colour);
    g.fillOval(x, y, width, height); 
  }   
}