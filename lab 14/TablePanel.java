import javax.swing.*;
import java.awt.*;

/** lab 14
  * Kimberlene Sharma 
  * 6th September, 2016
  **/

public class TablePanel extends JPanel {
  private Diner diner1, diner2, diner3, diner4, diner5, diner6;
  
  /** constructor creates 6 Diner objects sending them required values */
  public TablePanel(){
    diner1 = new Diner(165,30,"David",1, Color.blue);
    diner2 = new Diner(220,90,"Clare",2,Color.pink);
    diner3 = new Diner(220,150,"Michael",3,Color.blue);
    diner4 = new Diner(165,210,"Metiria",4,Color.pink);
    diner5 = new Diner(110,90,"Todd",5,Color.blue);
    diner6 = new Diner(110,150,"Jacqui",6,Color.pink);
    setPreferredSize(new Dimension(400,300));
    setBackground(Color.cyan);
  }
  
  /** paint component that draws panel of required size, calls the draw method of the Diner objects and draws the table */
  public void paintComponent( Graphics g){
    super.paintComponent(g);
    diner1.draw(g);
    diner2.draw(g);
    diner3.draw(g);
    diner4.draw(g);
    diner5.draw(g);
    diner6.draw(g);
    g.fillRect(170,95,40,100);
  }
  
}
