package rock_paper_scissors;

//import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
//import java.util.*;



public class RockyV1{

  public static void main(String[] args){
    //Introduction
    
    System.out.println("Welcome to Wajjih's Rock Paper Scissors Game!");
    System.out.println("Enter and option to play.");
    System.out.println("Rock, Paper, Scissors");
    System.out.println("Choose 0 for Rock, 1 for Paper, and 2 for Scissors");

    //Will create the Scanner and how to input those values to following destinations
    Scanner user = new Scanner(System.in);
    int userMove= user.nextInt();
     
    if (userMove == 0){System.out.println("user: rock ");}
     if (userMove == 1){System.out.println("user: paper ");}
     if (userMove == 2){System.out.println("user: scissors ");}
     
     
     
     
     Random Computer = new Random(); 
      int computerMove = Computer.nextInt(4);
      
      if (computerMove==0){System.out.println("computer:rock ");}
        if (computerMove==1){System.out.println("computer:paper ");}
        if (computerMove==2){System.out.println("computer:scissors ");}
     

    
        if (userMove == computerMove){System.out.println("Draw");}
        if(userMove==0 && computerMove==1){System.out.println("You lose!");}
        if(userMove==0 && computerMove==2){System.out.println("You win! Congrats");}
        if(userMove==1 && computerMove==0){System.out.println("You win! Congrats");}
        if(userMove==1 && computerMove==2){System.out.println("You lose!");}
        if(userMove==2 && computerMove==0){System.out.println("You lose!");}
        if(userMove==2 && computerMove==1){System.out.println("You win! Congrats");} 
     
      
       
      


        
        








     }
  }
  
