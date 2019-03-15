package main;
public class Date{

	


	private int day;
	private int month;
	private int year;


	public Date(int day,int month,int year)
	{
		

		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String DateAsString()
	{
		String str;
		String s1="/";
	str=Integer.toString(day);
	str=str+s1+Integer.toString(month);
	str=str+s1+Integer.toString(year);
	return str;
	}
}