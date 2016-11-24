package drills;

public class Employee {

	/*
	 * This drill will require you to change the name of both this class and
	 * this file (Java requires that the file and class have the same name).
	 * 
	 * Change the class (and file name) to Employee Every employee has a unique
	 * numeric id, a first name, last name, and annual salary - The id MUST be
	 * automatically assigned. Every new employee simply gets the next available
	 * id. So, the first employee has an id of 1, the second has an id of 2, and
	 * so on. This should be managed entirely by the Employee class. - Once
	 * assigned, the id must NEVER be able to change - First and last names can
	 * never be null, nor empty - In the absence of a valid first name, the
	 * value stored should be "[Unknown]" - In the absence of a valid last name,
	 * the value stored should be "[Unknown]" - Annual salary is never lower
	 * than 28,000 per year, but may be any dollar value above that, like
	 * 29,347.62 for example Create a constructor that takes in no parameters
	 * Create a constructor that takes in first and last names Create a
	 * constructor that takes in first name, last name, and annual salary - ALL
	 * constructors must assign all data appropriately Add getters and setters
	 * per field as appropriate
	 */

	private final int id;
	private static int tempId;
	private String firstName;
	private String lastName;
	private double annualSalary = 28000;

	public Employee() {
		tempId += 1;
		id = tempId;
		firstName = "[Unknown]";
		lastName = "[Unknown]";
		annualSalary = 28000;
	}

	public Employee(String firstName, String lastName) {
		tempId += 1;
		id = tempId;
		setFirstName(firstName);
		setLastName(lastName);
		annualSalary = 28000;
	}

	public Employee(String firstName, String lastName, double annualSalary) {
		tempId += 1;
		id = tempId;
		setFirstName(firstName);
		setLastName(lastName);
		setAnnualSalary(annualSalary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty()) {
			this.firstName = "[Unknown]";
		} else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty()) {
			this.lastName = "[Unknown]";
		} else {
			this.lastName = lastName;
		}
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		if(annualSalary <= 28000) {
			this.annualSalary = 28000;
		} else {
			this.annualSalary = annualSalary;
		}

	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		String retVal = "Name: " + getFirstName() + " " + getLastName() + "\n" 
				+ "Id Number: " + getId() + "\n" 
				+ "Annual Salary: " + getAnnualSalary();
		
		return retVal;
	}

}
