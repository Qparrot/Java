import java.util.*;

public class insideTable
{
	public static void main(String[] argv)
	{
		int	i;
		char	y;
		char	test;
		char 	tab[] = { 'a', 'b', 'c', 'd', 'e' };
		Scanner sc = new Scanner(System.in);

		y = 'Y';
		while (y == 'Y')
		{
			i = 0;
			System.out.print("Enter a small cap letter.\nHere : ");
			test = sc.nextLine().charAt(0);
			while (i < tab.length && test != tab[i])
				i++;
			if (i != tab.length && test == tab[i])
				System.out.print("Bravo. the letter is inside the table !\n");
			else
				System.out.print("Sorry. The letter isn't in the table !\n");
			y = 'A';
			while (y != 'Y' && y != 'N')
			{
				System.out.print("Do you want to try again ? (Y/N)\n");
				y = sc.nextLine().charAt(0);
			}
		}
		System.out.print("GoodBye !\n");
	}
}
