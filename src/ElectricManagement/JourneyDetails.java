package ElectricManagement;


import java.awt.*;
import javax.swing.*;


class Journey extends JFrame{
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
	private JComboBox c1,c2;
	private JTable table;
	Container c;
	
	Journey(){
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		

		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		l2=new JLabel("JOURNEY DETAILS");
		l3=new JLabel("SOURCE : ");
		l4=new JLabel("DESTINATION : ");
		l5=new JLabel("PNR NO");
		l6=new JLabel("TICKET NO");
		l7=new JLabel("TRAIN NO");
		l8=new JLabel("JOURNEY DATE");
		l9=new JLabel("JOURNEY TIME");
		l10=new JLabel("SOURCE");
		l11=new JLabel("DESTINATION");
		

		table=new JTable();
		
		table.setBounds(10,250,860,300);
		
		JScrollPane jp=new JScrollPane(table);
		jp.setBounds(10,250,860,300);
		
		String[] source = {"MUMBAI","DELLHI","SURAT","PATNA","KOLKATA","SILIGURI","BANGLORE","CHENNAI","PUNE"};
		String[] destination = {"MUMBAI","DELLHI","SURAT","PATNA","KOLKATA","SILIGURI","BANGLORE","CHENNAI","PUNE"};
		
		c1=new JComboBox(source);
		c1.setBounds(150,140,250,30);
		
		c2=new JComboBox(source);
		c2.setBounds(595,140,250,30);
		
		l1.setBounds(240,10,450,50);	
		l2.setBounds(350,60,250,50);	
		l3.setBounds(50,130,250,50);
		l4.setBounds(440,130,160,50);
	
		l5.setBounds(40,200,100,50);
		l6.setBounds(150,200,100,50);
		l7.setBounds(270,200,100,50);
		l8.setBounds(360,200,100,50);
		l9.setBounds(490,200,100,50);
		l10.setBounds(600,200,100,50);
		l11.setBounds(700,200,100,50);
		
		
		
		
		
		Font font=new Font("Arial",Font.BOLD,25);
		l1.setFont(font);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3.setFont(new Font("Arial",Font.BOLD,20));
		l4.setFont(new Font("Arial",Font.BOLD,20));
		
		
		
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
		c.add(l11);
		
		
		
		c.add(c1);
		c.add(c2);
		c.add(table);
		
		setVisible(true);
		
	}
	
	
}
public class JourneyDetails {

	public static void main(String[] args) {
		
Journey ju=new Journey();
	}

}
