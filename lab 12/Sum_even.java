/** lab 12
  * 22nd August
  * Kimberlene shrarma
  * part 1
  * to find sum of even numbers between 2 and user input
  * param @ input to store user input
  * param @ i is the loop variable
  * param @ sum to calculate sum of numbers
  **/

import java.util.Scanner;
public class Sum_even{
  public static void main(String args[]){
    
    int input; 
    int i; 
    int sum = 0;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter an integer greater than 2");
    input = scan.nextInt();
    
    if(input>2){
    for(i=2; i<=input; i++){
      if(i%2 == 0){
        sum = sum + i;
      }
    }
    }
    else
      System.out.println("Input value must not be less than 2");
    
    System.out.println("Sum of even numbers between 2 and " + input + " is: " + sum);
  }
}