/** lab 12 
  * 22nd august 2016
  * Kimberlene sharma
  * part2
  * to count vowels and consonants in a user inputed strin
  * param @ input to store user input
  * param @ i is the loop variable
  * param @ consonant_count to count total consonants
  * param @ vowel_count to count total vowel **/
  
import java.util.Scanner;
public class Vowels_consonants{
  public static void main(String args[]){
    
    String input;
    int i;
    int consonant_count = 0;
    int vowel_count = 0;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a String");
    input = scan.nextLine();
    
    String input1 = input.toUpperCase();
    
    for(i=0; i< input.length(); i++){
    char c = input1.charAt(i);
    if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
    switch(c){
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
       vowel_count++;
        break;
       
      default:
        consonant_count++;;
    }
    }
    }
    System.out.println("Sentence is: " + input);
    System.out.println("VowelCount: " + vowel_count);
    System.out.println("ConsonantCount: " + consonant_count);
        
    }
  }
