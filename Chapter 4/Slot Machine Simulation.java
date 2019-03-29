/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProgrammingChallenges4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author K
 */
public class SlotMachineSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again = "";
        do
        {
            System.out.print("Enter the amount of money into the slot machine: $");
            double money = keyboard.nextDouble();
            String word1 = "", word2 = "", word3 = "";
            Random rand = new Random();
            int random = 0;
            for(int i = 1; i <= 3; i++) {
                random = rand.nextInt(6);
                String word = "";
                switch(random) {
                    case 0:
                    word = "Cherries";
                    break;
                    case 1:
                    word = "Oranges";
                    break;
                    case 2:
                    word = "Plums";
                    break;
                    case 3:
                    word = "Bells";
                    break;
                    case 4:
                    word = "Melons";
                    break;
                    case 5:
                    word = "Bars";
                }
                if(i == 1) 
                {
                    word1 = word;
                    System.out.println(random + " : " + word1);
                }
                if(i == 2)
                {
                    word2 = word;
                    System.out.println(random + " : " + word2);
                }
                if(i == 3)
                {
                    word3 = word;
                    System.out.println(random + " : " + word3);
                }
            }
            if(word1.equals(word2) && word2.equals(word3))
            {
                System.out.println("You have won 3 times your money");
                money *= 3;

            }

            else if(word1.equals(word2) || word2.equals(word3) || word1.equals(word3))
            {
                System.out.println("You have won 2 times your money");
                money *= 2;
            }

            if(!(word1.equals(word2)) && !(word2.equals(word3)))
            {
                System.out.println("You have won $0");
            }
            System.out.println("Total: $" + money);
            System.out.print("Do you want to play again? (y/n): ");
            again = keyboard.next();
        } while(again.equalsIgnoreCase("y"));

    }

}
