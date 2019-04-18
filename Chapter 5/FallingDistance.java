/**
 *
 * @author K
 */
public class FallingDistance
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
	{
		for(int time = 1; time <= 10; time++)
		{
			System.out.print("When the time is " + time + " second(s), ");
			System.out.println("distance is " + fallingDistance(time) + " meters");
		}
	 }

	public static double fallingDistance(double time)
	{
		return 0.5 * 9.8 * time * time;
	}

}
