import java.util.Scanner;
/**Lab 4 COMP160 S2 2016
  * Kimberlene 26 july 2016
  */
// a simle program that converts the value of temperature in fahrenheit to celsius
import java.util.Scanner;
public class FahrenheitToCelsius{
  public static void main(String[]args){
    convertFToC();
    convertFToC();
    convertFToC();//calls the method three times for 3 conversions in temperatures
  }
  
  /** gets input from user representing fahrenheit and displays celsius equivalent*/
  public static void convertFToC(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any value in Fahrenheit temperature");
    double fahrenheit =0.0d;
    fahrenheit = scan.nextDouble();// assigns next double input from Scanner object
    
    System.out.println(fahrenheit + " degrees Farhenheit is "+ toCelsius(fahrenheit) + " degrees Celsius "); //step 4
  }
  
  
  /** calculates and returns the celsius equivalent of a double input parameter called fahrenheit*/
  public static double toCelsius(double fahr){
    double celsius = 0.0d;
    int BASE = 32;
    double CONVERSION_FACTOR = 9.0/ 5.0;
    celsius= (fahr - 32)/CONVERSION_FACTOR;//calculates the fahreheit temperature to celsius
    return celsius;
  }
}
