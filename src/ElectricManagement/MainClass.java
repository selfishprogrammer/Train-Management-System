package ElectricManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Main extends JFrame implements ActionListener{
	private JMenuBar m1;
	
	private JMenu m2,m3,m4,m5;
	private JMenuItem m6,m7,m8,m9,m10,m11;
	
	private JLabel l1;
	
	
	Container c;
	
	
	Main(){
		setTitle("TRAIN YATRA");
		setBounds(300,100,900,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		
		
		l1=new JLabel("WELCOME TO YOUR TRAIN YATRA");
		
		
		m1=new JMenuBar();
		m1.setBackground(Color.WHITE);
		m2= new JMenu("TRAIN SYSTEM");
		m3= new JMenu("TRAIN TICKET");
		m4= new JMenu("PASSENGERS LIST");
		m5= new JMenu("MISC");
		
		
		
		
		m6=new JMenuItem("TRAIN INFORMATION");
		m7=new JMenuItem("ADD DETAILS");
		m8=new JMenuItem("JOURNEY DETAILS");
		m9=new JMenuItem("PAYMENT DETAILS");
		m10=new JMenuItem("CANCELATION");
		
		
		
		
		m2.add(m6);
		m2.add(m7);
		m2.add(m8);
		m2.add(m9);
		m2.add(m10);

		
		
		m1.add(m2);
		m1.add(m3);
		m1.add(m4);
		m1.add(m5);
		
		setJMenuBar(m1);
		
		m6.addActionListener(this);
		m7.addActionListener(this);
		m8.addActionListener(this);
		m9.addActionListener(this);
		m10.addActionListener(this);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		l1.setBounds(240,10,450,50);
		
		
		
		
		
		Font font=new Font("Arial",Font.PLAIN,25);
		l1.setFont(font);
		
		
		
		c.add(l1);
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==m6) {
	new Info().setVisible(true);
	setVisible(false);
		}
		
else if(e.getSource()==m7) {
	new Details().setVisible(true);
	setVisible(false);
		}


else if(e.getSource()==m8) {
	new Journey().setVisible(true);
	setVisible(false);
}


else if(e.getSource()==m9) {
	
}


else if(e.getSource()==m10) {
	new Cancel().setVisible(true);
	setVisible(false);
}


		
	}
	
	
	
	
	
}
public class MainClass {

	public static void main(String[] args) {
		
Main m=new Main();
	}

}
