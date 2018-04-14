import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GuessingGame extends JFrame {
	
		private JTextField txtGuess;
		private JLabel lblOutput;
		private int theNumber;
		private JButton btnGuess;
		private JLabel lblNumberOfTries;
		
		
		
		public void initialiseRandom() {
			theNumber = (int)(Math.random()*100 + 1);
		
			lblNumberOfTries.setText("7");
		
		}
		
		public void checkGuess() {
			String guessText = txtGuess.getText();
			String message = "";
			String sTries = lblNumberOfTries.getText();
			int tries = Integer.parseInt(sTries);
			
			
			try {
			
				int guess = Integer.parseInt(guessText);
				
				if (guess > 0 && guess <= 100) {
					tries--;
				} 
				
				
				lblNumberOfTries.setText(Integer.toString(tries));	
		
				
				if (guess > theNumber) {
					message = guess + " was too high. Try again";
					lblOutput.setText(message);
				}
				else if (guess < theNumber) {
					message = guess + " was too low. Try again";
					lblOutput.setText(message);
				}
				else {
					message = guess + " was right. You win! Let's play again!";
					lblOutput.setText(message);
					initialiseRandom();
				}
				
				if (guess > 100 || guess < 1) {
					message = "Please choose a number between 1 and 100";
					lblOutput.setText(message);
				}
				
				if (tries == 0 && guess != theNumber) {
					lblOutput.setText("You lose!!!");
					initialiseRandom();
				}	
			
			}
			catch(Exception e) {
				lblOutput.setText("Enter a whole number.");
			}
			finally {
				txtGuess.requestFocus();
				txtGuess.selectAll();
			}
		}
		
		public GuessingGame() {
			setTitle("Julian Guessing Game");
			getContentPane().setBackground(new Color(238, 232, 170));
			setBackground(new Color(255, 228, 181));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			
			JLabel lblJuliansHiloGuessing = new JLabel("Julian's Hi-Lo Guessing Game");
			lblJuliansHiloGuessing.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblJuliansHiloGuessing.setBounds(-11, 23, 455, 14);
			lblJuliansHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
			getContentPane().add(lblJuliansHiloGuessing);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(178, 34, 34));
			panel.setBorder(null);
			panel.setBounds(-11, 60, 455, 30);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblGuessANumber = new JLabel("Guess a number between between 1 and 100");
			lblGuessANumber.setBounds(31, 8, 268, 14);
			lblGuessANumber.setForeground(new Color(255, 255, 255));
			panel.add(lblGuessANumber);
			lblGuessANumber.setHorizontalAlignment(SwingConstants.CENTER);
			
			txtGuess = new JTextField();
			txtGuess.setBounds(309, 5, 44, 20);
			txtGuess.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					checkGuess();
					
					
				}
			});
			txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
			panel.add(txtGuess);
			txtGuess.setColumns(10);
			
			btnGuess = new JButton("GUESS");
			btnGuess.setForeground(new Color(255, 255, 255));
			btnGuess.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnGuess.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkGuess();
				
				
				}
			});
			btnGuess.setBackground(new Color(255, 99, 71));
			btnGuess.setBounds(179, 113, 89, 23);
			getContentPane().add(btnGuess);
			
			lblOutput = new JLabel("Enter a number above and click Guess!");
			lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
			lblOutput.setBounds(-11, 221, 455, 14);
			getContentPane().add(lblOutput);
			
			lblNumberOfTries = new JLabel("");
			lblNumberOfTries.setFont(new Font("Tahoma", Font.BOLD, 28));
			lblNumberOfTries.setHorizontalAlignment(SwingConstants.CENTER);
			lblNumberOfTries.setBounds(199, 159, 46, 39);
			getContentPane().add(lblNumberOfTries);
			
			JLabel lblNewLabel = new JLabel("You have");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(139, 174, 65, 23);
			getContentPane().add(lblNewLabel);
			
			JLabel lblTriesLeft = new JLabel("tries left!");
			lblTriesLeft.setHorizontalAlignment(SwingConstants.CENTER);
			lblTriesLeft.setBounds(244, 174, 65, 23);
			getContentPane().add(lblTriesLeft);
		}
}