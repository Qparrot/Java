public class PlayWithBook
{
	public static void main(String[] args)
	{
		Book	book = new Book();
		Book	book2 = new Book(120, "gaga", 3);
		Book	book3 = new Book(100, "gago", 5);
		MasterPiece memoire_d_Hadrien = new MasterPiece(310, "Mémoire d'Hadrien", 5, "Marguerite Yourcenar");

		book.setNbPage(100);
		book.setRate(2);
		book.setName("tata"); 
		book.compare(book2);
		System.out.print(book3.description());
		System.out.print(memoire_d_Hadrien.description());
	}
}
