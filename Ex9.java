package uk.ac.cam.ahk44.oop.supo2;

import java.util.*;
import java.util.Random;

public class Ex9{
  public static class Hilo{
    String PlayerName;
    String CRSid;
    int GameDifficulty;
    int Score = 0;

    private Hilo(String A, String B, int C){
      this.PlayerName = A;
      this.CRSid = B;
      this.GameDifficulty = C;
    }

    private void play(int MaxNoGuess){
      Random rand = new Random();
      boolean b = false;
      int n = rand.nextInt(GameDifficulty * 10);
      while(MaxNoGuess-- > 0){
        int m = inputguess(GameDifficulty * 10);
        if(m == n){
          System.out.print("Correct\n");
          b = true;
          break;
        }
        if(m < n) System.out.print("Go higher\n");
        if(m > n) System.out.print("Go lower\n");
      }
      if(b) this.Score++;
      else System.out.print("Game Over\n");
    }

    private int getscore(){
      return this.Score;
    }
  }

  public static int inputguess(int maxi){
    Scanner sc = new Scanner(System.in);
    int a = -1;
    while(!(a >= 0 && a < maxi)){
      System.out.print("Guess a number... (Please enter a number between 0 and " + (maxi - 1) + ") ");
      a = sc.nextInt();
    }
    return a;
  }

  public static int inputdifficulty(){
    Scanner sc = new Scanner(System.in);
    int diff = 0;
    while(!(diff >= 1 && diff <= 10)){
      System.out.print("The game difficulty? (Please enter a number between 1-10) ");
      diff = sc.nextInt();
    }
    return diff;
  }

  public static int start(){
    Scanner sc = new Scanner(System.in);
    int a = -1;
    while(!(a >= 1 && a <= 5)){
      System.out.print("Please choose an option: (Enter a number between 1-5)\n");
      System.out.print("1. Start a new game.\n");
      System.out.print("2. What is my score?\n");
      System.out.print("3. Change the player\n");
      System.out.print("4. Change the difficulty\n");
      System.out.print("5. Finish\n");
      a = sc.nextInt();
    }
    return a;
  }


  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String PName = sc.nextLine();
      System.out.print("Enter your CRSid: ");
      String PCRSid = sc.nextLine();
      Hilo NewGame = new Hilo(PName, PCRSid, inputdifficulty());
      while(true){
        int s = start();
        if(s == 1){
          NewGame.play(10);
        }
        else if(s == 3){
          System.out.print("Enter your name: ");
          PName = sc.nextLine();
          System.out.print("Enter your CRSid: ");
          PCRSid = sc.nextLine();
          NewGame = new Hilo(PName, PCRSid, inputdifficulty());
        }
        else if(s == 2){
          System.out.print("Your score is: " + NewGame.getscore() + "\n");
        }
        else if(s == 4){
          NewGame = new Hilo(PName, PCRSid, inputdifficulty());
        }
        else if(s == 5){
          System.out.print("Thanks for playing :)");
          break;
        }
      }
  }
}
