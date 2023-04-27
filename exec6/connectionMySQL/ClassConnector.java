package exec6.connectionMySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassConnector {
	
	private final static String USERNAME = "root";
	private final static String PASSWORD = "wera";
	private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/java";
	
	public static Connection connectionToMySQL() throws Exception {
		
		//Apontando para o Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Passando as informações para o driver e conectando ao banco
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Connection conn = connectionToMySQL();
		
		if(conn != null) {
			System.out.println("Conexão obtida");
			conn.close();
		}
	}
}