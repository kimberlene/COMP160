/** FilePanel.java
  * Lab 20, COMP160,  2016
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  private boolean check;
  private Color colour;
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    
    String fileName = "LongBadData.txt";
    int i = 0;
    
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
    
    try
    {
      Scanner fileScan = new Scanner (new File( fileName));
      
      while(fileScan.hasNextLine()&& count<=9)
      { 
        String inputLine = fileScan.nextLine();
        if(inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")) {
          
          Scanner scan1 = new Scanner(inputLine);
          
          int fill1 = scan1.nextInt();
          int colour1 = scan1.nextInt();
          int x = scan1.nextInt();
          int y = scan1.nextInt();
          int width = scan1.nextInt();
          int height = scan1.nextInt(); 
          
          
          if (fill1 == 1)
            check = true; // if true the rectangle is filled         
          if(fill1 == 0) 
            check = false; // if false rectangle is drawn
          
          if(colour1 == 1)
            colour = Color.red; // for red rectangle
          if(colour1 == 2)
            colour = Color.blue; // for blue rectangle
          if(colour1 == 3)
            colour = Color.green; // froe green rectangle
          
          System.out.print(inputLine);
          System.out.println();
          
          drawObjects[count] = new Rectangle(check, colour, x, y, width, height); // creates rectangle objects
          count++;
          
        }
      }
    } catch (FileNotFoundException e)
    {
      System.out.println("File not found. Check file name and location");
      System.exit(1);
    }
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
      
    } 
    
    
  }
}

