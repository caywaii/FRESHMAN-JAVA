package INFORMATION_SYSTEM;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import INFORMATION_SYSTEM.menu.event;
import net.proteanit.sql.DbUtils;
import java.awt.FlowLayout;
import java.awt.desktop.AboutEvent;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class frmStudents extends JFrame{

	DbModel model =  new DbModel();
	
	protected static final String DefaultTableModel = null;
	public frmStudents() {
		super("Students");
		setLayout(null);
		
		//TABLES FOR FILL UP
		JTable tblStd = new JTable();
		
		//STUDENT NUBMER OF ID SECTION
		JLabel lblStudId = new JLabel("Student ID");
		lblStudId.setBounds(100, 50, 200, 30);
		add(lblStudId);
		
		JTextField txtStudId = new JTextField(8);
		txtStudId.setBounds(220, 50, 200, 30);
		add(txtStudId);

		//STUDENT NAME SECTION
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(100, 85, 200, 30);
		add(lblName);
		
		JTextField txtName = new JTextField(15);
		txtName.setBounds(220, 85, 200, 30);
		add(txtName);
		
		//SEARCH BOX
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(100,155,200,30);
		add(lblSearch);

		JTextField txtSearch = new JTextField(15);
		txtSearch.setBounds(220,155,200,30);
		add(txtSearch);
		txtSearch.addKeyListener(new KeyAdapter() {
			
			public void keyReleased(KeyEvent args) {
	
				model.SearchBox(tblStd, txtSearch.getText());
			}
		});
		
		//GENDER 
		JLabel lblGender = new JLabel("Sex");
		lblGender.setBounds(100, 120, 200, 30);
		add(lblGender);
		
		String[] valCbb= {"Male", "Female"};
		JComboBox cbbGender = new JComboBox(valCbb);
		cbbGender.setBounds(220, 120, 200, 30);
		add(cbbGender);
		
		//TABLE
		
		DefaultTableModel dtm = (DefaultTableModel) tblStd.getModel();
		Object[] header = {"ID", "NAME", "SEX"};
		final Object[] row = new Object[4];
		dtm.setColumnIdentifiers(header);
		JScrollPane sp = new JScrollPane();
		sp.setViewportView(tblStd);
		tblStd.setModel(dtm);
		sp.setBounds(100, 205, 350, 280);
		setSize(200, 200);
		setVisible(true);
		add(sp);
			
		//SAVE BUTTON
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(50, 500, 100, 30);
		add(btnSave);
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtStudId.getText().equals("") || txtName.getText().equals("") || 
						cbbGender.getSelectedItem().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please Complete Information");
				}else {
					row[0] = txtStudId.getText();
					row[1] = txtName.getText();
					row[2] = cbbGender.getSelectedItem().toString();
					model.ViewTable(tblStd);
					
					txtStudId.setText("");
					txtName.setText("");
					cbbGender.setSelectedIndex(0);
					txtStudId.requestFocus();
					txtStudId.requestFocusInWindow(null);
					JOptionPane.showMessageDialog(null,  "The information is saved succesfuly");
					model.SaveButton(txtStudId.getText(),
					          txtName.getText(),
					          cbbGender.getSelectedItem().toString());
				}


				
			
				
			
				

			}
			
		});
		
		//UPDATE BUTTON
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(170, 500, 100, 30);
		add(btnUpdate);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				model.UpdateButton(txtStudId.getText(),
				          txtName.getText(),
				          cbbGender.getSelectedItem().toString());
				
	
				txtStudId.setText("");
				txtName.setText("");
				cbbGender.setSelectedIndex(0);
				txtStudId.requestFocus();
				txtStudId.requestFocusInWindow(null);
			}
		});
		
		//VIEW LIST
		JButton btnPopulate = new JButton("View List");
		btnPopulate.setBounds(290, 500, 100, 30);
		add(btnPopulate);
		
		btnPopulate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
							
				
				model.ViewTable(tblStd);
				
			}
		});
		

		//DELETE BUTTON 
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(410, 500, 100, 30);
		add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtStudId.getText().equals("")) {
	
					JOptionPane.showMessageDialog(null,  "Missing Student ID");
				}else {
					model.DeleteButton(tblStd,txtStudId.getText());
					
					txtStudId.setText("");
					txtName.setText("");
					cbbGender.setSelectedIndex(0);
					txtStudId.requestFocus();
					txtStudId.requestFocusInWindow(null);
					
				}
			}
			
		});
		
		
		
		
		
}
	
}