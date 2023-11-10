import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updateproduct {
	public static void main(String[]args) throws Exception {
		 update();
	}
	public static void update() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/mobile";
		String username="root";
		String password="0211";
		String Query="update iphone set mobilemodel='oneplus ' where id =102 ";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst =con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	
	
	
}
