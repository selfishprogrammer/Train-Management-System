package ElectricManagement;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Cancel extends JFrame implements ActionListener{
	
	private JLabel l1,l2,l3,l4,l5;
	private JButton b1;
	private JTextField t1,t2,t3;
	Container c;
	Cancel(){
		
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		
		
		
		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		l2=new JLabel("CANCELATION");
		l3=new JLabel("TICKET ID : ");
		l4=new JLabel("PNR NO : ");
		l5=new JLabel("TRAIN NO : ");
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		
		t1.setBounds(120,130,250,30);
		t2.setBounds(120,190,250,30);
		t3.setBounds(120,250,250,30);

		l1.setBounds(240,10,450,50);	
		l2.setBounds(350,60,250,50);	
		l3.setBounds(20,120,100,50);
		l4.setBounds(20,180,100,50);
		l5.setBounds(20,240,100,50);
		
		b1=new JButton("SUBMIT");
		b1.setBounds(120,300,250,30);
		
		
		Font font=new Font("Arial",Font.BOLD,25);
		l1.setFont(font);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3.setFont(new Font("Arial",Font.BOLD,15));
		l4.setFont(new Font("Arial",Font.BOLD,15));
		l5.setFont(new Font("Arial",Font.BOLD,15));
		
		
		
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 t2.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		 t3.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		
		
		c.add(l1);
		c.add(l2);

		c.add(l3);

		c.add(l4);

		c.add(l5);
		
		
		c.add(t1);

		c.add(t2);

		c.add(t3);
		
		
		c.add(b1);
		b1.addActionListener(this);
		setVisible(true);

}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			DataBase db=new DataBase();
			String a=t1.getText();
			String b=t2.getText();
			String c=t3.getText();
			
			
			String q="insert into cancel values('"+a+"','"+b+"','"+c+"')";
			
			db.s.executeUpdate(q);
			
			JOptionPane.showMessageDialog(null, "Canceled");
			
			new MFrame().setVisible(true);
			setVisible(false);
			
		}catch(Exception e1) {
			
			
		}
		
	}
}
public  class CancelationClass {

	public static void main(String[] args) {
		
Cancel ca=new Cancel();
	}

}
