package basic;
import java.util.Scanner;
public class IfStatements {
  public static void main(String[] args) throws Exception {
    // 1. Get number as input, print whether the number is greater than 2
    /*
    Test Input:
      2
    Expected Output:
      false
      */
        
      /*int x =7;
    if (x>2){
      System.out.println("True");
      
    }
    */
    // 2. Get number as input, print whether the number is even
    /*
    Test Inputs:
      2
      3
    Expected Outputs:
      true
      false
    */
    /*double x = 2;
    double y = 3;
    if (x % 2 == 0){
      System.out.println("true");
    }
    if (y % 2 == 0){
      System.out.println("true");
    } else {
      System.out.println("false");
    }
    */
    // 3. Get 2 numbers as input, print whether the 2 numbers are equal to eachother
    /*
    Test Inputs:
      2
      3
      ...
      4
      4
    Expected Outputs:
      false
      ...
      true
    */
    
    
    Scanner myObj = new Scanner(System.in);
    int x = myObj.nextInt() ;
    int y = myObj.nextInt ();3
    if ( x == y){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}