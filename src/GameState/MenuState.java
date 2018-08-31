package GameState;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import TitleMap.Background; 


//extending GameState copies template over 
public class MenuState extends GameState{

	private Background bg;
	
	private int currentChoice = 0; 
	private String[] options = {
			"Start",
			"Help",
			"Quit",
	};
	
	private Color titleColor;
	private Font titleFont;
	
	private Font font; 
	
	
	

	
	
	//constructor
		//Every gameState needs a reference to the GameStateManager
	public MenuState (GameStateManager gsm)
	{
		this.gsm = gsm;
		
		try{
			
			bg = new Background("/Backgrounds/menubg.png", 1);
			bg.setVector(-0.5, 0);
			
			titleColor=  new Color(0,0,128);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);
			
			
			font = new Font("Arial", Font.PLAIN, 12);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
	public void init() {
		
		
	}

	
	public void update() {
		bg.update(); 
		
	}


	public void draw(Graphics2D g) {
		//draw.bg
		bg.draw(g);
		
		//draw title
		g.setColor(titleColor);
		g.setFont(titleFont);
		//for practical use needs something that sets strings automatically
		g.drawString("Truel", 130, 70 );
		
		//draw menu options
		g.setFont(font);
		for(int i =0; i <options.length; i++)
		{
			if(i==currentChoice)
			{
				g.setColor(Color.BLUE);
			}
			else{
				g.setColor(Color.BLACK);
			}
			g.drawString(options[i], 145, 140 + i*15);
		}
		
		
	}

	private void select() {
		if(currentChoice ==0) {
			gsm.setState(GameStateManager.PlayState);
		}
		if(currentChoice ==1) {
			gsm.setState(GameStateManager.HelpState);
		}
		if(currentChoice ==2) {
			System.exit(0);
		}
	}
	
	public void keyPressed(int k) {
		//controls the selection part
		if(k == KeyEvent.VK_ENTER)
		{
			select();
		}
		if (k == KeyEvent.VK_UP)
		{
			currentChoice--;
			if(currentChoice == -1)
			{
				currentChoice = options.length - 1;
			}
		}
		
		if (k == KeyEvent.VK_DOWN)
		{
			currentChoice++;
			if(currentChoice == options.length)
			{
				currentChoice = 0;
			}
		}
		
		
	}


	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
