package INFORMATION_SYSTEM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class menu extends JFrame{
	
	JMenuBar menubar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenuItem frmStudentsMenu = new JMenuItem("Students");
	JMenuItem frmCourse = new JMenuItem("Course");
	JMenuItem frmSettings = new JMenuItem("Settings");
	JMenuItem exit = new JMenuItem ("Exit");
	event click = new event();
	
	JMenu trans = new JMenu("Transacation");
	JMenuItem payment = new JMenuItem("Assesment");
	
	
	public menu(){
		super("SANTIAGO INFORMATION SYSTEM");
		setLayout(new FlowLayout());
		
		setJMenuBar(menubar);
		
//This area is under menu-bar
		file.setMnemonic('F');
		menubar.add(file);
		
		frmStudentsMenu.setMnemonic('S');
		file.add(frmStudentsMenu);
		
		frmCourse.setMnemonic('C');
		file.add(frmCourse);
		
		file.add(frmSettings);
		
		exit.setMnemonic('x');
		file.add(exit);
		
//This area is for the Transaction Menu
		trans.setMnemonic('T');
		menubar.add(trans);
		
		payment.setMnemonic('A');
		trans.add(payment);

		frmStudentsMenu.addActionListener(click);
		exit.addActionListener(click);
	}
	
	public class event implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JMenuItem source =(JMenuItem)e.getSource();
			if(source==frmStudentsMenu) {
				frmStudents f1 = new frmStudents();
				f1.setSize(600,600);
				f1.setLocationRelativeTo(null);
				setVisible(false);
				f1.setVisible(true);
			}else if(source==exit) {
				String messageBox = "Are you sure you want to close the application?";
				int ans = JOptionPane.showConfirmDialog(null, messageBox, "Exit", JOptionPane.YES_NO_OPTION);
				if(ans==JOptionPane.YES_OPTION) {
					System.exit(0);
			}
		}
	}
	
}
	}
