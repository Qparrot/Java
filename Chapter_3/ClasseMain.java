public class ClasseMain
{
	public static void main(String[] argv)
	{
		int i;		
		String[] tab = { "Lyon", "Cannes", "Malaga", "Genes", "numéa", "Athenes"};
		City[] city = new City[6];
		int[] nb = { 3, 6, 9, 30, 1110, 23 };
		City city1 = new City();
		City dijon = new City("Dijon", "France", 150_000);
		System.out.print(dijon.description());
		Capital paris = new Capital("Paris", "France", 150_000, "Tour Eiffel");
		System.out.print(paris.description());
		i = 0;		
		
		while (i < 6)
		{
			if (i < 3)
			{
				City V = new City(tab[i], "France", nb[i]);
				city[i] = V;
			}
			else
			{
				Capital C = new Capital(tab[i], "France", nb[i], "pont");
				city[i] = C;
			}
			i++;
		}
		i = 0;
		while ( i < 6)
		{
			System.out.println(city[i].description());
			i++;
		}

		for(Object obj : city)
		{
			System.out.println(obj.toString());
		}
	}
}
