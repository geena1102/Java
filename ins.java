
	
	import java.sql.*;
	import java.sql.DriverManager;

	public class ins {

		public static void main(String[] args) {
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:ORCL","system","password");
				Statement stmt=con.createStatement();
				String ins1="insert into Dept values('D1','com')";
//				String ins2="insert into Dept values('Dy','Phy')";
//				String ins3="insert into Stu values('S1','A','D1')";
//				String ins4="insert into Stu values('S2','B','D2')";
				stmt.execute(ins1);
				System.out.println("inserted1");
//				stmt.execute(ins2);
//				System.out.println("inserted2");
//				stmt.execute(ins3);
//				System.out.println("inserted3");
//				
//				stmt.execute(ins4);
//				System.out.println("inserted4");
				con.close();	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			// TODO Auto-generated method stub

		}

	}



