/*
 * This program will compute bonuses earned in a year by employees in an organization. 
 * There are three types of employees: workers, managers and executives. 
 * In addition to salary, all employees get a bonus as a percentage of their salary. 
 * This percentage is different for workers, managers and executives. 
 * Additionally, all managers get a fixed amount for travel expenses yearly
 * and all executives get a fixed amount for travel expenses and a set number of stock options yearly.
 * Each type of employee is represented by a class. 
 * The classes are named Worker, Manager and Executive and are described below in the implementation section.
 * Create three Worker, two Manager and 1 Executive objects. It puts all the objects in a single array.
 */
 
// TestEmployee.java
// Employee.java
// Worker.java
// Manager.java
// Executive.java

// TestEmployee.java


import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		String in, out, name, token;
		double salary, pctBonus, travelExpenses, bonus;
		Employee[] emp = new Employee[6];
		int empIndex = 0, optionsCount;
		
		for(int i = 0; i < 3; i++)
		{
			in = JOptionPane.showInputDialog("Enter Data");
			StringTokenizer stk = new StringTokenizer(in,",");
			name = stk.nextToken().trim();
			
			token = stk.nextToken().trim();
			salary = Double.parseDouble(token);
			
			token = stk.nextToken().trim();
			pctBonus = Double.parseDouble(token);
			
			emp[empIndex] = new Worker(name, salary, pctBonus);
			empIndex++;
			
		} // End of for loop
		
		for(int i = 0; i < 2; i++)
		{
			in = JOptionPane.showInputDialog("Enter Data");
			StringTokenizer stk = new StringTokenizer(in,",");
			name = stk.nextToken().trim();
			
			token = stk.nextToken().trim();
			salary = Double.parseDouble(token);
			
			token = stk.nextToken().trim();
			pctBonus = Double.parseDouble(token);
			
			token = stk.nextToken().trim();
			travelExpenses = Double.parseDouble(token);

			emp[empIndex] = new Manager(name, salary, pctBonus, travelExpenses);
			empIndex++;
			
		} // End of for loop
		
		for(int i = 0; i < 1; i++)
		{
			in = JOptionPane.showInputDialog("Enter Data");
			StringTokenizer stk = new StringTokenizer(in,",");
			name = stk.nextToken().trim();
			
			token = stk.nextToken().trim();
			salary = Double.parseDouble(token);
			
			token = stk.nextToken().trim();
			pctBonus = Double.parseDouble(token);
			
			token = stk.nextToken().trim();
			travelExpenses = Double.parseDouble(token);

			token = stk.nextToken().trim();
			optionsCount = Integer.parseInt(token);

			emp[empIndex] = new Executive(name, salary, pctBonus, travelExpenses, optionsCount);
			empIndex++;
			
		} // End of for loop
		
		out = "";
		
		// Polymorphic loop, compute bonus & build output 
		for(int i = 0; i < 6; i++) {
			bonus = emp[i].computeBonus();
			
			out+="Name: "+emp[i].getName()+"\n";
			out+="Salary: "+emp[i].getSalary()+"\n";
	
			if(emp[i] instanceof Worker){
				out+="Precent Bonus: "+((Worker)emp[i]).getPctBonus()+"\n";
				out+="Total Bonus: "+bonus+"\n";
				
			}
			if(emp[i] instanceof Manager){
				out+="Precent Bonus: "+((Worker)emp[i]).getPctBonus()+"\n";
				out+="Total Bonus: "+bonus+"\n";
				out+="Travel Expenses: "+((Manager)emp[i]).getTravelExpenses()+"\n";
			}
			if(emp[i] instanceof Executive){
				out+="Precent Bonus: "+((Worker)emp[i]).getPctBonus()+"\n";
				out+="Total Bonus: "+bonus+"\n";
				out+="Travel Expenses: "+((Manager)emp[i]).getTravelExpenses()+"\n";
				out+="Options Count: "+((Executive)emp[i]).getOptionsCount()+"\n";
			}
			// Display
			JOptionPane.showMessageDialog(null, out);
		} // End the for loop
	}
}

// Executive.java

public class Executive extends Employee {
	private double pctBouns;
	private double travelExpenses;
	private int optionsCount;
	
	public Executive(String name, double salary, double pctBouns, double travelExpenses, int optionsCount) {
		super(name, salary);
		this.pctBouns = pctBouns;
		this.travelExpenses = travelExpenses;
		this.optionsCount = optionsCount;
	}
	
	public double getPctBouns() {
		return pctBouns;
	}
	
	public double getTravelExpenses() {
		return travelExpenses;
	}
	
	public int getOptionsCount() {
		return optionsCount;
	}
	
	@Override
	public double computeBonus() {
		double bonus = (salary*pctBouns)+1000;
		return bonus;
	}
}

// Manager.java

public class Manager extends Employee {
	private double pctBouns;
	private double travelExpenses;
	
	public Manager(String name, double salary, double pctBouns, double travelExpenses) {
		super(name, salary);
		this.pctBouns = pctBouns;
		this.travelExpenses = travelExpenses;
	}
	public double getPctBouns() {
		return pctBouns;
	}
	public double getTravelExpenses() {
		return travelExpenses;
	}
	
	@Override
	public double computeBonus() {
		double bonus = (salary*pctBouns)+500;
		return bonus;
	}
	
}

// Worker.java

public class Worker extends Employee{
	private double pctBonus;

	public Worker(String name, double salary, double pctBonus) {
		super(name, salary);
		this.pctBonus = pctBonus;
	}
	
	public double getPctBonus() {
		return pctBonus;
	}
	
	@Override
	public double computeBonus() {
		double bouns = getSalary();
		return bouns;
	}
	
}
// Employee.java

public abstract class Employee {
	protected String name;
	protected double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public abstract double computeBonus();
	
}
