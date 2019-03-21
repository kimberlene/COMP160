/** lab 9
  * program to check if child or student and display the booking
 */
public class Customer
{
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;

  /**Constructor to initialize variables   
    *@param nameIn To take the name of customer
    *@param age To take the age of person
    *@param studentIn to check if student or not
    */ 
  public Customer(String nameIn,int age,boolean studentIn)
  {
    name=nameIn;
    student=studentIn;
    child = age>=5 && age<=17;
  }
  
  /** returns nameof the person
    */ 
  public String getName()
  {
    return name;
  }
  /** Returns if customer is child or not
    */ 
  public  Boolean isChild()
  {
    return child;
    
  }
  /** Returns if customer is student or not
    */ 
  public Boolean isStudent()
  {
    return student;
  }
  /** Returns if ticket is confirmed
    */ 
  public boolean isBooked()
  {
    return booked;
  }
  /*To set the value of booked as true
   */ 
  public void setBooked()
  {
    booked=true;
}
}