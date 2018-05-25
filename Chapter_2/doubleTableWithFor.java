public class doubleTableWithFor
{
	public static void main(String[] argv)
	{
		String doubleTab[][] ={ { "tutu", "toto", "tata"}, {"1", "2", "3"} };
		int i;
		
		/*
		** ORDER: For each String's table include in the table's table called doubleTab	DO ...
		*/
		for (String tab[] : doubleTab)
		{
			i = 0;
			while(i < tab.length)
			{
				System.out.print(tab[i]);
				i++;
			}
		}
	}
}
