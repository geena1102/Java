	import java.sql.Connection;
	import java.sql.DriverManager;
	//import java.sql.SQLException;
	import java.sql.Statement;
	public class Person {
	    public static void main(String args[]) {
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:ORCL","system","password");
	            Statement stmt = con.createStatement();
	            stmt.executeUpdate("create table person(pid varchar2(20) primary key,pname varchar2(20),page number,paddress varchar2(20),pdob number)");
	            System.out.println("Table created...");
	            con.close();
	        } catch (Exception  e) {
	            System.out.println(e);
	        }
	    }
	}
