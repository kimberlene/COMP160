import java.awt.*;
public class MyFrameApp{
  public static void main(String args[]){
    MyFrame m1= new MyFrame ();//first instance of MyFrame
    m1.setSize(300,150);
    m1.setVisible(true);
    m1.setLocation(0,180);
    
    MyFrame m2= new MyFrame ();//second instance of MyFrame
    m2.setSize(400,200);
    m2.setVisible(true);
   
    m1.decorate(Color.pink,"KIM", 400);//to decorate the first instance of MyFrame
    m2.decorate(Color.yellow,"KIM", 100);//to decorate the second instance of MyFrame
  }
}