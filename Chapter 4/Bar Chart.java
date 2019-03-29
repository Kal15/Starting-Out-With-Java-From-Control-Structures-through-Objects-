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
public class BarChart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);        
        for(int store = 1; store <= 5; store++)
        {
            System.out.print("Enter today's sale for store " + store + ": ");
            int sales = keyboard.nextInt();
            System.out.print("Store " + store + ": ");
            int star = sales/100;
            for(int i = 0; i < star; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
