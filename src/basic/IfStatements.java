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
        
      //My Question 1 answer
      
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
    
    
    //My Questions 2 Answers
    
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
    
    //Question 3 answers
    Scanner myObj = new Scanner(System.in);
    int x = myObj.nextInt() ;
    int y = myObj.nextInt ();
    if ( x == y){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}