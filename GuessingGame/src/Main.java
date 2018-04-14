
import java.awt.Dimension;


public class Main {

	public static void main(String[] args) {

		GuessingGame game = new GuessingGame();
		game.setSize(new Dimension(640,480));
		game.setVisible(true);
		game.initialiseRandom();
	

	}

}
