/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProgrammingChallenges5;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class PaintJobEstimator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rooms to be painted: ");
        int rooms = keyboard.nextInt();
        System.out.print("Enter the price of the paint per gallon: ");
        double price = keyboard.nextDouble();
        double sqfeet = 0;
        double totalWallSpace = 0;
        for(int i = 1; i <= rooms; i++)
        {
            System.out.print("Enter the square feet of wall space for room " + i + ": ");      
            sqfeet = keyboard.nextDouble();
            totalWallSpace += sqfeet;
        }
        int unit = (int) Math.ceil(totalWallSpace / 115);
        
        int gallons = Gallons(unit);
        int hours = Hours(unit);
        
        System.out.println("The number of gallons of paint required: " + gallons);
        System.out.println("The hours of labor required: " + hours);
        System.out.println("The cost of paint: " + PaintCost(price, gallons));
        System.out.println("The labor charges: $" + LaborCharges(hours));
        System.out.println("The total cost of the paint job: $" + (PaintCost(price, gallons) + LaborCharges(hours)));
        

    }
    
    private static int Gallons(int unit)
    {
        return 1 * unit;
    }
    
    private static int Hours(int unit)
    {
        return 8 * unit;
    }
    
    private static double PaintCost(double price, int gallons)
    {
        return price * gallons;
    }
    
    private static int LaborCharges(int hours)
    {
        return 18 * hours;
    }
}
