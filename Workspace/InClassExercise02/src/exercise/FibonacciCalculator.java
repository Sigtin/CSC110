package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciCalculator {
	
	private static BufferedReader readRacer = new BufferedReader(new InputStreamReader(System.in));
	private static int[] userArray;
	
	public static String prompt() throws IOException{
		System.out.print("Please enter a positive number: ");
		String userInput = readRacer.readLine();
		return userInput;
	}

	public static int[] array(String userInput){
		int userNum = Integer.parseInt(userInput);
		userArray = new int[userNum];
		return userArray;
	}

	public static void arrayPopulate(int[] userArray){
		if(userArray.length == 1){
			userArray[0] = 1;
		System.out.println(userArray[0]);
		}else if(userArray.length == 2){
			userArray[0] = 1;
			userArray[1] = 1;	
			System.out.println(userArray[0]);
			System.out.println(userArray[1]);
			}else{
				userArray[0] = 1;
				userArray[1] = 1;
				System.out.println(userArray[0]);
				System.out.println(userArray[1]);
				for(int i = 2; i < userArray.length; i++){
					userArray[i] = userArray[i-1]+userArray[i-2];
					System.out.println(userArray[i]);
				}
		}
	}
	public static void run() throws IOException{
		String input = prompt();
		int[] num = array(input);
		arrayPopulate(num);
	
	}
}
