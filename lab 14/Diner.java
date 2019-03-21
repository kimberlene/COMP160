/** lab 14
  * Kimberlene Sharma
  * 6th September 2016
  * progarm to use graphics
  * param @ x is the x coordinate
  * param @ y is the y coordinate
  * param @ name ids the name of the Diner
  * param @ seatNum is the location of the diner
  * param @ diameter is the constant diameter of each circle
  **/
import javax.swing.*;
import java.awt.*;

public class Diner{
  private int x;
  private int y;
  private String name;
  private Color colour;
  private int seatNum; 
  private final int diameter = 50;
  
  /** constructor */
  public Diner(int x1, int y1, String name1, int seatNum1, Color colour1){
    x = x1;
    y = y1;
    name = name1;
    seatNum = seatNum1; 
    colour = colour1;
  }
  /** to draw the graphics */
  public void draw (Graphics g){
    g.setColor(colour);
    g.fillOval(x, y, diameter, diameter);
    g.setColor(Color.black);
    g.setFont(new Font("Courier", Font.PLAIN, 9));
    g.drawString(name, x+11, y+25);
    g.setColor(Color.black);
    g.setFont(new Font("Courier", Font.BOLD, 6));
    g.drawString(Integer.toString(seatNum), (x+25), y);
    
  }
}