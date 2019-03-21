import java.text.DecimalFormat;
public class TriangleApp{
  public static void main(String args[]){
    
    /** instanvcle of class for triangle A */
    Triangle a = new Triangle (0,3,3,4,1,9, "A"); 
    DecimalFormat fmt = new DecimalFormat("0.00");
    System.out.println(" Triangle " + (a.getName()) + " perimeter is: " + (fmt.format(a.getPerimeter())));
    
    
    Triangle b = new Triangle (4,2,9,4,6,7, "B");
    System.out.println(" Triangle " + (b.getName()) + " perimeter is: " + (fmt.format(b.getPerimeter())));
    
    
    Triangle c = new Triangle (0,5,8,4,5,9, "OWN TRIANGLE");
    System.out.println(" Triangle " + (c.getName()) + " perimeter is: " + (fmt.format(c.getPerimeter())));
    
    
    Triangle d = new Triangle (0,0,3,0,3,4, "TEST CASE");
    System.out.println(" Triangle " + (d.getName()) + " perimeter is: " + (fmt.format(d.getPerimeter())));
  }
}