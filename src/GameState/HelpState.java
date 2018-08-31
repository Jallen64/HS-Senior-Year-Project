package GameState;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import TitleMap.Background;

public class HelpState extends GameState {
	
	private Background bg;
	
	public HelpState(GameStateManager gsm)
	{
		this.gsm = gsm;
		
		try{
			
			bg = new Background("/Backgrounds/HelpStatePic.jpg", 1);
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		
		
	}

	@Override
	public void draw(Graphics2D g) {
		bg.draw(g);
		
	}

	@Override
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_ESCAPE)
		{
			gsm.setState(GameStateManager.MENUSTATE);
		}
		
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
