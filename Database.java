package database;
import java.sql.*;
import java.util.*;

public class Database {
	static int rollno;
	static String name;
	static String city;
	static int deptno;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
	PreparedStatement stm =con.prepareStatement("select *from student where deptno=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter deptno");
	int deptno=sc.nextInt();
	stm.setInt(1, deptno);
	
	ResultSet rs= stm.executeQuery();
	while(rs.next()) {
		System.out.println(rs.getInt("rollno")+"");
		System.out.println(rs.getString("name")+"");
		System.out.println(rs.getString("city")+"");
		System.out.println(rs.getString("deptno")+"");
		
			
		
	}
	stm.close();
	con.close();
	}

}
