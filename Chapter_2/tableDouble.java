import	java.util.*;

public class	tableDouble
{
	public static void main(String[] argv)
	{
		String doubleTab[][] = { {"toto", "tata", "tete", "tutu"}, {"1", "2", "3", "4"} };
		int i;
		int j;

		i = 0;
		j = 0;
		for (String sousTab[] : doubleTab)
		{
				System.out.println("La valeur de la nouvelle boucle est : " + sousTab[i]);
				i++;
		}
		j++;
	}
}
