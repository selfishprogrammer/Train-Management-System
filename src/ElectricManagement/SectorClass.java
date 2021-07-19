package ElectricManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




class Sector extends JFrame implements ActionListener{
	private JLabel l1,l2,l3;
	private JTextField t1,t2,t3;
	private JButton b1;
	Container c;

Sector(){
	setTitle("TRAIN YATRA");
	setBounds(300,100,900,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	c=getContentPane();
	c.setLayout(null);
	c.setBackground(Color.CYAN);
	
	
	
	l1=new JLabel("CAPICITY : ");
	
	l2=new JLabel("CLASS NO:");
	l3=new JLabel("CLASS NAME : ");
	
	
	l1.setBounds(40,130,250,50);
	l2.setBounds(40,200,100,50);
	l3.setBounds(40,270,100,50);
	
	
	
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	
	b1=new JButton();
	b1.setBounds(480,200,250,50);
	
	
	t1.setBounds(140,130,250,50);
	t2.setBounds(140,200,250,50);
	t3.setBounds(140,270,250,50);
	
	
	c.add(l1);
	c.add(l2);
	c.add(l3);
	
	
	c.add(t1);
	c.add(t2);
	c.add(t3);
	
	c.add(b1);
	b1.addActionListener(this);
	
	setVisible(true);
}


public void actionPerformed(ActionEvent e) {
	try {
		DataBase db=new DataBase();
		String a=t1.getText();
		String b=t2.getText();
		String c=t3.getText();
		
		
		String q="insert into sector values('"+a+"','"+b+"','"+c+"')";
		
		db.s.executeUpdate(q);
		
		
		
		
		
	}catch(Exception e1) {
		e1.printStackTrace();
		
	}
	
}

}
public class SectorClass {

	public static void main(String[] args) {
		
Sector sc=new Sector();
	}

}
