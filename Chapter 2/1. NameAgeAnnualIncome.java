/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingChallenges;
/*
1 . Name, Age, and Annual Income
Write a program that declares the following:
• a String variable named name
• an int variable named age
• a double variable named annualPay
Store your age, name, and desired annual income as literals in these variables. The program
should display these values on the screen in a manner similar to the following:
My name is Joe Mahoney, my age is 26 and
I hope to earn $100000.0 per year
*/
/**
 *
 * @author K
 */
public class NameAgeAnnualIncome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Joe Mahoney";
        int age = 26;
        double annualPay = 100000.0;
        
        System.out.println("My name is " + name +
                            ", my age is " + age +
                            " and I hope to earn $" + annualPay +
                            " per year");        
    }
    
}
