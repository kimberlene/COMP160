import java.util.Scanner;
import java.util.Random;

/** lab 15
  * Kimberlene Sharma 
  * Application class of IntCounter
  * 6th September 2016
  */
public class IntCounterApp{
static int[] numArray;

/** main method of application class which takes user input for targets*/
  public static void main(String args[]){
  
    Scanner scan = new Scanner(System.in);
    int k = 0;
    int target = 0;    
    for(k=0; k<=3; k++){
    System.out.println(" Enter target number ");
    target = scan.nextInt();
    IntCounter obj1 = new IntCounter(makeArray());
    obj1.showTarget(target);
    }
   }
  
  /* method to make an array of random length and fill elements randomly */
  public static int[] makeArray(){
    Random generator = new Random();
    int arrayLength = 0;
    arrayLength = (generator.nextInt(6) + 5);
    int [] numArray = new int[arrayLength];
    int j = 0;
    for(j=0; j<arrayLength; j++){
       numArray[j] = generator.nextInt(5);
    }
    return numArray;
   }
}
