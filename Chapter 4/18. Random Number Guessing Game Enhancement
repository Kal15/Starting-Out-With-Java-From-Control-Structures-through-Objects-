package ProgrammingChallenges4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author K
 */
public class RandomNumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);   
        int lower = rand.nextInt();
        int upper;
        do
        {
            upper = rand.nextInt();
        } while(upper < lower);
        int guess;
        int number;
        do {
            number = rand.nextInt();
        } while(number > upper || number < lower);
        System.out.println(number);
        int numberOfGuess = 0;
        do
        {
            System.out.print("Guess a number between " + lower + " and " + upper + ": ");
            guess = keyboard.nextInt();
            if(guess > number)
            {
                System.out.println("Too high, try again.");
            }
            if(guess < number)
            {
                System.out.println("Too low, try again.");
            }
            numberOfGuess++;
        } while(guess != number);
        System.out.println("You guessed correctly!");
        System.out.println("It took you " + numberOfGuess + " guess(es)!");
    }

}
