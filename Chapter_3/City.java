public class City
{
	private String	cityName;
	private String	countryName;
	private int 	citizenNumber;

	public City()
	{
		System.out.print("Création d'une ville !");
		cityName = "Inconnu";
		countryName = "Inconnu";
		citizenNumber = 0;
	}

	public City(String name, String country, int citizen)
	{
		System.out.print("Création de la ville : " + name);
		cityName = name;
		countryName = country;
		citizenNumber = citizen;
	}

	// ------ ACCESSEURS ------

	// Return the cityName
	public String getName()
	{
		return cityName;
	}

	// Return the countryName
	public String getCountryName()
	{
		return countryName;
	}

	// Return citizenNumber
	public int getCitizenNumber
	{
		return citizenNumber;
	}

	// ------ MUTATOR ------

	// Set the cityName
	public String setName(city)
	{
		cityName = city;
	}

	// Set the countryName
	public String setCountryName(country)
	{
		countryName = country;
	}

	// Set citizenNumber
	public int setCitizenNumber(int nbr)
	{
		citizenNumber = nbr;i
	}

}
