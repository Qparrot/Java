import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Animal wolf = new Wolf("CrocBlanc");
		wolf.eat();
		Cat cat = new Cat("Mimine");
		cat.eat();
		System.out.println(cat.name);
		cat.hug();
	}
}
