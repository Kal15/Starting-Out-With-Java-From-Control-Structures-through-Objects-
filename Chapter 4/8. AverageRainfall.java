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
public class AverageRainfall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int years, inches, 
                totalMonths = 0, totalRainfall = 0;
        do
        {
            System.out.print("Enter the number of years: ");
            years = keyboard.nextInt();
        } while(years < 1);
        
        for(int year = 1; year <= years; year++)
        {
            for(int month = 1; month <= 12; month++)
            {
                do
                {
                    System.out.print("Enter the inches of rainfall for year "
                            + year + ", month " + month + ": ");
                    inches = keyboard.nextInt();
                } while(inches < 0);
                
                totalRainfall += inches;
            }
            totalMonths = years * 12;
        }
        double averageRainfall = totalRainfall/totalMonths;
        System.out.println("\nNumber of months: " + totalMonths 
                            + "\nTotal inches of Rainfall: " + totalRainfall 
                            + "\nAverage Rainfall per month: " + averageRainfall);
    }
    
}
