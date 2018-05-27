public class ClasseMain
{
	public static void main(String[] argv)
	{
		City city = new City();
		City Dijon = new City("Dijon", "France", 150_000);
		System.out.print( Dijon.cityName);
	}
}
