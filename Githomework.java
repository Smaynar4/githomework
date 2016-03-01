/**
 * Group Memebers: 
 * Christian Torices
 * Stephen Maynard
 * 
 *
 * Homework 3: Git Hub Assignment
 * COSC 481W
 * 2/18/2016
 * 
 */
//package githomework;  // (┛◉Д◉)┛彡ǝsdᴉlɔƎ
import java.util.*;

public class Githomework {

    public static void main(String[] args) {
        display();
    }
     public static enum game {
        ROCK,
        PAPER,
        SCISSOR,
        LIZARD,
        SPOCK,
        QUIT,
        ERROR
    }

    public static boolean contains(String test) {
        for (game g : game.values()) {
            if (g.name().equals(test)) {
                return true;
            }
        }
       return false;
    }

    public static game input() {
         game temp = game.ERROR;
         Scanner keyboard = new Scanner(System.in);
         String str = keyboard.next().toUpperCase();
         if(contains(str))
             temp = game.valueOf(str);
         return temp;
    }

    public static void choice(game choice){
      Random rand = new Random();

        game aiChoice;
        aiChoice = game.values()[rand.nextInt(3)];

        switch(choice) {
            case ROCK:
                if(aiChoice == game.SCISSOR)
                    System.out.println("Win");
                else if(aiChoice == game.PAPER)
                    System.out.println("Lose");
                else if(aiChoice == game.ROCK)
                    System.out.println("Tie");

                break;
            case PAPER:
                if(aiChoice == game.ROCK)
                    System.out.println("Win");
                else if(aiChoice == game.SCISSOR)
                    System.out.println("Lose");
                else if(aiChoice == game.PAPER)
                    System.out.println("Tie");
                break;

            case SCISSOR:
                if(aiChoice == game.PAPER)
                    System.out.println("Win");
                else if(aiChoice == game.SCISSOR)
                    System.out.println("Tie");
                else if(aiChoice == game.ROCK)
                    System.out.println("Lose");
                break;

            case QUIT:
                System.exit(0);
                break;
            
            default:
                System.out.println("Nope not a option");
                break;
        }
        
    }

    public static void display(){
        game isDone;

        while(true){
            System.out.println("Rock Paper Scissor Lizard Spock");
            System.out.println("Menu:");
            System.out.println("Rock");
            System.out.println("Paper");
            System.out.println("Scissor");
            System.out.println("Quit\n");
            isDone = input();

            choice(isDone);
        }
    }
}
