package Main;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

import GameState.GameStateManager;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, KeyListener{

	//These are the dimensions
	public static final int WIDTH = 320;
	public static final int HEIGHT = 240;
	public static final int SCALE = 2;
	
	//How speedy we can go
	private Thread thread;
	private boolean running; 
	private int FPS = 60;
	private long targetTime = 1000/ FPS; 
	
	//The canvas we are drawing on
	private BufferedImage backGround; 
	private Graphics2D g;
	
	//game state manager
	private GameStateManager gsm; 
	
	
	//changing screen size?
	public GamePanel(){
		super();
		setPreferredSize(new Dimension(WIDTH *SCALE, HEIGHT*SCALE));
			setFocusable(true);
			requestFocus();
	}
	
	public void addNotify() 
	{
		super.addNotify();
		if(thread==null)
		{
			thread = new Thread(this);
			addKeyListener(this);
			thread.start();
		}
	}
	
	//Initializes everything we need to start the game
	public void init(){
		backGround = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		g = (Graphics2D) backGround.getGraphics();
		
		running = true; 
		
		gsm = new GameStateManager(); 
	}
	
	public void run() 
	{
		init();
		
		//time intervals
		long start;
		long elapsed;
		long wait; 
		//game loop
		while (running)
		{
			start = System.nanoTime();
			
			update();
			draw();
			drawToScreen();
			
			elapsed = System.nanoTime() - start;
			
			wait = targetTime - elapsed /1000000;
			if (wait < 0) wait = 5; 
			
			try
			{
				Thread.sleep(wait);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
	
	private void update() {
		gsm.update();
	}
	
	private void draw() {
		gsm.draw(g);
	}
	
	private void drawToScreen() {
		//game panel graphics object
		Graphics g2 = getGraphics();
		
		//draw canvas
		g2.drawImage(backGround, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
		g2.dispose();
		
	}
	
	

	
	public void keyPressed(KeyEvent key) {
		gsm.keyPressed(key.getKeyCode());
		
	}

	
	public void keyReleased(KeyEvent key) {
		gsm.keyReleased(key.getKeyCode());
		
	}

	
	public void keyTyped(KeyEvent key) {}
}
