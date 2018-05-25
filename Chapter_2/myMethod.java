import java.lang.*;

public class myMethod
{
	public static void main(String[] argv)
	{
		String tab[] = {"ta", "to", "tu"};

		readTab(tab);
		System.out.print(toString(tab));
	}
	

	public static double rounded(double A, int B)
	{
		return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}

	public static void readTab(String tab[])
	{
		int i;

		i = 0;
		while (i < tab.length)
		{
			System.out.print(tab[i]);
			i++;
		}
	}

	public static void readTab(int tab[])
	{
		int i;

		i = 0;
		while (i < tab.length)
		{
			System.out.print(tab[i]);
			i++;
		}
	}

	public static String toString(String tab[])
	{
		String total;

		total = "";
		for (String str : tab)
			total += str + " ";
		return total;
	}	
}
