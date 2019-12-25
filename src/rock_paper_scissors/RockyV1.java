package rock_paper_scissors;

//import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
//import java.util.*;



public class RockyV1{

  public static void main(String[] args) throws Exception {
    //Introduction
    
    System.out.println("Welcome to Wajjih's Rock Paper Scissors Game!");
    System.out.println("Enter and option to play.");
    System.out.println("Rock, Paper, Scissors");

    //Will create the Scanner and how to input those values to following destinations
    Scanner myobj = new Scanner(System.in);
            String Rock = "1";
            String Paper = "2";
            String Scissors = "3";
      String Response = myobj.next();
      Random answer = new Random(); 
      int Random = answer.nextInt(4); 
    
      if (Random == ){
        System.out.println("Draw");
      }  
      if (Random == 1 && Response == Paper){
        System.out.println("You lose");
        }else{
        System.out.println("You win");
      
        if (Random == 2 && Response == Scissors){
          System.out.println("You lose");
          }else{
          System.out.println("You win");
         
          if (Random == 3 && Response == Rock){
            System.out.println("You lose");
            }else{
            System.out.println("You win");
      } 
    } 
      
      } 
      


        
        









  }
}