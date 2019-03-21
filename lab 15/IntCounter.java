import java.util.Scanner;
import java.util.Random;

/** lab 15
  * Kimberlene Sharma
  * 6th September, 2016
  * program to find the occurance of a target number in an array
  * param @ numArray stores elements of array
  * para, @ target stores user inputed target number
  */

public class IntCounter{
  private int [] numArray;
  
  /** constructor */
  public IntCounter(int [] numArray){
    this.numArray  = numArray;
    for( Integer item : numArray){
      System.out.print(item);
      System.out.print(" ");
    }
    System.out.println(" Array is of length " + (numArray.length));
  }
  
  /** method to find and display the occurance of target */
  public void showTarget( int target){
    int i=0;
    int count =0;
    for(i=0; i<numArray.length; i++){
      if( numArray[i] == target){
        System.out.println( " There is a " + target + " in position " + i);
        count++;
      }
    }      
    if(count<1)
    System.out.println(" There are no " + target + "'s in the array ");
      
  }
}
