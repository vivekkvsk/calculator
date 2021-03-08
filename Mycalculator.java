package mycalculator;

import java.util.Scanner;

public class Mycalculator {
	
	public static int value_1;
	public static int value_2;

	public static void main(String[] args) {
		
		welcomescreen();
		inputvalues();
		outputscreen();
		options();
		
	}
	
	private static void inputvalues() {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number:");
		Scanner inputvalue_1 = new Scanner(System.in);
		 value_1 = inputvalue_1.nextInt();
		System.out.println("Enter 2nd number");
		Scanner inputvalue_2 = new Scanner(System.in);
		 value_2 = inputvalue_2.nextInt();
	}

	private static void welcomescreen() {
		System.out.println("#####################################################");
		System.out.println("           Welcome                                          ");
		System.out.println("             to                                         ");
		System.out.println("      Calculator Application                                   ");
		System.out.println("#######################################################");
	}
	
	private static void outputscreen() {
		System.out.println("#####################################################");
		System.out.println("         Result Screen                                            ");
		System.out.println("                                                         ");
		System.out.println("                                       ");
		System.out.println("#######################################################");
	}
	
	private static void options() {
		System.out.println("Enter any one of the below operation to perform\n1.Addition\n2.Subtraction\n3.Division\n4.Multipication");
		int c;
		Scanner value = new Scanner(System.in);
		int keyboard = value.nextInt();
		switch(keyboard){
			case 1:
				System.out.println("Addition");
				c = value_1 + value_2;
				System.out.println(c);
				break;
			case 2:
				System.out.println("Subtraction");
				c = value_1 + value_2;
				System.out.println(c);
				break;
			case 3:
				System.out.println("Division");
				c = value_1 + value_2;
				System.out.println(c);
				break;
			case 4:
				System.out.println("Multiplication");
				c = value_1 + value_2;
				System.out.println(c);
				break;
			default:
				System.out.println("You entered wrong operation, please enetr correct operation");
				break;
		}
		
		//value.close();
		
		
	}
	
	
}

	

