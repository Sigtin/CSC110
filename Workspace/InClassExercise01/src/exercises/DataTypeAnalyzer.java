package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataTypeAnalyzer {
	public static long num;
	public static void run() throws IOException{
		
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter a number: ");
		String userInput = readRacer.readLine();
		num = Long.parseLong(userInput);
		report();
	}
	
	public static void analyze(long num) throws IOException{
		if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE){
			System.out.println("The smallest data type that can hold this value is a byte");
		}else if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE){
			System.out.println("The smallest data type that can hold this value is a short");
		}else if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE && num >= Short.MIN_VALUE && num <= Short.MAX_VALUE && num <= Byte.MIN_VALUE && num >= Byte.MAX_VALUE ){
			System.out.println("The smallest data type that can hold this value is an int");
		}else if(num >= Long.MIN_VALUE && num <= Long.MAX_VALUE && num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE && num >= Short.MIN_VALUE && num <= Short.MAX_VALUE && num <= Byte.MIN_VALUE && num >= Byte.MAX_VALUE){
			System.out.println("The smallest data type that can hold this value is a long");
		}
	}
	
	public static void report() throws IOException{
		analyze(num);
		
	}
	
}
