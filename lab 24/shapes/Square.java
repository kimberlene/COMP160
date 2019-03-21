/** lab 24
  * Kimberlene Sharma
  * class Square which extends shape class to draw the squares on the screen
  * 10th october 2017
  **/
package shapes;
import java.awt.*;

public class Square extends Shape
{
   /** draws and displays the squares */
   public void display( Graphics g) 
  {
    g.setColor(colour);
    g.fillRect(x, y, width, height); 
  }   
}