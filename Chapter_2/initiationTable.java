import java.util.*;

public class initiationTable
{
	public static void main(String[] argv)
	{
		int table[] = {0,1,2,3,4,5,6,7,8,9};
		int table1[] = new int[10];
		int table2[][] = { {1,3,5},{0,2,4} };
		char tableChar[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
		System.out.print("3 is in table and table2. I want to call them. 3 from the table : " + table[3] + "\nThank you !\n Is 3 from the family table2 here ? " + table2[0][1] + "\n");
		for (int i = 0; i < tableChar.length; i++)
		{
			System.out.print("\nAt the case " + i + " of the tablechar we have = " + tableChar[i]);
		}
	}
}
