package ElectricManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBase {
	Connection c;
	Statement s;
	
	public DataBase(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricmanagement","root","");
			s=c.createStatement();
		}catch(Exception e) {
			System.out.println(e);
			
		}

			
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DataBase db=new DataBase();
	}

}
