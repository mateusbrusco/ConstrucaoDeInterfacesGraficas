package aplicacao.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
	
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "12345";
	private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String DRIVER_BANCO = "org.postgresql.Driver";
	
	public static Connection getConnection() throws Exception {
		
		Class.forName(DRIVER_BANCO);
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception { // Garantir que existe somente uma conexão por usuário 
		
		Connection con = getConnection();
		
		if (con != null) {
			System.out.println("Conexão obtida com sucesso");
			con.close();
		}
	}

}
