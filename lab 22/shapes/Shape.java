/** lab 22
  * Kimberlene Sharma
  * Shape class creates a panel with several circles
  * 6thOctober 2016
  */
package shapes;
import java.util.Random;
import java.awt.*;

public class Shape
{
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  private int moveX = 1;
  private int moveY = 1;
  
  public int randomRange(int lo, int hi)
  {
    Random generator = new Random();
    return generator.nextInt(hi-lo+1)+lo;// returns a random value within the range
  }
  
  /** constructor which sets up random values to the data fields */
  public Shape()
  {
    Random generator = new Random(); // gernerates random numbers
    width = randomRange(10, 30);
    height = width;
    x = generator.nextInt(400 - width);
    y = generator.nextInt(400 - height);
    colour = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
  }
  
  public void move()
  {
    if(width<15)
    {
      x = x + moveX;
      Random generator = new Random();
      colour = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
    } 
    
    if(x == 0 || x == 400)
    {
      moveX = -moveX;
    }
    
    if(y == 0 || y == 400)
      moveY = -moveY;
    
    if(width >= 15)
    {
      y = y - moveY;
      Random generator = new Random();
      colour = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
     }
  }
  
  /* displays the oval */
  public void display( Graphics g) 
  {
    g.setColor(colour);
    g.fillOval(x, y, width, height); 
  }   
}
