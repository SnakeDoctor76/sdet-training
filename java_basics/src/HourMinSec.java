import java.util.Scanner;

public class HourMinSec {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of seconds to be converted in hours minutes and seconds");
		Scanner in = new Scanner(System.in);
		int seconds = in.nextInt();
		int hours = seconds/3600;
		int minutes = seconds/60-60;
		int sec = 5000 - 3600 - 23 * 60;
		
		System.out.printf("%d, %d, %d",hours,minutes,sec);

	}

}
