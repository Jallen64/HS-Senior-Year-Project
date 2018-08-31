	/*package TitleMap;

import java.awt.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;

import Main.GamePanel;

public class TileMap {
	
	//position
	private double x;
	private double y;
	
	//bounds
	private int xmin;
	private int ymin;
	private int xmax;
	private int ymax; 
	
	//Camera?????
	private double tween;
	
	//map
	private int[][]map;
	private int tileSize;
	private int numRoms;
	private int numCols;
	private int width; 
	private int height;
	
	//titleset
	private BufferedImage tileset;
	private int numTilesAcross;
	private Tile[][] tiles; 
	
	//drawing (only draws tiles on the screen)
	//Which row to start drawing
	private int rowOffset;
	//which coloum to start drawing
	private int colOffset;
	private int numRowsToDraw;
	private int numColsToDraw;
	
	public TileMap(int tileSize)
	{
		this.tileSize = tileSize;
		numRowsToDraw = GamePanel.HEIGHT / tileSize + 2;
		numColsToDraw = GamePanel.WIDTH / tileSize + 2;
		tween =.07; 
		
	}
	
	//loads tiles into memory
	public void loadTiles(String s)
	{
		
		try
		{
			tileset = ImageIO.read(getClass().getResourceAsStream(s));
		
		
		numTilesAcross = tileset.getWidth() / tileSize;
		tiles = new Tile[2][numTilesAcross];
		
		BufferedImage subimage; 
		for(int col=0; col <numTilesAcross;col++)
		{
			subimage = tileset.getSubimage(col*tileSize, 0, tileSize, tileSize);
			tiles[0][col] = new Tile(subimage,Tile.NORMAL);
			subimage = tileset.getSubimage()col*tileSize, tileSize,tileSize,tileSize);
			tiles[1][col] = new Tile(subimage, Tile.BLOCKED);
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	

}*/
