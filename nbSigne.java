import java.util.*;

public class nbSigne
{
	public static void main(String[] argv)
	{
		int i;
		Scanner sc = new Scanner (System.in);
		System.out.print("enter a number !\nHere : ");
		i = sc.nextInt();
		if (i < 0)
		{
			System.out.print("it's a negative number");
		}
		else if ( i > 0)
		{
			System.out.print("it's a positive number");
		}
		else
			System.out.print("This number is null !");
	}
}
