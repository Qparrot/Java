public class Book
{
	private int	nbPage;
	private String	name;
	private int	rate;
	private char	categorie;
	public static int	nbInstance;
	private static int	nbInstanceBis;

	public Book()
	{
		nbPage = 0;
		name = "Inconnu";
		rate = 0;
		categorie = 0;
		nbInstance++;
		nbInstanceBis++;
	}

	public Book(int nb, String nm, int rank)
	{
		nbPage = nb;
		name = nm;
		rate = rank;
		nbInstance++;
		nbInstanceBis++;
	}

	public String getName()
	{
		return name;
	}

	public int getNbPage()
	{
		return nbPage;
	}

	public int getRate()
	{
		return rate;
	}

	public void setRate(int nb)
	{
		rate = nb;
	}

	public void setName(String nm)
	{
		name = nm;
	}

	public void setNbPage(int nPage)
	{
		nbPage = nPage;
	}

	public static int	getNbInstance()
	{
		return nbInstanceBis;
	}

	public void	compare(Book v2)
	{
		if (this.nbPage > v2.nbPage)
			System.out.print(this.getName() + " is bigger.\n");
		else
			System.out.print(this.getName() + " is smaller.\n");
	}

	public String	description()
	{
		String str = "This book is called " + this.getName() + ". It has " + this.getNbPage() + " pages. People rates it : " + this.getRate() +"/5.\n";
		return str;
	}
}
