package GameState;

import java.util.ArrayList;

public class GameStateManager {

	//holds all of the gamestates in an arraylist
	private ArrayList<GameState> gameStates;
	private int currentState;
	
	public static final int MENUSTATE = 0;
	public static final int PlayState = 1;
	public static final int HelpState = 2;
	
	public GameStateManager ()
	{
		gameStates = new ArrayList<GameState>();
		
		currentState=MENUSTATE;
		//ADD NEW GAMESTATES HERE
		gameStates.add(new MenuState(this));
		gameStates.add(new PlayState(this));
		gameStates.add(new HelpState(this));
		
	}
	
	public void setState(int state)
	{
		currentState = state;
		gameStates.get(currentState).init();
	}
	
	public void update(){
		gameStates.get(currentState).update();
	}
	public void draw(java.awt.Graphics2D g)
	{
		gameStates.get(currentState).draw(g);
	}
	public void keyPressed(int k)
	{
		gameStates.get(currentState).keyPressed(k);
	}
	
	public void keyReleased(int k){
		gameStates.get(currentState).keyReleased(k);
	}
}
