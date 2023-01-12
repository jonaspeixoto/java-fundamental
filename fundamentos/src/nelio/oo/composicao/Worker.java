package nelio.oo.composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkedLevel level;
	private double baseSalary;
	
	
	private Departments departments;
	private List<HoursContracts> contracts = new ArrayList<>();
	
	
	public Worker() {
		
	}


	public Worker(String name, WorkedLevel level, double baseSalary, Departments departments) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departments = departments;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkedLevel getLevel() {
		return level;
	}


	public void setLevel(WorkedLevel level) {
		this.level = level;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Departments getDepartments() {
		return departments;
	}


	public void setDepartments(Departments departments) {
		this.departments = departments;
	}


	public List<HoursContracts> getContracts() {
		return contracts;
	}

	
	public void addContract(HoursContracts contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HoursContracts contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar call = Calendar.getInstance();
		for(HoursContracts c : contracts) {
			call.setTime(c.getDate());
			int c_year = call.get(Calendar.YEAR);
			int c_month =  1 + call.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();				
			}
		}
		return sum;
	}
	
}
