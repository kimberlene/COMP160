/** Lab 8
  * program calculates the sides of the triangle and its perimeter */
public class Triangle{
  String name;
  int p1x, p1y,p2x, p2y, p3x, p3y;
  
  public Triangle( int pt1x, int pt1y, int pt2x, int pt2y, int pt3x, int pt3y, String nameIn){
    p1x = pt1x;
    p1y = pt1y;
    p2x = pt2x;
    p2y = pt2y;
    p3x = pt3x;
    p3y = pt3y;
    name = nameIn;
  }
   
   /** calculates the sides of the triangle */
  /** @param x1 the first x coordinate, x2 the second x coordinate, y1 the first y coordinate, y2 the second y coordinate */
  private double calcSide (int x1, int y1, int x2, int y2){
    return Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));
  }
  
  /** calculates the perimeter of the triangle */
  public double getPerimeter(){
    return (calcSide(p1x, p1y, p2x, p2y) + calcSide(p2x, p2y, p3x, p3y) + calcSide(p3x, p3y, p1x, p1y));
  }
  
  /** returns the name of the triangle */
  /** param name the name of the triangle */
  public String getName(){
    return name;
  }
}