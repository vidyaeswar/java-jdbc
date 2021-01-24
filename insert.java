package database;
import java.sql.*;
public class insert {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("org.sqlite.JDBC");
	Connection con= DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
	Statement stm= con.createStatement();
	stm.executeUpdate("insert into dept values(80,'dipaloma')");
	stm.close();
	con.close();
	
	
}

}
