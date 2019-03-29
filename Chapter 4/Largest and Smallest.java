/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingChallenges4;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class LargestAndSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = keyboard.nextInt();
        int largest = num;
        int smallest = num;
        while(num != -99)
        {
            System.out.print("Enter a number: "); 
            num = keyboard.nextInt();
            if(num > largest && num != -99)
            {
                largest = num;
            }
            if(num < smallest && num != -99)
            {
                smallest = num;
            }
        }
        System.out.println("You entered " + num + " to signal the end");
        System.out.println("The largest number entered is " + largest);
        System.out.println("The smallest number entered is " + smallest);
    }
    
}
