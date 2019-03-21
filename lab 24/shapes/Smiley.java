/** lab 24
  * Kimberlene Sharma
  * class Smiley which extends shape class to draw the smileys on the screen
  * 10th october 2017
  **/
package shapes;
import java.awt.*;
import java.util.Random;

public class Smiley extends Shape
{
  public Smiley()
  {
    Random generator = new Random();
    width = 30;
    height = 30;
    x = generator.nextInt(400 - width);
    y = generator.nextInt(400 - height);
  }
  
  /** draws and displays the smileys */ 
  public void display( Graphics g) 
  {
    g.setColor(Color.yellow);
    g.fillOval(x, y, width, height); 
    g.setColor(Color.black);
    g.drawOval(x+14, y+12, 2, 2);
    g.fillOval(x+7, y+8, 4, 4);
    g.fillOval(x+20, y+8, 4, 4);
    
    if(y<200)    
    g.fillArc(x+8, y+10, 15, 13, 190, 160); // for smile
    else
    g.fillArc(x+8, y+10, 15, 13, -190, -160); // for frown
      
   }   
}
