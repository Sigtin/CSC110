package models;

public class Student {
	
	private final int studentId;
	private String name = "Unknown";
	private int age;
	
	/*
	 *Building a constructor (ctor) :
	 * - Visibility: Make is public
	 * - Return Type: The return type is implicit, declare nothing
	 * - Name: ctors are always named exactly the same as the class
	 * - Parameter List: same rules as a regular method
	 */
	
	/*
	 * Overloading methods:
	 * Same name
	 * Different parameter list
	 */
	
	public Student(String name, int age, int studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
				
	}
	
	public int getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		String retVal = getName() + ": " + "age " + getAge() + " (" + getStudentId() + ")";
		
		return retVal;
	}
}
