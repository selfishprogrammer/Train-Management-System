package ElectricManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

class Ticket extends JFrame{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private JComboBox c1,c2,c3;
	private JTable table;
	Container c;
	
	Ticket(){
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		

		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		l2=new JLabel("JOURNEY DETAILS");
		l3=new JLabel("JOURNEY DATE : ");
	
	
	
	
		

		
		
		
		String day[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String Month[]= {"January","Febuary","March","April","May","June","July","Augest","September","October","November","December"};
		String Years[]= {"2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005"};
		
		c1=new JComboBox(day);
		c1.setBounds(150,140,250,30);
		
		c2=new JComboBox(Month);
		c2.setBounds(595,140,250,30);
		
		c3=new JComboBox(Years);
		c3.setBounds(400,200,250,30);
		
		
		l1.setBounds(240,10,450,50);	
		l2.setBounds(350,60,250,50);	
		l3.setBounds(50,130,250,50);
		
		
		
		
		
		Font font=new Font("Arial",Font.BOLD,25);
		l1.setFont(font);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3.setFont(new Font("Arial",Font.BOLD,20));
	
		
		c.add(l1);
		c.add(l2);
		c.add(l3);
	
		
		
		c.add(c3);
		c.add(c1);
		c.add(c2);
		
		setVisible(true);
	}
}
public class TicketClass {

	public static void main(String[] args) {
		
Ticket tk= new Ticket();
	}

}
