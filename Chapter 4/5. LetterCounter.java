/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingChallenges;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class LetterCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        System.out.print("Enter a character: ");
        char character = keyboard.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == character)
            {
                count++;
            }
            
        }
        System.out.println("The character '" + character + "' appeared in"
                + " the string '" + str + "' " + count + " time(s).");
    }
    
}
