/** LAB 16
  * part 2
  * Kimberlene Sharma
  * 7th September 2016
  * program to create an array and print the multiplication table
  * param @ tables is the array to store the multiplication table
 */
public class MultiplicationTable{
  
  public static void main(String args[]){
    
    int[][] tables = new int [12][12];
    
    for (int i=0; i<12; i++){
      for(int j=0; j<12; j++){
        tables[i][j] = (i+1)*(j+1);
        System.out.print(tables[i][j]+ "\t");
      }
      System.out.print("\n");
    }
  }
}
        