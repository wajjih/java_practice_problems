package basic;

public class OtherExamples {
  public static void main(String[] args) throws Exception {
    // Write a Java program to compute the specified expressions and print the output.
    /*
    Test Data:
      ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output
      2.138888888888889
    */
  double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    // Write a Java program to compute a specified formula.
    /*
    Specified Formula :
    4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    Expected Output
    2.9760461760461765
    */
   double b = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
    // Write a Java program to print the area and perimeter of a circle.
    /*
    Test Data:
    Radius = 7.5
    Expected Output
    Perimeter is = 47.12388980384689
    Area is = 176.71458676442586
    */
   double Radius = 7.5;
     double p = Radius * 2 * 3.14; 
     double Area = 3.14 * Radius * Radius;
    // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    int[] arr = {3,6,9};
    int total = 0;
    for (int i = 0; i< arr.length; i++)
    total += arr[i];
        int average = total / arr.length;
    // Write a Java program to print the area and perimeter of a rectangle.
    /*
    Test Data:
      Width = 5.5 Height = 8.5

    Expected Output
      Area is 5.6 * 8.5 = 47.60
      Perimeter is 2 * (5.6 + 8.5) = 28.20
    */
    double W = 5.5;
    double H = 8.5;
    double Aa = W * H;
    double Perimeter = 2 * (W + H);

    // Write a Java program to print an American flag on the screen.
    /*
    Expected Output

* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
    */




    // Write a Java program to swap two variables.


    System.out.println(a);
    System.out.println(b);
    System.out.println(p);
    System.out.println(Area);
    System.out.println(average);
    System.out.println(Aa);
    System.out.println(Perimeter);
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");


  }
}