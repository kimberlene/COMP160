/**
 Pie.java
 Provided for Part 2, Lab5, COMP160 2016 
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /** creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);
    }
    
    /** all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
      
      int X = 90;// x location
      int Y = 70;// y location
      int HEIGHT = 100;// height 
      int WIDTH = 100;// width
      int ARCANGLE = 45; // arc angle
      
      
      page.setColor(Color.red);
      page.fillArc(X+10,Y-5,WIDTH,HEIGHT,0,ARCANGLE);//red arc
        
       page.setColor(Color.blue);
      page.fillArc(X,Y,WIDTH,HEIGHT,45,ARCANGLE);//blue arc
      
      page.setColor(Color.green);
      page.fillArc(X,Y,WIDTH,HEIGHT,90,ARCANGLE);//green arc
      
      page.setColor(Color.yellow);
      page.fillArc(X,Y,WIDTH,HEIGHT,135,ARCANGLE);//yellow arc
      
      page.setColor(Color.pink);
      page.fillArc(X,Y,WIDTH,HEIGHT,180,ARCANGLE);//pink arc
      
      page.setColor(Color.black);
      page.fillArc(X,Y,WIDTH,HEIGHT,225,ARCANGLE);//black arc
      
      page.setColor(Color.cyan);
      page.fillArc(X,Y,WIDTH,HEIGHT,270,ARCANGLE);//cyan arc
      
      page.setColor(Color.orange);
      page.fillArc(X,Y,WIDTH,HEIGHT,315,ARCANGLE);//orange arc
      
        //your pie chart code goes here
        
    }
}
