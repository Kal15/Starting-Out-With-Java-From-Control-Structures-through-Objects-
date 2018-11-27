/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingChallenges;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author K
 */
public class DistanceFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        File file = new File("data.txt");
        PrintWriter outputFile = new PrintWriter(file);
        int speed, hours;
        do
        {
            System.out.print("Enter the speed in miles-per-hour: ");
            speed = keyboard.nextInt();
            System.out.print("Enter the number of hours travelled: ");   
            hours = keyboard.nextInt();
        }
        while(speed < 0 || hours < 1);
        outputFile.println("Hour\tDistanceTravelled");
        outputFile.println("---------------------------");
        for(int i = 1; i <= hours; i++)
        {
            outputFile.println(i + "\t\t" + i * speed);
        }
        outputFile.close();
    }
    
}
