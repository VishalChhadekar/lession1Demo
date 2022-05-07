package lession1Demo;

import java.util.*;

class Calculator{
	
	//method to perform operations
	public void Operations(int num1, int num2, int operation) {

		if(operation == 1) {
			System.out.println("Addition of numbers is: "+(num1+num2));
		}
		else if(operation == 2) {
			System.out.println("Subtraction of numbers is: "+(num1-num2));
		}
		else if(operation == 3) {
			System.out.println("Multiplication of numbers is: "+(num1*num2));
		}
		else if(operation == 4) {
			System.out.println("Division of numbers is: "+(float)((float)num1/(float)num2));//type conversion to get exact value
		}
		else if(operation == 5) {
			System.out.println("Modulous of numbers is: "+(num1%num2));
		}
		else if(operation == 6) {
			System.out.println("Absolute differance is: "+Math.abs(num1-num2));
		}
		else if(operation == 7) {
			System.out.println("Percentage: "+(((float)num1/(float)num2)*100) +"%");
		}
		
	}
}

public class ArithmaticCalculator {
	public static void main(String args[]) {
		//object creation
		Calculator cal = new Calculator();
		
		while(true) {//for continuous running
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the number, to perform specific operation:\n"+
		"1. for Addition \n" + "2. for subtraction\n"
		+ "3. for Multiplication\n" + "4. for Division\n" 
		+ "5. for modulous\n" 
		+ "6. for Absolute differance\n"
		+ "7. for Percentage\n");
		int operation = sc.nextInt();
		
		//method calling
		cal.Operations(num1, num2, operation);
		
		
		System.out.println("--------------------------------------");
		
	}
	}

	}
