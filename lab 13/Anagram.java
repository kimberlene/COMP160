/** lab 13
  * Kimberlene Sharma
  * 5th September, 2016
  * program to input 2 phrases and check if anagrams
  * param @ input1 is the first user inputed phrase
  * param @ input2 is the second user inputed phrase **/


import java.lang.String;
import java.util.Scanner;

public class Anagram{
  
  int input1;
  int input2;
  
  //constructor
  Anagram (int input111, int input222){
    input1 = input111;
    input2 = input222;
  }
  
  public static void main(String args[]){
    
    int i = 0;
    char j = ' ';
    String input1_sorted = " ";
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the first phrase");
    String input1 = scan.nextLine();
    
    System.out.println("Enter the second phrase");
    String input2 = scan.nextLine();
    
    String input11 = input1.toLowerCase(); // to change all characters to upper case
    String input22 = input2.toLowerCase(); 
    
    // to sort the first phrase in order
    for(j='a'; j<='z'; j++){
      for(i=0; i<input11.length(); i++){
        if(input11.charAt(i)>='a' && input11.charAt(i)<='z'){
          if(input11.charAt(i) == j){
            input1_sorted = input1_sorted + j;
          }
        }
      }
    }
    
    int i1=0;
    char j1= ' ';
    String input2_sorted = " ";
    
    // to sort the second phrase in order
    for(j1='a'; j1<='z'; j1++){
      for(i1=0; i1<input2.length(); i1++){
        if(input22.charAt(i1)>='a' && input22.charAt(i1)<='z'){
          if(input22.charAt(i1) == j1){
            input2_sorted = input2_sorted + j1;
          }
        }
      }
    }
    // prints out appropriate message if phrases are anagrams or not
    if(input1_sorted.equals(input2_sorted)){
      System.out.println(input1_sorted + " are the letters of " + input1 + " in order ");
      System.out.println(input2_sorted + " are the letters of " + input2 + " in order ");
      System.out.println(input1 + " is an anagram of " + input2);
    }
    else 
      System.out.println(input1 + " is not an anagram of " + input2);
  }
}