import javax.swing.JFrame;

public class BubbleDraw extends JFrame {

	public static void main(String[] args) {
		
		// setup the frame of our app
		
		JFrame frame = new JFrame("My Bubble Draw App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new BubblePanel());
//		
		frame.pack();
//		
		frame.setVisible(true);
//		
		
		

	}

}
