import java.util.*;

public class PlayWithCity
{
	public static void main(String[] argv)
	{
		City tabCity[] = new City[3];



		for (int i = 0; i < 3; i++)
		{
			// Q? Why there is no overwriting ?
			City V = new City();
			tabCity[i] = V;
			tabCity[i].setInhabitant(i * 10_000 + 1);
			tabCity[i].setName("City n°" + i);
			tabCity[i].setKm(100 - i);
		}
		for (City item : tabCity)
			System.out.print(item.getName());
	}

}
