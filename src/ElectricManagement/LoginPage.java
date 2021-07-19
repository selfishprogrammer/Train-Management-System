package ElectricManagement;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.Border;

class MFrame extends JFrame implements ActionListener{
	private JLabel l1,l2,l3;
	private JTextField t1;
	private JPasswordField p1;
	
	private JButton b1,b2,b3;
	
	private Container c;
	
	
	
	MFrame(){
		setTitle("AUTOMATED TELLER MACHINE");
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setBackground(Color.MAGENTA);
		
		//c.setBackground(Color.white);
		c.setLayout(null);
// ITEM ADDITION ??//
		l1=new JLabel("LOGIN PAGE");
		l2=new JLabel("USERNAME :");
		l3=new JLabel("PASSWORD :");
		
		t1=new JTextField();
		t1.setBounds(180,75,100,20);
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		 
		 p1=new JPasswordField();
		 p1.setBounds(180,120,100,20);
		 Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 p1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 
		
		l1.setBounds(110,5,160,60);
		l2.setBounds(70,70,100,30);
		l3.setBounds(70,115,100,30);
		
		
		
		l2.setFont(new Font("Arial",Font.BOLD,15));
		l3.setFont(new Font("Arial",Font.BOLD,15));
		Font font=new Font("Arial",Font.BOLD,25);
		l1.setFont(font);
		
		
		b1=new JButton("SIGN UP");
		b1.setBounds(70,170,100,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		
		b2=new JButton("SIGN IN");
		b2.setBounds(180,170,100,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		
		b3=new JButton("CLEAR");
		b3.setBounds(70,210,210,30);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		
		
		c.add(l2);		
		c.add(l3);
		c.add(l1);
		c.add(t1);
		c.add(p1);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		
		setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
	
		try {
		DataBase db=new DataBase();
			String a= t1.getText();
			String b=p1.getText();
			String d="select * from login where username ='"+a+"' and password = '"+b+"'";
			ResultSet rs=db.s.executeQuery(d);
			if(e.getSource()==b2) {
				if(rs.next()) {
					new Main().setVisible(true);
				setVisible(false);
	}
			else {
					JOptionPane.showMessageDialog(null, "Please Check your Password");
				}
			}
			else if (e.getSource()==b1) {
			 new Menu().setVisible(true);
			setVisible(false);
			}
			else if (e.getSource()==b3) {
				t1.setText("");
				p1.setText("");
			}
			
		}catch(Exception e1) {
			
			e1.printStackTrace();
			System.out.println("error:"+e1);
		}
		
		
	}
	
}
public class LoginPage {

	public static void main(String[] args) {
		
		MFrame mf=new MFrame();
	}

}
