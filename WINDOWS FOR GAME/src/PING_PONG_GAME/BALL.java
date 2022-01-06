package PING_PONG_GAME;

import java.awt.Color;
import java.awt.Graphics;

public class BALL {

	public static final int SIZE = 16;
	
	private int x,y;
	private int xvel, yvel;
	private int speed = 5;
	
	public BALL() {
		reset();
	}

	private void reset() {
		//initial position
		
		x = MAIN_GAME.WIDTH / 2 - SIZE / 2;
		x = MAIN_GAME.HEIGHT / 2 - SIZE / 2;
		
		//initial velocity
		
		 xvel = MAIN_GAME.sign(Math.random() * 2.0 - 1);
		 yvel = MAIN_GAME.sign(Math.random() * 2.0 - 1);
		
	}
	
	public void changeYdirection() {
		yvel *= -1;
	}
	
	public void changeXdirection() {
		xvel *= -1;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, SIZE, SIZE);
			
	}

	public void update(PADDLE paddle1, PADDLE paddle2) {
		//update movement
	    x += xvel * speed;
	    y += yvel * speed;
	    
	    //collisions
		
	}
}
