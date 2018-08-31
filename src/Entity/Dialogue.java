package Entity;

import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Dialogue {
	private String[] s = new String[] 
			{"Green Player:Take your shot{1: Shoot Blue, 2: Shoot Red, 3: Pass}"
			,"Blue Player: Take Your Shot{1: Shoot Green, 2: Shoot Red, 3:Pass}"
			,"Red Player: Take Your Shot{1: Shoot Green, 2: Shoot Blue, 3:Pass}"
			,"Blue Player: Take Your Shot{1: Shoot Red, 2: Pass}"
			,"Red Player: Take Your Shot{1: Shoot Blue, 2: Pass}"
			,"Green Player: Take Your shot{1: Shoot Red, 2: Pass}"
			,"Red Player: Take Your Shot{1:Shoot Green, 2: Pass}"
			,"Blue Player: Take Your Shot{1: Shoot Green, 2: Pass}"
			,"Green Player: Take Your Shot{1: Shoot Blue, 2: Pass}"
			,"Red Wins! {1: Restart}"
			,"Green Wins! {1: Restart}"
			,"Blue Wins! {1: Restart}"};
	private int i = 0;
	private int k;
	
	private Color dialogueColor = new Color(255,255,255);
	private Font dialogueFont = new Font("Roboto", Font.BOLD, 8);
	
	public int incrementIndex()
	{
		return i++;

	}
	
	public int select(int i)
	{
		this.i = i; 
		return i; 
	}
	
	public int setEventAAG()
	{
		i = 0;
		return i;
	}
	
	public int setEventAAB()
	{
		i = 1;
		return i;
	}
	
	public int setEventAAR()
	{
		i = 2;
		return i;
	}
	
	public int setEventGDB()
	{
		i = 3;
		return i;
	}
	
	public int setEventGDR()
	{
		i = 4;
		return i;
	}
	
	public int setEventBDG()
	{
		i = 5;
		return i;
	}
	
	public int setEventBDR()
	{
		i = 6;
		return i;
	}
	
	public int setEventRDB()
	{
		i = 7;
		return i;
	}
	
	public int setEventRDG()
	{
		i = 8;
		return i;
	}
	
	public int setEventRW()
	{
		i = 9;
		return i;
	}
	
	public int setEventBW()
	{
		i = 10;
		return i;
	}
	
	public int setEventGW()
	{
		i=11;
		return i;
	}
	

	public void draw(Graphics2D g)
	{
		g.setFont(dialogueFont);
		g.setColor(dialogueColor);
		g.drawString(s[i], 25, 120);
		
		
		
	}

}
