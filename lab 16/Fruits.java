/** LAB 16
  * part 1
  * Kimberlene Sharma
  * 7th September 2016
  * program to take 3 fruit names as input from user and store in an aray to perform functions on them
  * param @ fruits stores the fruits name in the array
  * param @ guess stores the users guess of fruit
  */

import java.util.Scanner;
public class Fruits{
  
  public static void main(String args[]){
    
    String [] fruits = new String [3];
    
    Scanner scan = new Scanner(System.in);
    int i = 0;
    String guess = " ";
    for( i=0; i<3; i++){
      System.out.println(" Enter the name of fruit " + (i+1));
      fruits [i] = scan.nextLine();
    }
    
    /* for-each loop to display the first two letters of fruit, input the guess and check if correct */
    for( String item : fruits){
      do{
        System.out.print("Guess which fruit I am? ");
        System.out.print(" " + item.substring(0,2) + "      " + item.length() + " letters ");
        guess = scan.nextLine();
        if( guess.equalsIgnoreCase(item))
          System.out.println("Correct");
        else
          System.out.println("Try Again");
        
      }while(!(guess.equalsIgnoreCase(item)));
      
    }
  }
}
