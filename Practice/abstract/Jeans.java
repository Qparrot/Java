class Jeans extends Pantalon implements Vintage
{
	String material;

	public Jeans()
	{
		material = "cotton";
		cost = 100;
		color = "blue";
		brand = "Levis";
	}

	void toWear()
	{
		System.out.println( brand + material + color + cost);
	}

	void run()
	{
		System.out.println("frotte, frotte");
	}

	public void beHip()
	{
	}

	public void fashionShow()
	{
	}

}
