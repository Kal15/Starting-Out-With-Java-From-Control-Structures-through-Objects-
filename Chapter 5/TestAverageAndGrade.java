/**
 *
 * @author K
 */
import java.util.Scanner;
public class TestAverageAndGrade
{
	public static void main(String[] args)
	{
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the score for test #1: ");
     int test1 = keyboard.nextInt();
     System.out.println("Grade is: " + determineGrade(test1));
     System.out.print("Enter the score for test #2: ");
     int test2 = keyboard.nextInt();
     System.out.println("Grade is: " + determineGrade(test2));
     System.out.print("Enter the score for test #3: ");
     int test3 = keyboard.nextInt();
     System.out.println("Grade is: " + determineGrade(test3));
     System.out.print("Enter the score for test #4: ");
     int test4 = keyboard.nextInt();
     System.out.println("Grade is: " + determineGrade(test4));
     System.out.print("Enter the score for test #5: ");
     int test5 = keyboard.nextInt();
     System.out.println("Grade is: " + determineGrade(test5));
  }
	public static double calcAverage(int test1, int test2, int test3, int test4, int test5)
	{
		return (test1 + test2 + test3 + test4 + test5)/5;
	}
 
  public static char determineGrade(int test)
  {
    if(test > 100) return 'N';
    else if(test >= 90 && test <= 100) return 'A';
    else if(test >= 80) return 'B';
    else if(test >= 70) return 'C';
    else if(test >= 60) return 'D';
    else return 'F';
  }
}
