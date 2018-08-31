package GameState;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import Entity.Dialogue;
import Entity.Player;
import TitleMap.Background;


public class PlayState extends GameState {
	
	private Background bg;
	private Dialogue d; 
	private Player p1;
	private Player p2;
	private Player p3;
	
	
	
	
	
	
	
	//initalizes the gameStateManager 
	public PlayState(GameStateManager gsm)
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		d = new Dialogue();
		
		
		init();
		
		
		
		this.gsm = gsm; 
		
		try{
			
			bg = new Background("/Backgrounds/fieldbg.jpg", 1);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	
	}

	@Override
	public void init() {
		p3.select();
	
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		d.draw(g);
		p1.draw(g, Color.blue,40,40);
		p2.draw(g, Color.red, 260, 40);
		p3.draw(g, Color.green, 150, 180);
	}

	@Override
	public void keyPressed(int k) {
		
		if(k == KeyEvent.VK_ESCAPE)
		{
			gsm.setState(GameStateManager.MENUSTATE);
		}
		
		if(k == KeyEvent.VK_A)
		{
			d.incrementIndex();
		}
		
		p3.select();
		int i = 0;
		if(k == KeyEvent.VK_1)
		{
			if (i == 0)
			{
				d.select(5);
				p1.kill();
			
				p3.deSelect();
				i=6;
			}
			if (i==1)
			{
				p3.kill();
				d.setEventGDR();
				i=4;
			}
			if (i==2)
			{
				p3.kill();
				d.setEventGDB();
				i=3;
			}
			if (i==3)
			{
				p2.kill();
				d.setEventBW();
				i=11;
			}
			if (i==4)
			{
				p1.kill();
				d.setEventRW();
				i=9;
			}
			if (i==5)
			{
				p2.kill();
				d.setEventGW();
				i=10;
				
			}
			if (i==6)
			{
				p3.kill();
				d.setEventRW();
				i=9;
			}
			if (i==7)
			{
				p3.kill();
				d.setEventBW();
				i=11;
			}
			if (i==8)
			{
				p1.kill();
				d.setEventGW();
				i=10;
			}
			if (i==9)
			{
				//gsm.setState(GameStateManager.MENUSTATE);
			}
			if (i==10)
			{
				//gsm.setState(GameStateManager.MENUSTATE);
			}
			if (i==11)
			{
				//gsm.setState(GameStateManager.MENUSTATE);
			}
			
		}
		if(k == KeyEvent.VK_2)
		{
			if (i==0)
			{
				p2.kill();
				
			}
			if (i==1)
			{
				
			}
			if (i==2)
			{
				
			}
			if (i==3)
			{
				
			}
			if (i==4)
			{
				
			}
			if (i==5)
			{
				
			}
			if (i==6)
			{
				
			}
			if (i==7)
			{
				
			}
			if (i==8)
			{
				
			}
			if (i==9)
			{
				
			}
			if (i==10)
			{
				
			}
			if (i==11)
			{
				
			}
		}
		if (k == KeyEvent.VK_3)
		{
			if (i==0)
			{
				p1.select();
			}
			if (i==1)
			{
				
			}
			if (i==2)
			{
				
			}
			if (i==3)
			{
				
			}
			if (i==4)
			{
				
			}
			if (i==5)
			{
				
			}
			if (i==6)
			{
				
			}
			if (i==7)
			{
				
			}
			if (i==8)
			{
				
			}
			if (i==9)
			{
				
			}
			if (i==10)
			{
				
			}
			if (i==11)
			{
				
			}
			
		}
		
		
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		
		
		
	}

}
