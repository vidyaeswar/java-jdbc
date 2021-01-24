package database;
import java.sql.*;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("org.sqlite.JDBC");
	Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
	Statement stm=con.createStatement();
	stm.executeUpdate("delete from dept where deptno>=50");
	stm.close();
	con.close();

	}

}
