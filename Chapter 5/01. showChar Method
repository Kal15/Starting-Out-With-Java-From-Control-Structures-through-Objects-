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
public class showCharMethod
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = keyboard.nextLine();
        System.out.println("Possible position numbers are between "
                + "0 and " + (str.length()-1));
        int pos;
        do
        {
            System.out.print("Enter an position number: ");
            pos = keyboard.nextInt();            
        } while(pos < 0 || pos >= str.length());
        showChar(str, pos);
    }

    public static void showChar(String obj, int position)
    {
        char c = obj.charAt(position);
        System.out.println(c);
        if(c == ' ')
        {  
            System.out.println("The character at position "
                    + position + " is a space");
        }
    }
}
