package entities;

public class TaxPayer {
	
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, 
	double healthSpending,double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
		double monthSalary = getSalaryIncome()/12;
	
		if(monthSalary >= 3000.0 && monthSalary <=5000.00) {
			return getSalaryIncome() * 0.1;
		} else if (monthSalary > 5000.0) {
			return getSalaryIncome()*0.2;
		} else {
			return 0.0;
		}
	}
	
	public double servicesTax() {
			return getServicesIncome() * 0.15;
	}
	
	public double capitalTax() {
		return getCapitalIncome() * 0.2;
	}
	
	public double grossTax() {
		return salaryTax()+ servicesTax()+capitalTax();
	}
	
	public double taxRebate() {
		double totalExpenses = getHealthSpending() + getEducationSpending(); 
		double maxRebate = grossTax() * 0.3;
		
		if( totalExpenses < maxRebate) {
			return totalExpenses;
		} else {
			return maxRebate;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate();
	}

	@Override
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f%n", grossTax()) 
		+ "Abatimento: " + String.format("%.2f%n", taxRebate())
		+ "Imposto devido: " + String.format("%.2f%n", netTax());
	}
	
	
	
	
	
	

}
