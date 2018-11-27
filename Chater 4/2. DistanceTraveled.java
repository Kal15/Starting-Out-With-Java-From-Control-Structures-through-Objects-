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
public class DistanceTraveled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int speed, hours;
        do
        {
            System.out.print("Enter the speed in miles-per-hour: ");
            speed = keyboard.nextInt();
            System.out.print("Enter the number of hours traveled: ");   
            hours = keyboard.nextInt();
        }
        while(speed < 0 || hours < 1);
        
        System.out.println("Hour\tDistanceTraveled");
        System.out.println("---------------------------");
        for(int i = 1; i <= hours; i++)
        {
            System.out.println(i + "\t\t" + i * speed);
        }
    }
    
}
