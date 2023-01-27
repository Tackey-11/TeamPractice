package dao;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dto.newAccountDTO;
import util.GenerateHashedPw;
import util.GenerateSalt;

public class newAccountDAO {
	private static Connection getConnection() throws URISyntaxException, SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    URI dbUri = new URI(System.getenv("DATABASE_URL"));

	    String username = dbUri.getUserInfo().split(":")[0];
	    String password = dbUri.getUserInfo().split(":")[1];
	    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

	    return DriverManager.getConnection(dbUrl, username, password);
	}

	
	//登録
	public static int registerAccount(newAccountDTO account) {
		String sql = "INSERT INTO team VALUES(default,?, ?, ?, ?, ?,current_timestamp)";
		int result = 0;
		
		
		String salt = GenerateSalt.getSalt(32);
		
		
		String hashedPw = GenerateHashedPw.getSafetyPassword(account.getPassword(), salt);
		
		try (
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				){
			pstmt.setString(1, account.getMail());
			pstmt.setString(2, salt);
			pstmt.setString(3, hashedPw);
			pstmt.setString(4, account.getName());
			pstmt.setString(5, account.getFurigana());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} finally {
			System.out.println(result + "件更新しました。");
		}
		return result;
	} 
	
}
