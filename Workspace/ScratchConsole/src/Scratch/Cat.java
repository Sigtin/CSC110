package Scratch;

public class Cat {
	private boolean isCute;
	private String name;
	private String furColor;
	private int age;

	public static boolean annoy(String target) {
		return false;
	}
	
	public static int kill(String target) {
		return -1;
	}
	
	public static void sleep() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getFurColor() {
		return furColor;
	}
	
	public void setFurColor(String f) {
		furColor = f;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public boolean getIsCute() {
		return isCute;
	}
	
	public void setIsCute(boolean b) {
		isCute = b;
	}

}