package PING_PONG_GAME;

import javax.swing.JFrame;

public class WINDOWS {

	public WINDOWS(String title, MAIN_GAME game) {
		
		JFrame frame = new JFrame(title);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	      
	    game.start();		
	}
}
