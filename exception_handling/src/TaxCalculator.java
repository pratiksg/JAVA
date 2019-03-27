
public class TaxCalculator {
	
	private String employeeName;
	private boolean IsIndian;
	private double employeeSalary;
	private double taxAmount;
	public TaxCalculator() {
		super();
		
	}
	public TaxCalculator(String employeeName, boolean isIndian, double employeeSalary, double taxAmount) 
	throws ContryException,NameException{
		super();
		if(employeeName!=null && !employeeName.isEmpty())
		this.employeeName = employeeName;
		else
			throw new NameException("name is not valid exception");
		if(!IsIndian)
			throw new ContryException("country is not valid exception");
		this.IsIndian = isIndian;
		this.employeeSalary = employeeSalary;
		this.taxAmount = taxAmount;
	}
	
	public double CalculateTax(double EmployeeSalary) {
		if(employeeSalary >=100000) 
	System.out.println("salary is greater than 100000");
		else if(employeeSalary>= 50000 && employeeSalary<=10000) {
			
			
		}
		return EmployeeSalary;
	}
	

}
