/** lab 11
  * kimberlene sharma
  * 22nd august
  * application class **/

import java.lang.String;
public class SongApp{
  public static void main(String args[]){
    Song song1 =             new Song("While my guitar gently weeps");
    System.out.println(song1.toString());
    song1.process();
    
    Song song2 = new Song("Let it be");
    System.out.println(song2.toString());
    song2.process();
    
    Song song3 = new Song("help");
    System.out.println(song3.toString());
    song3.process();
  }
}