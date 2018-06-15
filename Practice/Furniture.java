import java.util.*;

public class Furniture
{
	protected int weigth;
	protected String name;
	protected String material;
	protected String color;

	public Furniture()
	{
		weigth = 0;
		name ="unknown";
		material ="unknown";
		color ="unknown";
	}

	public Furniture(int we, String na, String ma, String co)
	{
		weigth = we;
		name = na;
		material = ma;
		color = co;
	}

	// GET
	public int getWeigth()
	{
		return(this.weigth);
	}

	public String getName()
	{
		return(this.name);
	}

	public String getMaterial()
	{
		return(this.material);
	}

	public String getColor()
	{
		return(this.color);
	}


	// SET
	public void setWeigth(int we)
	{
		this.weigth = we;
	}

	public void setName(String na)
	{
		this.name = na;
	}

	public void setMaterial(String ma)
	{
		this.material = ma;
	}

	public void setWeigth(String co)
	{
		this.color = co;
	}

	public String toString()
        {
                        String str;
                        str = name + " is made in " + color + " " + material + ".\n";
                        return (str);
        }
		
}

