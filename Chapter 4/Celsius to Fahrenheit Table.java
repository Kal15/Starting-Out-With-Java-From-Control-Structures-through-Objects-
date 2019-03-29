package ProgrammingChallenges4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K
 */
public class CelsiusToFahrenheitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");
        System.out.println("-------\t----------");
        for(int C = 0; C <= 20; C++)
        {
            System.out.println(C + "\t" + (((double)9/5*C) + 32));
        }
    }

}
