/**lab 7
  program to input values of the sides of a cuboid to
  calculate surface area and the volume 
  */
public class Box{
  
  int height ;
  int width;
  int length;
  
  /** first constructor */
  public Box() {}
  
  /** second constructor */
  public Box( int h, int w, int l){
    height = h; 
    width = w;
    length = l;
  }
  
  /** constructor for a cube version of the box*/
  public Box( int side){
    height = side;  
    width = side;
    length = side;
  }
  
  public void setHeight( int h){
    height = h;
  }
  public void setWidth( int w){
    width = w;
  }
  public void setLength( int l){
    length = l;
  }
  
  /** claculates the surface area */
  public int getSurfaceArea(){
    int surfaceArea = 2 * ((height*width) + (width*length) + (length*height)); 
    return surfaceArea;
  }
  
  /** calculates the volume */
  public int getVolume(){
   int volume = height*width*length;
    return volume;
  }
  
  public String toString(){
    return("Height is: "+ height+ ", Width is: "+ width+ ", Length is: "+ length+ ", Volume is: "+ getVolume()+ ", Surface Area is: "+ getSurfaceArea());
  }
}