/** lab 24
  * Kimberlene Sharma
  * Shape class creates a panel with several circles
  * 6thOctober 2016
  */
package shapes;
import java.util.Random;
import java.awt.*;

public abstract class Shape
{
  protected int x;
  protected int y;
  protected int width;
  protected int height;
  protected Color colour;
  protected int moveX = 1;
  protected int moveY = 1;
  
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
      
    } 
    
    if(x == 0 || x == 400-width)
    {
      moveX = -moveX;
    }
    
    if(y == 0 || y == 400-height)
      moveY = -moveY;
    
    if(width >= 15)
    {
      y = y - moveY;
      
    }
    
  }  
  
  /* displays the oval */
  public abstract void display(Graphics g); 
  
  public void showIndex(Graphics g, int input)
  {
    g.setColor(Color.black);
    g.drawString(Integer.toString(input), x, y);
  }
  
}
