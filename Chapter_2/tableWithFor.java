import java.util.*;

public class tableWithFor
{
	public static void main(String[] argv)
	{
		String tab[] = {"toto", "titi", "tutu", "tete", "tata"};
		int i;

		i = 0;
		/*
		** for each string (that we decided to call str), which are in tab, DO ...
		*/
		for(String str :tab)
			System.out.println(str);
		
		while(i != tab.length)
			System.out.println(tab[i++]);
	}
}
