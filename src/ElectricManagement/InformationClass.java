package ElectricManagement;
import javax.swing.*;

import javax.swing.border.Border;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils
;

class Info extends JFrame implements ActionListener{
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private JTable table;
	private JTextField t1;
	private JButton b1;
	
	private Container c;
	
	Info(){
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.MAGENTA);
		
		
		
		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		l2=new JLabel("TRAIN INFORMATION");
		l3=new JLabel("TRAIN NO : ");
		l4=new JLabel("TRAIN NO");
		l5=new JLabel("TRAIN NAME");
		l6=new JLabel("SOURCE");
		l7=new JLabel("DESTINATION");
		l8=new JLabel("CAPICITY");
		l9=new JLabel("CLASS NO");
		l10=new JLabel("CLASSS NAME");
		
		
		
			b1=new JButton("SHOW LIST");
		
			b1.setBounds(500,140,150,32);
		t1=new JTextField();
		
		t1.setBounds(200,140,250,30);
		
		
		
		table=new JTable();
		
		table.setBounds(10,250,860,300);
		
		JScrollPane jp=new JScrollPane(table);
		jp.setBounds(10,250,860,300);
		
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		 
		 
			Border border2 = BorderFactory.createLineBorder(Color.BLACK);
			 table.setBorder(BorderFactory.createCompoundBorder(border2,
			            BorderFactory.createEmptyBorder(20, 20, 20, 20)));
		
		table.setEnabled(false);
		l1.setBounds(240,10,450,50);
		
		l2.setBounds(340,60,450,50);
		l3.setBounds(40,130,250,50);
		l4.setBounds(40,200,100,50);
		l5.setBounds(150,200,100,50);
		l6.setBounds(270,200,100,50);
		l7.setBounds(360,200,100,50);
		l8.setBounds(490,200,100,50);
		l9.setBounds(600,200,100,50);
		l10.setBounds(700,200,100,50);
		
		Font font=new Font("Arial",Font.BOLD,25);
		l1.setFont(font);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3.setFont(new Font("Arial",Font.BOLD,20));
		
		c.add(l1);

		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
		c.add(l8);
		c.add(l9);
		c.add(l10);

		
		c.add(t1);
		
		c.add(b1);
		c.add(table);
		c.add(jp);
		
		
		b1.addActionListener(this);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		String a=t1.getText();
		
		DataBase db=new DataBase();
		
		String q="select t_no,t_name ,src,dest,capicity,class_no,class_nam from traininformation,sector where t_no='"+a+"'";
		
		ResultSet rs = db.s.executeQuery(q);
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
		
	}
	
}
public class InformationClass {

	public static void main(String[] args) {
		Info in=new Info();

	}

}
