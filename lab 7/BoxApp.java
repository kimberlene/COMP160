public class BoxApp{
  
  public static void main(String args[]){
    Box box1 = new Box(); /** first instance of class Box */
    box1.setHeight(4);
    box1.setWidth(4);
    box1.setLength(6);
    System.out.println(box1.toString());
    
    Box box2 = new Box(3, 4, 5); /** second instance of class Box, displays details of cuboid */
    System.out.println(box2);
    
    Box box3 = new Box(5); /** third instance of class Box, displays details of cube */
    System.out.println(box3);
  }
}