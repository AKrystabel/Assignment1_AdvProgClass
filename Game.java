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
    public static void main(String[] args) {
        // TODO code application logic here
        
        // initializing the scores of user 1 and 2 to be 0, as well as the rolled_number to be 0
        int user1_score = 0;
        int user2_score = 0;
        int rolled_number = 0;
        
        // creating new scannner object
        Scanner scanner = new Scanner(System.in);        
        
        // creating die1 and die2 object
        Die die1 = new Die();
        Die die2 = new Die();
        
        // asking if user wants to play the game, 1 for yes and 0 for no.
        // displays the initial scores, 0, for both users
        System.out.println("Do you want to play the game? 1 (yes) or 0 (no): ");
        int input_play = scanner.nextInt();
        System.out.printf("Initial Score, User 1: %d & User 2: %d\n", user1_score, user2_score);
        
        while(input_play != 0){
            do{
                System.out.println("User 1, which die would you like to use? (1 or 2): ");
                int die_reader = scanner.nextInt();
                if (die_reader == 1){
                    rolled_number = die1.throw_die();
                    user1_score = user1_score + rolled_number;
                    System.out.printf("The value from Die 1 is: %d\n", rolled_number);
                    System.out.printf("Added to User Account, Current Score: %d\n", user1_score);
                    System.out.println("User 2, which die would you like to use? (1 or 2): ");
                    die_reader = scanner.nextInt();
                    if (die_reader == 1){
                        rolled_number = die1.throw_die();
                        user2_score = user2_score + rolled_number;
                        System.out.printf("The value from Die 1 is: %d\n", rolled_number);
                        System.out.printf("Added to User Account, Current Score: %d\n", user2_score);
                    }else{
                        rolled_number = die2.throw_die();
                        user2_score = user2_score + rolled_number;
                        System.out.printf("The value from Die 2 is: %d\n", rolled_number);
                        System.out.printf("Added to User Account, Current Score: %d\n", user2_score);
                    }
                    System.out.println("Do you want to continue playing the game? 1 (yes) or 0 (no): ");
                    input_play = scanner.nextInt();
                }else{
                    rolled_number = die2.throw_die();
                    user1_score = user2_score + rolled_number;
                    System.out.printf("The value from Die 2 is: %d\n", rolled_number);
                    System.out.printf("Added to User Account, Current Score: %d\n", user1_score);
                    System.out.println("User 2, which die would you like to use? (1 or 2): ");
                    die_reader = scanner.nextInt();
                    if (die_reader == 1){
                        rolled_number = die1.throw_die();
                        user2_score = user2_score + rolled_number;
                        System.out.printf("The value from Die 1 is: %d\n", rolled_number);
                        System.out.printf("Added to User Account, Current Score: %d\n", user2_score);
                    }else{
                        rolled_number = die2.throw_die();
                        user2_score = user2_score + rolled_number;
                        System.out.printf("The value from Die 2 is: %d\n", rolled_number);
                        System.out.printf("Added to User Account, Current Score: %d\n", user2_score);
                    }
                    System.out.println("Do you want to continue playing the game? 1 (yes) or 0 (no): ");
                    input_play = scanner.nextInt();
                } 
            }while (input_play == 1);
        }
        
        System.out.printf("User 1 Score: %d \nUser 2 Score: %d\n", user1_score,user2_score);
        if(user1_score>user2_score){
            System.out.println("The winner is User 1!");
        }else if (user1_score == user2_score){
            System.out.println("It was a tie! No winners.");
        }else{
            System.out.println("The winner is User 2!");
        }
        
    }
    
    
}
