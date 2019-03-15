package main;
public class Country
{
	private String name;
	private long population;
	private long area;
	public Country()
	{
	}
	
	public Country(String name,long population,long area)
	{
		this.name=name;
		this.population=population;
		this.area=area;	

	}
	public Country countryWithTheLagestArea(Country country[])
	{	
		int index=0;
		long maxArea=country[0].area;

		for ( int i = 0; i < country.length; ++i )
     		{ 
       			if(maxArea < country[i].area)
			{
				maxArea=country[i].area;
				index=i;
			}
		}
		return country[index];
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}


	
	public void setPopulation(long population)
	{
		this.population=population;
	}
	public long getPopulation()
	{
		return population;
	}
	
	public void setArea(long area)
	{
		this.area=area;
	}
	public long getArea()
	{
		return area;
	}

}