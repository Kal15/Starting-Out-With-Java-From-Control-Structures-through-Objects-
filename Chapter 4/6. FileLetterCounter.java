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
public class FileLetterCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of a file: ");
        String str = keyboard.nextLine();
        File file = new File(str);
        
        System.out.print("Enter a character: ");
        char character = keyboard.next().charAt(0);
        
        int count = 0;
        
        Scanner inputFile = new Scanner(file);
        while(inputFile.hasNext())
        {
            
            String line = inputFile.nextLine();
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i) == character)
                {
                    count++;
                }
            }
        }
        inputFile.close();
        
        System.out.println("The character '" + character + "' appeared "
                + "in the file '" + str + "' " + count + " time(s).");
        
    }
    
}
