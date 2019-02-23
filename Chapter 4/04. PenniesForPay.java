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
public class PenniesForPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int days, pennies = 1;
        do
        {
            System.out.print("Enter the number of days worked: ");
            days = keyboard.nextInt();
        }
        while(days < 1);
        System.out.println("Days\tPennies Earned");
        System.out.println("---------------------------");
        for(int i = 1; i <= days; i++)
        {
            System.out.println(i + "\t\t" + pennies);
            pennies *= 2;
            
        }
    }
    
}
