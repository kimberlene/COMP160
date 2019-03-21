/** lab 10
  * program to check if year is leap year or not
  * @param year is the year to be checked */

public class Leapyear{
  
   int year;
  
  /** to check if the year is leap year or not */
  public static void leapYear(int year){
    if(year >= 1582){
      if(year % 4 == 0){
        if ((year % 100 == 0 && year % 400 !=0)){
          System.out.println(year + ": is not a leap year");
        }
        else  
        {
          System.out.println(year + ": is a leap year");
        }    
       }
      else
      {
        System.out.println(year + ": is not a leap year");
      }
    }            
    else
    {
      System.out.println(year + ": predates the Georgian calender");
    }
  }
   
      public static void main (String args[]){
        leapYear(2014);
        leapYear(2016);
        leapYear(1900);
        leapYear(2000);
        leapYear(1565);
        
      }
}