/** lab 18
  * Kimberlene Sharma
  * 21st September 2016
  * Application class for TrafficLightsPanel containing the main method 
  **/
import javax.swing.JFrame;
public class TrafficApp{
  
  public static void main(String args[]){
    JFrame frame = new JFrame("Traffic Lights");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.getContentPane() .add( new TrafficLightPanel());
    
    frame.pack();
    frame.setVisible(true);
  }
}
