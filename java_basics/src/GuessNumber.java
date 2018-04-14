import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		System.out.println("I'm thinking of a number between 1 and 100.\nCan you guess what it is?");
		int theNumber = (int) (Math.random()* 100 + 1);
		System.out.println("Type a number between 1 and 100: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int off = theNumber-number;
		if(number != theNumber) {
			if((off) < 0) {
				off = off*(-1);
			}
			System.out.println("You lose! You were of by " + off + " meaning the secret number was " + theNumber);
			
			
		}else {
			System.out.println("You won!");
		}
	}

}
