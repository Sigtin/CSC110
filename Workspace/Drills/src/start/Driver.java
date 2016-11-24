package start;

import drills.Employee;

public class Driver {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee a = new Employee("", "");
		Employee b = new Employee(null, null, 1);
		
		System.out.println(e.toString());
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
