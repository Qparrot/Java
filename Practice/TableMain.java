import java.util.*;

public class TableMain
{
	public static void main(String[] args)
	{
/*		
**		Desk desk = new Desk( 9, "tableau", "wood", "black", 4314);
**		System.out.print(desk.name);
**		desk.name = "test";
**		System.out.print(desk.getName());
**		desk.number = 323;
**		System.out.print(desk.number);
*/
		Furniture[] furniture = new Furniture[6];

		for (int i = 0; i < 6; i++)
		{
			if (i % 2 == 0)
			{
				Desk D = new Desk(2, "Painting " + i, "wood", "Black", i);
				furniture[i] = D;
			}
			else
			{
				Furniture F = new Furniture(2, "Painting " + i, "concret", "Black");
				furniture[i] = F;
			}
		}
		
		for (Object item : furniture)
			System.out.print(item.toString());
	}
}
