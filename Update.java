package database;
import java.sql.*;
public class Update {

	public static void main(String[] args)throws ClassNotFoundException, SQLException{
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		Statement stm=con.createStatement();
		stm.executeUpdate("update dept set dname ='chem'where deptno=40");
		stm.close();
		con.close();
		
		

	}

}
