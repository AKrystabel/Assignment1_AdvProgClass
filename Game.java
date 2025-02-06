/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author anastasia
 */

import java.util.Scanner;

public class Game {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        // initialize the user1_score, user2_score, rolled_number and die_reader to be 0
        int user1_score = 0;
        int user2_score = 0;
        int rolled_number = 0;
        int die_reader = 0 ; 
        
        // creation of die object, die1 and die2
        Die die1 = new Die();
        Die die2 = new Die();
        
        // asks if user want to play. user is to enter 1 for yes and 0 for no
        // user input will be stored to input_play
        // the initial score for user 1 and user 2 is printed to show it starts from 0
        System.out.println("Do you want to play the game? 1 (yes) or 0 (no): ");
        int input_play = scanner.nextInt();
        System.out.printf("Initial Score: \nUser 1: %d, User 2: %d\n", user1_score, user2_score);
        
        // initial round, the program checks if the user inputs 1 (yes), if so it will proceed
        // with the game. If not, it will jump to printing the user scores directly
        if(input_play == 1){
            do{
                // start by asking what die the user wants to use to roll the number
                // it will then calculate the user score by adding the returned value 
                // from the method to the current user score
                System.out.println("User 1, which die would you like to use? (1 or 2): ");
                user1_score = user1_score + user_scoring(die1,die2,die_reader,rolled_number);
                System.out.println("Added to User 1 Account");

                System.out.println("User 2, which die would you like to use? (1 or 2): ");
                user2_score = user2_score + user_scoring(die1,die2,die_reader,rolled_number);
                System.out.println("Added to User 2 Account");

                // checking if the user still wants to play the game, input_play will be updated based on the input
                System.out.println("Do you want to continue playing the game? 1 (yes) or 0 (no): ");
                input_play = scanner.nextInt();

                //condition checking, for as long as the input_play is not 0, it will loop again
            }while(input_play !=0);
        }
        
        
        // prints out the scores for user 1 and user 2 respectively
        // compared which user's score is higher to determine the winner of the game
        System.out.printf("User 1 Score: %d \nUser 2 Score: %d\n", user1_score,user2_score);
        if(user1_score>user2_score){
            System.out.println("The winner is User 1!");
        }else if (user1_score == user2_score){
            System.out.println("It was a tie! No winners.");
        }else{
            System.out.println("The winner is User 2!");
        }
    }
  
    
    
    // method creation to roll the die, takes in Die object1 and Die object2, the die_reader which
    // is based on user input (hence why we are using scanner), the user's score, and the rolled number.
    // takes into account the die used (either die1 or die2) and stores the rolled number by the die 
    // to rolled_number, in which will then be returned from this method.
    public static int user_scoring(Die d1, Die d2, int die_reader, int rolled_number){
        die_reader = scanner.nextInt();
        if (die_reader == 1){
           rolled_number = d1.throw_die();
        }else{
            rolled_number = d2.throw_die();
        }
        System.out.println("The rolled number is: " + rolled_number);
        return rolled_number;
    
    }
    
}
