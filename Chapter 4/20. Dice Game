/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProgrammingChallenges4;

import java.util.Random;

/**
 *
 * @author K
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int computer, user, c_count = 0, u_count = 0;
        for(int i = 1; i <= 10; i++)
        {
            computer = rand.nextInt(6) + 1;
            user = rand.nextInt(6) + 1;
            System.out.println("Game " + i + ":");
            System.out.println("-------");
            System.out.println("Computer rolled a " + computer);
            System.out.println("User rolled a " + user);
            if(computer > user)
            {
                System.out.println("Computer wins");
                c_count++;
            }
            else if(user > computer)
            {
                System.out.println("User wins");
                u_count++;                
            }
            else
            {
                System.out.println("It's a tie");
            }
            System.out.println("Computer won " + c_count + " time(s)");
            System.out.println("User won " + u_count + " time(s)");
            System.out.println("");
        }
        
        if(c_count > u_count)
        {
            
            System.out.println("Computer is the grand winner");
            
        }
        if(u_count > c_count)
        {
            System.out.println("User is the grand winner");
        }
    }

}
