package ElectricManagement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;

class Menu extends JFrame implements ActionListener {
	private JLabel l1,l2,l3,l4,l5;
	private JTextField t1,t2,t3;
	private JButton b1,b2,b3;
	
	
	
//	private JMenuBar m;
//	private JMenu m1,m2,m3,m4;
//	private JMenuItem m5,m6,m7,m8,m9,m10;
	
	private Container c;
	
	Menu(){
		setTitle("Train Yatra");
		setBounds(300,100,900,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(null);
//		ImageIcon i=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Electric Management\\src\\ElectricManagement\\image\\train1.jpg");
//		JLabel label = new JLabel("",i,JLabel.CENTER)	;			
//		label.setBounds(0,0,900,600);
		
		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		
		l2=new JLabel("CREATE YOUR ID");
		
		
		l3=new JLabel("EMAIL ID : ");
		l4=new JLabel("NAME :");
		l5=new JLabel("PHONE NO : ");
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		
		
		
		
		b1= new JButton("SUBMIT");
		b2=new JButton("EXIT");
		
			
		
		
		
		
		b1.setBounds(40,290,200,50);
		
		
		
		b2.setBounds(640,290,200,50);
		
		
		
		
		
		l1.setBounds(240,10,450,50);	
		l2.setBounds(350,50,250,50);	
		l3.setBounds(20,110,150,50);	
		l4.setBounds(20,160,150,50);	
		l5.setBounds(20,210,150,50);	
		
		
		
		
		t1.setBounds(120,120,650,30);
		t2.setBounds(120,170,650,30);
		t3.setBounds(120,220,650,30);

	
		
		
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		 
		 
		 Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 t2.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		 
		 
		 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		 t3.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		
		
		
		
		
		
		
		l1.setForeground(Color.WHITE);
		
		
		
		
		
		
		
		Font font=new Font("Arial",Font.PLAIN,25);
		l1.setFont(font);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3.setFont(new Font("Arial",Font.BOLD,15));
		l4.setFont(new Font("Arial",Font.BOLD,15));
		l5.setFont(new Font("Arial",Font.BOLD,15));
		
		
		
		
//		c.add(label);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		
		
		
		c.add(t1);
		c.add(t2);
		c.add(t3);
		
		
		c.add(b1);		
		c.add(b2);	
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);

		
		
		
		
		
		
		
		
		
		
			setVisible(true);
			
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Random ran=new Random();
			long card3=(ran.nextLong() % 90000L)+ 10000L;
			long card4=Math.abs(card3);
			String a=t1.getText();
			String a1=t2.getText();

			String a2=t3.getText();
			
			
			if(e.getSource()==b1) {
				
				if(t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Fill All Field");
				}
				else {
				
				DataBase db=new DataBase();
				String q="insert into account values('"+a+"','"+a1+"','"+a2+"')";
				db.s.executeUpdate(q);
				String q1="insert into login values('"+a1+"','"+card4+"')";
				db.s.executeUpdate(q1);
				
				JOptionPane.showMessageDialog(null, "USERNAME :"+a+ "\n PASSWORD :"+card4);
				}
			}
			else if(e.getSource()==b2) {
				new MFrame().setVisible(true);
				setVisible(false);
			}

			
		}catch(Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
	
}


public class MenuClass {

	public static void main(String[] args) {
		
Menu mn=new Menu();
	}

}
