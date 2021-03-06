package birthday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	private static int age;
	
	public static void main(String[] args) throws IOException {
		BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
		boolean isLooping = false;
		do{System.out.print("Please enter the four digits of the current year: ");
			String currentYear = readRacer.readLine();
			int year = Integer.parseInt(currentYear);
		
			int month;
		do{System.out.print("Please enter the current month as a value from 1 to 12 (ex. 1 is January): ");
			String currentMonth = readRacer.readLine();
			month = Integer.parseInt(currentMonth);
		}while(month <= 0 || month > 12);
		
		System.out.print("Please enter the number value for the current day: ");
			String currentDay = readRacer.readLine();
			int day = Integer.parseInt(currentDay);
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				while(day > 31 || day <= 0){
					System.out.print("Please enter the number value for the current day: ");
					currentDay = readRacer.readLine();
					day = Integer.parseInt(currentDay);
				}
				break;
			
			case 2:
				while(day > 28 || day <= 0){
					System.out.print("Please enter the number value for the current day: ");
					currentDay = readRacer.readLine();
					day = Integer.parseInt(currentDay);
				}
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				while(day > 30 || day <= 0){
					System.out.print("Please enter the number value for the current day: ");
					currentDay = readRacer.readLine();
					day = Integer.parseInt(currentDay);
				}
				break;
		}

			int birthYear;
		do{System.out.print("Please enter the four digits for your birth year: ");
			String userYear = readRacer.readLine();
			birthYear = Integer.parseInt(userYear);
			}while(birthYear > year);
		
			int birthMonth;
		do{System.out.print("Please enter your birth month as a value from 1 to 12 (ex. 1 is January): ");
			String userMonth = readRacer.readLine();
			birthMonth = Integer.parseInt(userMonth);
			}while(birthMonth > 12 || birthMonth <= 0);
		System.out.print("Please enter the number value for your birth day: ");
			String userDay = readRacer.readLine();
			int birthDay = Integer.parseInt(userDay);
			
		switch(birthMonth){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				while(birthDay > 31 || birthDay <= 0){
				System.out.print("Please enter the number value for your birth day: ");
				userDay = readRacer.readLine();
				birthDay = Integer.parseInt(userDay);
				}
				break;
		
			case 2:
				while(birthDay > 28 || birthDay <= 0){
				System.out.print("Please enter the number value for your birth day: ");
				userDay = readRacer.readLine();
				birthDay = Integer.parseInt(userDay);
				}
				break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				while(birthDay > 30 || birthDay <= 0){
				System.out.print("Please enter the number value for your birth day: ");
				userDay = readRacer.readLine();
				birthDay = Integer.parseInt(userDay);
				}
				break;
		}
		
		switch(month){
			case 1:
				System.out.println("Today is January " + day + ", " + year);
				break;
			case 2:
				System.out.println("Today is February " + day + ", " + year);
				break;
			case 3:
				System.out.println("Today is March " + day + ", " + year);
				break;
			case 4:
				System.out.println("Today is April " + day + ", " + year);
				break;
			case 5:
				System.out.println("Today is May " + day + ", " + year);
				break;
			case 6:
				System.out.println("Today is June " + day + ", " + year);
				break;
			case 7:
				System.out.println("Today is July " + day + ", " + year);
				break;
			case 8:
				System.out.println("Today is August " + day + ", " + year);
				break;
			case 9:
				System.out.println("Today is September " + day + ", " + year);
				break;
			case 10:
				System.out.println("Today is October " + day + ", " + year);
				break;
			case 11:
				System.out.println("Today is November " + day + ", " + year);
				break;
			case 12:
				System.out.println("Today is December " + day + ", " + year);
				break;
		}
		switch(birthMonth){
		case 1:
			System.out.println("Your birthday is January " + " " + birthDay + ", " + birthYear);
			break;
		case 2:
			System.out.println("Your birthday is February " + " " + birthDay + ", " + birthYear);
			break;
		case 3:
			System.out.println("Your birthday is March " + " " + birthDay + ", " + birthYear);
			break;
		case 4:
			System.out.println("Your birthday is April " + " " + birthDay + ", " + birthYear);
			break;
		case 5:
			System.out.println("Your birthday is May " + " " + birthDay + ", " + birthYear);
			break;
		case 6:
			System.out.println("Your birthday is June " + " " + birthDay + ", " + birthYear);
			break;
		case 7:
			System.out.println("Your birthday is July " + " " + birthDay + ", " + birthYear);
			break;
		case 8:
			System.out.println("Your birthday is August " + " " + birthDay + ", " + birthYear);
			break;
		case 9:
			System.out.println("Your birthday is September " + " " + birthDay + ", " + birthYear);
			break;
		case 10:
			System.out.println("Your birthday is October " + " " + birthDay + ", " + birthYear);
			break;
		case 11:
			System.out.println("Your birthday is November " + " " + birthDay + ", " + birthYear);
			break;
		case 12:
			System.out.println("Your birthday is December " + " " + birthDay + ", " + birthYear);
			break;
		}
		
		if(birthMonth > month){
			age = year - birthYear - 1;
		}else{
			age = year - birthYear;
		}
		
		System.out.println("You are " + age + " years old");
		
		if(age > 18){
			System.out.println("You are older than me");
		}else if(age < 18){
			System.out.println("You are younger than me");
		}else{
			System.out.println("You are the same age as me");
		}
		
		boolean isAsking = false;
		do{System.out.println("Press 1 to enter new data, press 2 to close the program");
		String response = readRacer.readLine();
		int userResponse = Integer.parseInt(response);
		if(userResponse == 1){
			isLooping = true;
		}else if(userResponse == 2){
			isLooping = false;
		}
		}while(isAsking);
		
	}while(isLooping);
		
	}
}
