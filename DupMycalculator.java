package mycalculator;

import java.util.Scanner;

public class Mycalculator {
	
	public static int value_1;
	public static int value_2;
	public static float c;

	public static void main(String[] args) {
		
		welcomescreen();
		inputvalues();
		optionsscreen();
		options();
		result();
		
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
	
	private static void optionsscreen() {
		System.out.println("#####################################################");
		System.out.println("        Welcome to options screen                                           ");
		System.out.println("                                                         ");
		System.out.println("                                       ");
		System.out.println("#######################################################");
	}
	
	private static void options() {
		System.out.println("Enter any one of the below operation to perform\n1.Addition\n2.Subtraction\n3.Division\n4.Multipication");
		Scanner value = new Scanner(System.in);
		int keyboard = value.nextInt();
		switch(keyboard){
			case 1:
				System.out.println("Addition");
				c = value_1 + value_2;
				
				break;
			case 2:
				System.out.println("Subtraction");
				c = value_1 - value_2;
				
				break;
			case 3:
				System.out.println("Division");
				if(value_2==0) {
					System.out.println("Zero cant be divided\nplease select any number between 1 to 9 ");
					value_2 = value.nextInt();
					c = value_1/value_2;
				}
				
				else {
					c = value_1/value_2;
				}
				
				break;
			case 4:
				System.out.println("Multiplication");
				c = value_1 * value_2;
				
				break;
			default:
				System.out.println("You entered wrong operation, please enter correct operation");
				options();
				break;
				
		}
	}
		
		private static void result() {
			System.out.println("#####################################################");
			System.out.println("           Result                                          ");
			System.out.println("             Screen                                       ");
			System.out.println("                                                         ");
			System.out.println("#######################################################");
			System.out.println(c);
		}
}

	

