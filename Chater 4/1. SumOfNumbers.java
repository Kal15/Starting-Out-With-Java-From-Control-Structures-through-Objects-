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
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a positive nonzero integer: ");
        int num = keyboard.nextInt();
        int sum = 0;
        for(int i = 0; i <= num; i++)
        {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
    
}
