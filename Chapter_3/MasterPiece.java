public class MasterPiece extends Book
{
	private String author;

	public MasterPiece()
	{
		super();
		author = "Inconnu";
	}

	public MasterPiece(int nbPage, String name, int rate, String author)
	{
		super(nbPage, name, rate);
		this.author = author;
	}
	public String description()
	{
		String str = super.description() + this.author + " is the Author.\n";
		return str;
	}
}
