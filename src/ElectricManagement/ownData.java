package ElectricManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class own extends JFrame implements ActionListener{
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2;
	private JButton b1;
	private JComboBox c1,c2;
	Container c;
	
	own(){
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		
		
		
		
		l2=new JLabel("T-No:");
		l3=new JLabel("T-Name : ");
		l4=new JLabel("SRC : ");
		l1=new JLabel("DST  : ");
		
		
		
		
		l2.setBounds(50,50,250,50);
		l3.setBounds(350,50,250,50);
		l1.setBounds(50,130,250,50);
		l4.setBounds(440,130,160,50);
		
		t1=new JTextField();
		t2=new JTextField();
		t1.setBounds(160,50,250,50);
		t2.setBounds(460,50,250,50);
		
		
		b1=new JButton("SUBMIT");
		b1.setBounds(300,200,100,20);
		
		String[] source = {"MUMBAI","DELLHI","SURAT","PATNA","KOLKATA","SILIGURI","BANGLORE","CHENNAI","PUNE"};
		String[] destination = {"MUMBAI","DELLHI","SURAT","PATNA","KOLKATA","SILIGURI","BANGLORE","CHENNAI","PUNE"};
		
		c1=new JComboBox(source);
		c1.setBounds(150,140,250,30);
		
		c2=new JComboBox(source);
		c2.setBounds(595,140,250,30);
		c.add(l1);
		c.add(l4);
		c.add(l2);
		c.add(l3);
		c.add(c1);
		c.add(c2);
		
		c.add(t1);
		c.add(t2);
		
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
			
			String c=(String)c1.getSelectedItem();
			String d=(String)c2.getSelectedItem();
			
			String q="insert into traininformation values('"+a+"','"+b+"','"+c+"','"+d+"')";
			db.s.executeUpdate(q);
			
			JOptionPane.showMessageDialog(null, "Added");
			
			
			
			
		}catch(Exception e1) {
			e1.printStackTrace();
			
		}
		
	}
	
}
public class ownData {

	public static void main(String[] args) {
own o=new own();
	}

}
