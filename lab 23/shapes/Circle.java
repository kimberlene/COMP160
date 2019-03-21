/** lab 23
  * Kimberlene Sharma
  * class circle which extends shape class to draw the circles on the screen
  * 10th october 2017
  **/

package shapes;
import java.awt.*;

public class Circle extends Shape
{
  /* draws and displays the circles */ 
  public void display( Graphics g) 
  {
    g.setColor(colour);
    g.fillOval(x, y, width, height); 
  }   
}