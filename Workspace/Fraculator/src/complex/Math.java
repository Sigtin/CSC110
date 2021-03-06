package complex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math {

	public static void main(String[] args) throws IOException {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to the Fraculator");
		boolean isLooping = false;
		int userInput = 1;
		do{
			switch(userInput){
			case 1:	
				System.out.println("To reduce a fraction, press 2");
				System.out.println("To perform fraction math, press 3");
				System.out.println("To exit the program, press 4");
				String input = readRacer.readLine();
				userInput = Integer.parseInt(input);
				break;
			case 2: 
				System.out.print("Please enter an integer: ");
				input = readRacer.readLine();
				int integer = Integer.parseInt(input);
				System.out.print("Please enter a number for the numerator: ");
				input = readRacer.readLine();
				int numerator = Integer.parseInt(input);
				System.out.print("Please enter a number for the denominator: ");
				input = readRacer.readLine();
				int denominator = Integer.parseInt(input);
				System.out.print(integer + " " + numerator + "/" + denominator + " = ");
				while(numerator >= denominator){
					integer ++;
					numerator -= denominator;
				}
				for(int i = 2; i <= denominator; i++){
					while(denominator % i == 0 && numerator % i == 0){
						denominator /= i;
						numerator /= i;	
					}
				}double denominatorTwo = denominator;
				double numeratorTwo = numerator;		
				double decInt = integer + (numeratorTwo / denominatorTwo);
				System.out.println(integer + " " + numerator + "/" + denominator + " or " + decInt);
				System.out.println("To reduce a fraction, press 2");
				System.out.println("To perform fraction math, press 3");
				System.out.println("To exit the program, press 4");
				input = readRacer.readLine();
				userInput = Integer.parseInt(input);
				break;
			case 3:
				System.out.println("To perform fraction math, press 1");
				System.out.println("To go back to the main menu, press 2");
				System.out.println("To exit the program, press 3");
					input = readRacer.readLine();
					userInput = Integer.parseInt(input);
				switch(userInput){
				
				case 1: 
					System.out.print("Please enter an integer: ");
					input = readRacer.readLine();
					int integer2 = Integer.parseInt(input);
				System.out.print("Please enter a number for numerator one: ");
					input = readRacer.readLine();
					int numerator1 = Integer.parseInt(input);
				System.out.print("Please enter a number for denominator one: ");
					input = readRacer.readLine();
					int denominator1 = Integer.parseInt(input);
				System.out.print("Please enter an integer: ");
					input = readRacer.readLine();
					int integer3 = Integer.parseInt(input);
				System.out.print("Please enter a number for numerator two: ");
					input = readRacer.readLine();
					int numerator2 = Integer.parseInt(input);
				System.out.print("Please enter a number for denominator two: ");
					input = readRacer.readLine();
					int denominator2 = Integer.parseInt(input);
				System.out.print("Please enter the operator you wish to use: ");
					input = readRacer.readLine();
					char operator = input.charAt(0);
				
				if(operator == '+'){
					System.out.print(integer2 + " " + numerator1 + "/" + denominator1 + " + " + integer3 + " " + numerator2 + "/" + denominator2 + " = ");
					int numerator4 = numerator1 * denominator2;
					
					int numerator5 = numerator2 *denominator1;
					
					int numerator6 = numerator4 + numerator5;
					
					int denominator4 = denominator1 * denominator2;
					
					int integer4 = integer2 + integer3;
					
					
					while(numerator6 >= denominator4){
						integer4 ++;
						numerator6 -= denominator4;
						
					for(int i = 2; i <= denominator4; i++){
						while(denominator4 % i == 0 && numerator6 % i == 0){
							denominator4 /= i;
							numerator6 /= i;
					}
				
					}
					double denominatorOne = denominator1;
					
					double numeratorOne = numerator1;
					
					double denominatorThree = denominator2;
					
					double numeratorThree = numerator2;
					
					double decFrac = ((integer2) + (numeratorOne / denominatorOne)) + ((integer3) + (numeratorThree / denominatorThree));
					
					System.out.println(integer4 + " " + numerator6 + "/" + denominator4 + " or " + decFrac);
					
					System.out.println("To reduce a fraction, press 2");
					
					System.out.println("To perform fraction math, press 3");
					
					System.out.println("To exit the program, press 4");
					
					input = readRacer.readLine();
					userInput = Integer.parseInt(input);
					}
					
				}else if(operator == '-'){
					System.out.print(numerator1 + "/" + denominator1 + " - " + numerator2 + "/" + denominator2 + " = ");
					
					int numerator4 = numerator1 * denominator2;
					
					int numerator5 = numerator2 *denominator1;
					
					int numerator6 = numerator4 - numerator5;
					
					int denominator4 = denominator1 * denominator2;
					
					for(int i = 2; i <= denominator4; i++){
						while(denominator4 % i == 0 && numerator6 % i == 0){
							denominator4 /= i;
							numerator6 /= i;
						}
					}
					double denominatorOne = denominator1;
					
					double numeratorOne = numerator1;
					
					double denominatorThree = denominator2;
					
					double numeratorThree = numerator2;
					
					double decFrac = (numeratorOne / denominatorOne) - (numeratorThree / denominatorThree);
					
					System.out.println(numerator6 + "/" + denominator4 + " or " + decFrac);
					
					System.out.println("To reduce a fraction, press 2");
					
					System.out.println("To perform fraction math, press 3");
					
					System.out.println("To exit the program, press 4");
					
					input = readRacer.readLine();
					
					userInput = Integer.parseInt(input);
				}else if(operator == '*'){
					System.out.print(numerator1 + "/" + denominator1 + " * " + numerator2 + "/" + denominator2 + " = ");
					
					int numerator4 = numerator1 * numerator2;
					
					int denominator4 = denominator1 * denominator2;
					
					for(int i = 2; i <= denominator4; i++){
						while(denominator4 % i == 0 && numerator4 % i == 0){
							denominator4 /= i;
							numerator4 /= i;
						}
					}
					double denominatorOne = denominator1;
					
					double numeratorOne = numerator1;
					
					double denominatorThree = denominator2;
					
					double numeratorThree = numerator2;
					
					double decFrac = (numeratorOne / denominatorOne) * (numeratorThree / denominatorThree);
					
					System.out.println(numerator4 + "/" + denominator4 + " or " + decFrac);
					
					System.out.println("To reduce a fraction, press 2");
					
					System.out.println("To perform fraction math, press 3");
					
					System.out.println("To exit the program, press 4");
					
					input = readRacer.readLine();
					
					userInput = Integer.parseInt(input);
				}else if(operator == '/'){
					System.out.print(numerator1 + "/" + denominator1 + " / " + numerator2 + "/" + denominator2 + " = ");
					
					int numerator4 = numerator1 * denominator2;
					
					int denominator4 = denominator1 * numerator2;
					
					for(int i = 2; i <= denominator4; i++){
						while(denominator4 % i == 0 && numerator4 % i == 0){
							denominator4 /= i;
							numerator4 /= i;
						}
					}
					double denominatorOne = denominator1;
					
					double numeratorOne = numerator1;
					
					double denominatorThree = denominator2;
					
					double numeratorThree = numerator2;
					
					double decFrac = (numeratorOne / denominatorOne) / (numeratorThree / denominatorThree);
					
					System.out.println(numerator4 + "/" + denominator4 + " or " + decFrac);
					
					System.out.println("To reduce a fraction, press 2");
					
					System.out.println("To perform fraction math, press 3");
					
					System.out.println("To exit the program, press 4");
					
					input = readRacer.readLine();
					
					userInput = Integer.parseInt(input);
				}
				
					break;
					
				case 2:
					
					break;
				case 3:
					System.exit(0);
					break;
				}
				
				
			case 4:
				System.exit(0);
				break;
			}
			
		}while(!isLooping);

	}

}
