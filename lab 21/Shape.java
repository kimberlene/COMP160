/** lab 21
  * Kimberlene Sharma
  * Shape class creates a panel with several circles
  * 6thOctober 2016
  */
import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class Shape
{
  private int x;
  private int y;
  private int width;
  private int height;
  private Color colour;
  
  public int randomRange(int lo, int hi)
  {
//    Scanner sc = new Scanner(System.in);
    Random generator = new Random();
    
//    System.out.println("Enter lowest value");
//    lo = sc.nextInt();
//    System.out.println("Enter highest value");
//    hi = sc.nextInt();
    
    return generator.nextInt(hi-lo+1)+lo;// returns a random value within the range
  }
  
  /** constructor which sets up random values to the data fields */
  public Shape()
  {
    Random generator = new Random(); // gernerates random numbers
    width = randomRange(10, 30);//generator.nextInt(21) + 10;
    height = width;
    x = generator.nextInt(400 - width);
    y = generator.nextInt(400 - height);
    colour = new Color(generator.nextInt(255), generator.nextInt(255), generator.nextInt(255));
  }
  /* displays the oval */
  public void display( Graphics g) 
  {
    g.setColor(colour);
    g.fillOval(x, y, width, height);  
  }   
}