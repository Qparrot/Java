import java.util.*;

class Desk extends Furniture
{
	protected int number;
	public Desk()
	{
		super();
		number = 0;
	}

	public Desk(int we, String na, String ma, String co, int nu)
	{
		super( we, na, ma, co);
		number = nu;
	}

	public String toString()
	{
			String str;
			str = name + " is made in " + color + " " + material + ". It's number is " + number + ".\n";
			return (str);
	}
}


