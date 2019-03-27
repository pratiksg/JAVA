import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {
	private int day;
	private int month;
	private double year;

	
	public MyDate() {
		super();
		
	}
	static MyDate d = new MyDate();

	public MyDate(int day, int month, double year)throws InvalidDayException,InvalidMonthException {
		super();
		this.day = day;
		this.month = month;
		this.year = year;

		
	
	}
	
	 public static boolean isValidDate(int day, String month) 
	    { 
	        String regex = "^(1[0-2]|0[1-9])/(3[01]"
	                       + "|[12][0-9]|0[1-9])/[0-9]{4}$"; 
	        Pattern pattern = Pattern.compile(regex); 
	        Matcher matcher = pattern.matcher((CharSequence)d); 
	        return matcher.matches(); 
	    }

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getYear() {
		return year;
	}

	public void setYear(double year) {
		this.year = year;
	} 
	
	
	
	
	
}
