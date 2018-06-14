import java.util.*;

public class BuzzFizz2
{
	public static void main(String[] argv)
	{
		int i;

		i = 0;
		while (i < 100)
		{
			System.out.print(i + ":");
			if (i % 3 == 0)
				System.out.print("Fizz");
			if (i % 5 ==  0)
			       System.out.print("Buzz");
			System.out.println();
			i++;
		}
	}
}	
