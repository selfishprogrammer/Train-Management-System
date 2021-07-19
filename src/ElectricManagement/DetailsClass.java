package ElectricManagement;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Details extends JFrame implements ActionListener{
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	private JButton b1;
	private JRadioButton r1,r2;
	Container c;
	Details(){
		
		
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.MAGENTA);
		
		
		
		
		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		l2=new JLabel("NAME : ");
		l3=new JLabel("TRAIN NO : ");
		l4=new JLabel("PNR NO : ");
		l5=new JLabel("ADDRESS : ");
		l6=new JLabel("NATIONALITY :");
		l7=new JLabel("GENDER : ");
		l8=new JLabel("PHONE NO : ");
		l9=new JLabel("COUSTMER DETAILS");
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		
		
		
		
		
		
		t1.setBounds(120,70,250,30);
		t2.setBounds(120,130,250,30);
		t3.setBounds(120,190,250,30);
		t4.setBounds(120,250,250,30);
		t5.setBounds(120,310,250,30);
	
		t6.setBounds(120,430,250,30);
		
		
		
		
		r1=new JRadioButton("Male");
		r1.setBounds(120,375,100,20);
		r1.setBackground(Color.MAGENTA);
		
		
		
		r2=new JRadioButton("Female");
		r2.setBounds(250,375,100,20);
		r2.setBackground(Color.MAGENTA);
		
		ButtonGroup gender=new ButtonGroup();
		gender.add(r1);
		gender.add(r2);
		r1.setSelected(true);
		
		b1=new JButton("SAVE");
		b1.setBounds(120,500,250,30);
		
		
		
		
		
		
		
		
		
//		JLabel label=new JLabel("");
//		
//		ImageIcon image=new ImageIcon(this.getClass().getResource("*/iconImage.jpg"));			
//		label.setIcon(image);
//		
//		label.setBounds(300,250,50,50);
//		ImageIcon image=new ImageIcon("C:\\Users\\RAHUL\\eclipse-workspace\\JavaCourse\\Electric Management\\src\\iconImage.jpg");	
//		l10=new JLabel("",image,JLabel.LEFT);
//		
//		l10.setBounds(380,160,300,300);
//		c.add(l10)
//;
//		l10.setSize(300, 500);
		
		
		
		
		
		

		l1.setBounds(240,10,450,50);
		
		l9.setBounds(560,60,450,50);
		l3.setBounds(20,120,250,50);
		l4.setBounds(20,180,100,50);
		l5.setBounds(20,240,100,50);
		l6.setBounds(20,300,100,50);
		l7.setBounds(20,360,100,50);
		l8.setBounds(20,420,100,50);
		l2.setBounds(20,60,100,50);
		
		
		
		
		Font font=new Font("Arial",Font.BOLD,25);
		l1.setFont(font);
		l9.setFont(new Font("Arial",Font.BOLD,20));
		
		
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		 t1.setBorder(BorderFactory.createCompoundBorder(border1,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		 t2.setBorder(BorderFactory.createCompoundBorder(border2,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		 t3.setBorder(BorderFactory.createCompoundBorder(border3,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border4 = BorderFactory.createLineBorder(Color.BLACK);
		 t4.setBorder(BorderFactory.createCompoundBorder(border4,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border5 = BorderFactory.createLineBorder(Color.BLACK);
		 t5.setBorder(BorderFactory.createCompoundBorder(border5,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		 Border border6 = BorderFactory.createLineBorder(Color.BLACK);
		 t6.setBorder(BorderFactory.createCompoundBorder(border6,
		            BorderFactory.createEmptyBorder(2, 2, 2, 2)));
		 
		
		c.add(l1);
		c.add(l9);
		
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
		c.add(l8);
		
		c.add(r1);
		c.add(r2);
		
		c.add(b1);
		
		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(t4);
		c.add(t5);
		c.add(t6);
		
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
			String d=t4.getText();
			String f=t5.getText();
			String g=t6.getText();
			
			String m="";
			if(r1.isSelected()) {
				m="Male";
				
			}
			else if(r2.isSelected()) {
				m="Female";
				
			}
			
			
			String q="insert into passenger values('"+a+"','"+b+"','"+c+"','"+d+"','"+f+"','"+m+"','"+g+"')";
			db.s.executeUpdate(q);
			
			
			
			
			
		}catch(Exception e1) {
			e1.printStackTrace();
			
		}
		
	}
}
public class DetailsClass {

	public static void main(String[] args) {
	Details dt=new Details();

	}

}
