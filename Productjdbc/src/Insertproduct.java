import java.sql.*;
public class Insertproduct {

	public static void main(String[]args) throws Exception {
		 insert();
	}
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/mobile";
		String username="root";
		String password="0211";
		String Query="insert into iphone values(?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst =con.prepareStatement(Query);
		pst.setInt(1, 102);
		pst.setString(2, "iphone14");
		pst.setInt(3, 80000);
		pst.executeUpdate();
		con.close();
	}
	
	
	
}
