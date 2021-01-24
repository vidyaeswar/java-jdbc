package database;
import java.sql.*;
import java.util.Scanner;
public class Insert1 {
	static int rollno;
	static String name;
	static String city;
	static int deptno;
	

	public static void main(String[] args) throws ClassNotFoundException ,SQLException {
		Class.forName("org.sqlite.JDBC");
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
		PreparedStatement stm=con.prepareStatement("insert into student values(?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Data");
		int r=sc.nextInt();
		String name =sc.next();
		String city=sc.next();
		int deptno=sc.nextInt();
		stm.setInt(1,rollno);
		stm.setString(2,name);
		stm.setString(3,city);
		stm.setInt(4, deptno);
		
		stm.executeUpdate();
		
		stm.close();
		con.close();	

	}

}
