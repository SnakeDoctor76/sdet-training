import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
		
		// Get ready for the player to use the keyboard
		
		Scanner scan = new Scanner(System.in);
		
		// play again string
		
		String playAgain ;
		
		do {
		
			// create a random number from 1-100
			
			int numberOfTries = 1;
			
			int theNumber = (int)(Math.random()*100 + 1);
			
			int guess = 0;
			
			while (guess != theNumber) {
				System.out.println("Guess a number beween 1 and 100: ");
				
				// get user guess
				
				guess = scan.nextInt();
				
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again!");
					numberOfTries++;
				}
				else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again!");
					numberOfTries++;
				}
				else {
					System.out.println("You guessed the correct number " + guess + " in " + numberOfTries + " number of tries");
					System.out.println("You won!!!");
				}
			}
			
			// ask user for play again
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();
			
	} while (playAgain.equalsIgnoreCase("y"));
		// Thank you
		System.out.println("Thank you for playing!!!");

	}

}
