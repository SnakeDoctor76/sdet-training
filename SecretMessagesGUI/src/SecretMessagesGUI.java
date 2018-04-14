import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SecretMessagesGUI extends JPanel {
	private JTextField txtKey;
	private JTextArea txtOut;
	private JTextArea txtIn;
	private JSlider slider;
	
	public String encode(String message, int k) {
		
		String out = "";
		char key = (char)k;
		for(int x=0; x < message.length(); x++) {
			
			char in = message.charAt(x);
			if (in >= 'A' && in <= 'Z') {
				in+= key;
				if(in > 'Z') {
					in-=26;
				}
				if(in < 'A') {
					in+=26;
				}
			}
			if (in >= 'a' && in <= 'z') {
				in+= key;
				if(in > 'z') {
					in-=26;
				}
				if(in < 'a') {
					in+=26;
				}
			}
			
		out += in;
		}
		
		return out;
	}
	
	
	public SecretMessagesGUI() {
		setBackground(Color.PINK);
		setLayout(null);
		
		txtIn = new JTextArea();
		txtIn.setLineWrap(true);
		txtIn.setColumns(10);
		txtIn.setBounds(10, 11, 430, 110);
		add(txtIn);
		
		JLabel lblKey = new JLabel("Key:");
		lblKey.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKey.setBounds(208, 145, 46, 14);
		add(lblKey);
		
		txtKey = new JTextField();
		txtKey.setHorizontalAlignment(SwingConstants.CENTER);
		txtKey.setText("0");
		txtKey.setBounds(264, 142, 39, 20);
		add(txtKey);
		txtKey.setColumns(3);
		
		JButton btnEncodedecode = new JButton("Encode/Decode");
		btnEncodedecode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String message = txtIn.getText();
				int key = Integer.parseInt(txtKey.getText());
				String output = encode(message, key);
				txtOut.setText(output);
				
			}
		});
		btnEncodedecode.setBounds(313, 141, 127, 23);
		add(btnEncodedecode);
		
		txtOut = new JTextArea();
		txtOut.setLineWrap(true);
		txtOut.setRows(3);
		txtOut.setColumns(10);
		txtOut.setBounds(10, 179, 430, 110);
		add(txtOut);
		setPreferredSize(new Dimension(450, 320))
;	
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txtKey.setText("" + slider.getValue());
				
				String message = txtIn.getText();
				int key = Integer.parseInt(txtKey.getText());
				String output = encode(message, key);
				txtOut.setText(output);
			}
		});
		slider.setMajorTickSpacing(13);
		slider.setBackground(Color.PINK);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(1);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setValue(0);
		slider.setMinimum(-13);
		slider.setMaximum(13);
		slider.setBounds(20, 132, 210, 43);
		add(slider);}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Julian's Secret Nessage App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new SecretMessagesGUI());
		frame.pack();
		frame.setVisible(true);
	}
}
