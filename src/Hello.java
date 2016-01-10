import java.util.Random;

public class Hello
{
	
	public static void main(String[] args)
	{
		if (new Random().nextBoolean())
		{
			System.out.println("Hello Team!");
		}
		else
		{
			System.out.println("Hi, Team!");
		}
		
	}

}