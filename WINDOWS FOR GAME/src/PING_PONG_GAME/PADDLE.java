package PING_PONG_GAME;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class PADDLE {
	
	private int x, y;
	private int vel = 0;
	private int speed = 10;
	private int width = 22, height =85;
	private int score = 0;
	private Color color;
	private boolean left ; 
 
	public PADDLE(Color c, boolean left) {
		color = c;
		
		this.left = left;
		
		if(left)
			x=0;
		else
			x = MAIN_GAME.WIDTH - width;
		y = MAIN_GAME.HEIGHT / 2 - height / 2;
	}
	
	public void addPoint() {
		score++;
	}

	public void draw(Graphics g) {
		//draw paddle
		g.setColor(color);
		g.fillRect(x,  y,  width,  height);
		
		//draw score
		int sx;
		String scoreText = Integer.toString(score);
		Font font = new Font("Roboto", Font.PLAIN, 50);
		int strWidth = g.getFontMetrics(font).stringWidth(scoreText) + 1;
		int padding = 25;
		
		if(left)
			sx = MAIN_GAME.WIDTH / 2 - padding - strWidth;
		else
			sx = MAIN_GAME.WIDTH / 2 + padding;
		
		g.setFont(font);
		g.drawString(scoreText, sx, 50);
		
	}
	
}
