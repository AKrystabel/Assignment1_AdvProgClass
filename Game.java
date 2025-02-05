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
        int user1_score = 0;
        int user2_score = 0;
        int rolled_number = 0;
        int die_reader = 0 ; 
        
        Scanner scanner = new Scanner(System.in); 
        
        Die die1 = new Die();
        Die die2 = new Die();
        
        System.out.println("Do you want to play the game? 1 (yes) or 0 (no): ");
        int input_play = scanner.nextInt();
        System.out.printf("Initial Score, User 1: %d & User 2: %d\n", user1_score, user2_score);
        
        
        do{
            user1_score = user1_scoring(die1,die2,die_reader,user1_score,rolled_number,scanner);
            user2_score = user2_scoring(die1,die2,die_reader,user2_score,rolled_number,scanner);
            System.out.println("Do you want to continue playing the game? 1 (yes) or 0 (no): ");
            input_play = scanner.nextInt();
        }while(input_play !=0);
        
        
        
        System.out.printf("User 1 Score: %d \nUser 2 Score: %d\n", user1_score,user2_score);
        if(user1_score>user2_score){
            System.out.println("The winner is User 1!");
        }else if (user1_score == user2_score){
            System.out.println("It was a tie! No winners.");
        }else{
            System.out.println("The winner is User 2!");
        }
    }
  
    
    public static int user1_scoring(Die d1, Die d2, int die_reader, int user1_score, int rolled_number, Scanner scanner){
        System.out.println("User 1, which die would you like to use? (1 or 2): ");
        die_reader = scanner.nextInt();
        if (die_reader == 1){
           rolled_number = d1.throw_die();
           user1_score = user1_score+rolled_number;
        }else{
            rolled_number = d2.throw_die();
            user1_score = user1_score + rolled_number;
        }
        System.out.println("The rolled number is: " + rolled_number);
        System.out.println("Added to User 1 Account");
        return user1_score;
    
    }
    
    public static int user2_scoring(Die d1, Die d2, int die_reader, int user2_score, int rolled_number, Scanner scanner){
        System.out.println("User 2, which die would you like to use? (1 or 2): ");
        die_reader = scanner.nextInt();
        if (die_reader == 1){
           rolled_number = d1.throw_die();
           user2_score = user2_score+rolled_number;
        }else{
            rolled_number = d2.throw_die();
            user2_score = user2_score + rolled_number;
        }
        System.out.println("The rolled number is: " + rolled_number);
        System.out.println("Added to User 2 Account");
        return user2_score;
    
    }
    
}
