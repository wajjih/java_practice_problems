package basic;
// https://www.geeksforgeeks.org/generating-random-numbers-in-java/
// https://www.geeksforgeeks.org/java-math-random-method-examples/
// https://www.geeksforgeeks.org/random-setseed-method-in-java-with-examples/

// use these links to learn more about random numbers
//import java.lang.Math;
import java.util.Random;
//import java.util.Scanner;
//import java.util.*;

// hint
// use Math library for now

public class RandomNumbers {
  public static void testProblem() {
    System.out.println("Do you believe in me?");
  }
  public static void main(String[] args) throws Exception {
    testProblem();

    // 1. Generate a random number and print to screen.
   
   
   //My QUestion 1 Answers 
   
    /* Random rando = new Random();
    int rand_int1 = rando.nextInt(1000); 

    System.out.println(rand_int1);
    */

    // 2. Generate a random number between 1 and 3. print that number.
    
    //My Question 2 answers
    
    /*int max = 3;
    int min = 1;
    int range = max - min + 1;
    for (int i = 0; i < 10; i++) { 
      int rand = (int)(Math.random() * range) + min; 
    System.out.println(rand);
    }
    */
    // 3. Mental Health Therapist program:
    // Ask usere for their name?
    // random print "I believe in you!" or "You suck!"
    
    
    // My Question 3 answers 
    
    /*System.out.println("Enter Name");
    Scanner myObj = new Scanner(System.in);
    String username = myObj.next();
    Random answer = new Random();
   int randInt2 = answer.nextInt(2); 
   System.out.println("Username : " + username); 
   if (randInt2==0){
      System.out.println("I believe in you!");
    }else{
      System.out.println("You suck!");
    }
   */
   


   // 4. Get user input, print matching string to number
    // 1 -> "rock", 2 -> "paper", 3 -> "scissors"
    
  // My Question 4 answers
    
    /*
    Scanner myObj = new Scanner(System.in);
    int x = 1;
    int y = 2;
    int z = 3;
    int re = myObj.nextInt();
    if (re == x){
      System.out.println("Rock");
    }
    if (re == y){
      System.out.println("Paper");
    }
    if (re == z){
      System.out.println("Scissor");
    }
    */


    
    // 5. Set a seed "seed value".
    // Randomly generate a number.
    // Run program 4 times to ensure that it generates the same number each time.
    
    //My Question 5 answers
    
    Random r = new Random();
    int yurr = 2;
    r.setSeed(yurr);
   System.out.println(yurr);
   System.out.println(yurr);
   System.out.println(yurr);
   System.out.println(yurr);



    

  }
}
