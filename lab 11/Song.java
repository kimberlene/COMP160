/**lab 11
  * 22nd august 2016
  * Kimberlene Sharma
  * program to perform some functions 
  * param@ songLine used to store user inputed string
  **/
  
import java.lang.String;
public class Song{
  private String songLine;
  
  /** concstructor **/
  public Song(String songLine1){
    songLine = songLine1;
  }
  
  /**function to return string **/
  public String toString(){
    return songLine;
  }
  /**to make required changes to string **/
  public void process(){
    int i; // loop variable
    String songLine2; // to adda an extra space at the end of string to count number of words
    int word = 0; // word counter
    int length = songLine.length();
    System.out.println("Length is: " + length);
    System.out.println("Last character is: " + songLine.charAt(length -1));
    songLine2 = songLine + " ";
    for(i=0; i<length; i++){
      if(songLine2.charAt(i) == ' ')
        word++;
    }
    
    if(word >= 2){
      int first_space = songLine.indexOf(' ');
      int second_space = songLine.indexOf(' ', first_space + 1);
      System.out.println("first two word of string: " + songLine.substring(0, second_space));
      System.out.println("subsequent word of string: " + songLine.substring(second_space + 1, length));
      System.out.println("first letter of third word: " + songLine.charAt(second_space + 1));
    }
    System.out.println("upper case string: " + songLine.toUpperCase());
    System.out.println("spaces replaced with x: " + songLine.replace(' ', 'x'));
    int index = songLine.indexOf ('b');
    if(index == -1)
      System.out.println("b does not exist in string");  
    else
      System.out.println("Index of b: " + songLine.indexOf('b'));
    System.out.println(songLine);
    
  }
}