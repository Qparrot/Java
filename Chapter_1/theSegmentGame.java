import java.util.*;

public class theSegmentGame
{
	public static void main (String[] argc)
	{
		Scanner sc = new Scanner (System.in);
		int bottom;
		int top;
		int i;
		int j;
		char reponse;

		j = 0;
		reponse = 'Y';
		while ( reponse == 'Y')
		{
			if (j == 0)
				System.out.print("\n\n\rWelcome in the Segment Game!\n\n");
			else if (j == 1)
				System.out.print("\n\n\rYou like to play this game ! It is your " + j + "st game.\n\n");
			else if (j == 2)
				System.out.print("\n\n\rYou like to play this game ! It is your " + j + "nd game.\n\n");		
			else if (j == 3)
				System.out.print("\n\n\rYou like to play this game ! It is your " + j + "rd game.\n\n");
			else if (j > 3)
				System.out.print("\n\n\rStop this game !! You have been playing too long !\n\n");
			System.out.print("Please, enter the segment's bottom !\nHere : ");
			bottom = sc.nextInt();
			System.out.print("Please, enter the segment's top !\nHere : ");
			top = sc.nextInt();
			System.out.print("Please, Ask your friend to give a number\nHere : ");
			i = sc.nextInt();
			if (i <= top && i >= bottom)
				System.out.print("\n\tBravo, the number is inside the interval !\n");
			else
				System.out.print("\n\tSorry, it's not in the segment ...\n");
			sc.nextLine();
			reponse = ' ';
			while (reponse != 'Y' && reponse != 'N')
			{
				System.out.print("\nDo you want to play again ? insert Y for Yes -or- N for No!\nHere : ");
				reponse = sc.nextLine().charAt(0);
			}
			j++;
		}
			System.out.print("Bye ...");
	}
}
