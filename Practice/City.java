import java.util.*;

public class City
{
	private int inhabitant;
	private String name;
	private int km;

	public City(int in, String nam, int k)
	{
		inhabitant = in;
		name = nam;
		km = k;
	}

	public City()
	{
		System.out.print("Create City");
		inhabitant = 0;
		name = "inconnu";
		km = 0;
	}

	int getKm()
	{
		return(km);
	}
	int getInhabitant()
	{
		return(inhabitant);
	}
	String getName()
	{
		return(name);
	}

	void setKm(int kmRequest)
	{
		km = kmRequest;
	}
	void setInhabitant(int inhabitantRequest)
	{
		inhabitant = inhabitantRequest;
	}
	void setName(String nameRequest)
	{
		name = nameRequest;
	}


}
