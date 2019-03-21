/** lab 16
  * Kimberlene Sharma
  * part 3
  * program to print average of row elements of array
  * param @ table is the array variable
  */

public class Average{
  public static void main(String args[]){
    
    int [] [] table = {{1,2,3}, {4,5,6}, {7,8}};
    
    int count = 0;
    double sum = 0;
    double average = 0.0;
    
    for ( int i=0; i<3; i++){
      sum = 0;
      count = 0;
      
      for(int j=0; j<table[i].length; j++){
        
        System.out.print(table[i][j] + " ");
        if((table[i][j]!=0))
          count++;
        sum = sum + table[i][j] ;
        
      }
      average = sum/count;
      System.out.print(" Average :  " + average + "\n");
      
    }
  }
}