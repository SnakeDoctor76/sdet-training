import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		
		double celsius;
		
		System.out.println("Enter a value to convert from Celsius to Fahrenheit: ");
		Scanner in = new Scanner(System.in);
		celsius = in.nextDouble();
		double result = celsius * 9/5 + 32;
		System.out.println(celsius + " C" + " = " + result + " F");
		System.out.println("Adding code for git");
		System.out.println("Adding code from GIT");
		

	}

}
