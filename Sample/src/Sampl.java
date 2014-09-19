import java.util.*;
import java.lang.*;
public class Sampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2=0;
		int choice;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose one of the choices: ");
		menu();
		choice = scan.nextInt();
		
		while(choice!=0) {
			
		}
		System.out.print("Enter the first digit: ");
		num1 = scan.nextInt();
		System.out.print("Enter the second digit: ");
		num2 = scan.nextInt();
		System.out.println("The sum is: "+addition(num1,num2));
		System.out.println("The difference is: "+subtraction(num1,num2));
		System.out.println("The quotient is: "+division(num1,num2));
		System.out.println("The product is: "+multiplication(num1,num2));
	}
	
	public static void menu() {
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		System.out.println("0 to Exit");
	}
	public static int subtraction(int n1, int n2) {
		return n1-n2;
	}

	public static int addition(int n1, int n2) {
		return n1+n2;
	}
	public static int division(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("Error!");
			return 0;
		}
		else {
			return n1/n2;
		}
	}
	public static int multiplication(int n1, int n2) {
		return n1*n2;
	}
	
}
