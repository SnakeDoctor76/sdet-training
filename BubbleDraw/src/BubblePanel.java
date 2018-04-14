import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class BubblePanel extends JPanel {
	
	
	private ArrayList<Bubble> bubbleList;
	private int size = 30;
	private Timer timer;
	private final int DELAY = 33;
	
	public BubblePanel() {
		
		bubbleList = new ArrayList<Bubble>();
		
		addMouseListener(new BubbleListener());
		addMouseMotionListener(new BubbleListener());
		addMouseWheelListener(new BubbleListener());
		timer = new Timer(DELAY, new BubbleListener());
		
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(600, 400));
		timer.start();
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		// draw all the bubbles
		for (Bubble bubble:bubbleList) {
			page.setColor(bubble.color);
			page.fillOval(bubble.x, bubble.y, bubble.size, bubble.size);
		}
		
		// write a number of bubbles on the screen
		page.setColor(Color.green);
		page.drawString("Count: " + bubbleList.size(), 5, 15);
		
	}
	
	private class Bubble{
		
		// a bubble x, y location and size
		
		public int x;
		public int y;
		public int size;
		public Color color;
		public int xSpeed;
		public int ySpeed;
		private final int MAX_SPEED = 5;
		
		public Bubble(int newX, int newY, int newSize) {
			x = newX;
			y = newY;
			size = newSize;
			color = new Color((float)Math.random(),(float)Math.random(), (float)Math.random());
			xSpeed = (int)(Math.random() * MAX_SPEED * 2 - MAX_SPEED);
			ySpeed = (int)(Math.random() * MAX_SPEED * 2 - MAX_SPEED);
			
			if (xSpeed == 0) {
				xSpeed = 2;
			}
			
			if (ySpeed == 0) {
				ySpeed = 2;
			}
		}
		
		public void update() {
			x += xSpeed;
			y += ySpeed;
			
			if (x < 0 || x > getWidth()-size) {
				xSpeed = -1 * xSpeed;
			}
			
			if (y < 0 || y > getHeight()-size) {
				ySpeed = -1 * ySpeed;
			}
		}
		
	}


	private class BubbleListener implements MouseListener, MouseMotionListener, MouseWheelListener, ActionListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			
			timer.stop();
			bubbleList.add(new Bubble(arg0.getX()-size/2, arg0.getY()-size/2, size));
			repaint();
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			timer.start();
			for (Bubble bubble:bubbleList)
				bubble.update();
			
		}

		@Override
		public void mouseDragged(MouseEvent arg0) {
			bubbleList.add(new Bubble(arg0.getX()-size/2, arg0.getY()-size/2, size));
			repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent arg0) {

			size -= arg0.getWheelRotation();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for (Bubble bubble:bubbleList)
				bubble.update();
			
			repaint();
			
		}
		
		

	}
	

}
