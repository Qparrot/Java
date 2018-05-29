public class Capital extends City
{
	String monument;

	public Capital()
	{
		super();
		monument = "unknown";
	}

	public Capital(String nm, String cn, int nb, String monument)
	{
		super(nm, cn, nb);
		this.monument = monument;
	}

	public String description()
	{

		String str = super.description() + " And the monument is " + monument + ".";
		return str;
	}

	public String toString()
	{
		String str = super.description() + " And the monument is " + monument + ".";
		return str;
	}	
}
