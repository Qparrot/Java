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
	public int getCitizenNumberi()
	{
		return citizenNumber;
	}

	// ------ MUTATOR ------

	// Set the cityName
	public void setName(String city)
	{
		cityName = city;
	}

	// Set the countryName
	public void setCountryName(String country)
	{
		countryName = country;
	}

	// Set citizenNumber
	public void setCitizenNumber(int nbr)
	{
		citizenNumber = nbr;
	}

	public String description()
	{
		String str = this.cityName + " is a city from " + this.countryName + ". It has " + this.citizenNumber + " citizen.";
		return str;
	}
	
	public String toString()
	{
		String str = this.cityName + " is a city from " + this.countryName + ". It has " + this.citizenNumber + " citizen.";
		return str;
	}
}
