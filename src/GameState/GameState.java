package GameState;

import java.awt.event.MouseEvent;

//abstract because we don't want anyone actually using this class, just use sub classes from it 
//(tl;dr this is a template)
public abstract class GameState {

	protected GameStateManager gsm; 
	
	public abstract void init();
	public abstract void update();
	public abstract void draw(java.awt.Graphics2D g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
	public abstract void mouseClicked(MouseEvent e);
}
