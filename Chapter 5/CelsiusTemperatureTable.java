/**
 *
 * @author K
 */

public class CelsiusTemperatureTable
{
	public static void main(String[] args)
	{
     System.out.println("F\tC");
     System.out.println("-\t-");
     for(int fahrenheit = 0; fahrenheit <= 20; fahrenheit++)
     {
       System.out.println(fahrenheit + "\t" + celsius(fahrenheit));
     }
  }
	public static float celsius(int fahrenheit)
	{
		return  (fahrenheit - 32) * 5.0f / 9.0f;
	}
}
