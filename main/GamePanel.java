package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	// Screen Settings
	final int originalTileSize=16; //16x16 pixels tile - mostly used in 2D games
    final int scale=3;

    public final int tileSize=originalTileSize*scale; //48x48 tile
    public final int maxScreenCol=16;
    public final int maxScreenRow=12;
    public final int screenWidth=tileSize*maxScreenCol; //768 pixels 
    public final int screenHeight=tileSize*maxScreenRow; //576 pixels
    
    Thread gameThread;
    
    public GamePanel() {
    	
    	this.setPreferredSize(new Dimension(screenWidth, screenHeight)); //setting size of this class (JPanel)
        this.setBackground(Color.black); 
        this.setDoubleBuffered(true);
    }
    
    public void startGameThread() {
        gameThread=new Thread(this);  //here this - passes GamePanel
        gameThread.start();
    }

	@Override
	public void run() {
		
	}

}
