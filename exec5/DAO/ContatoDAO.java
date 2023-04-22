package exec5.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;

import exec5.connections.ClassConnector;
import exec5.entities.Contato;

public class ContatoDAO {
	
	/*
	 * CRUD
	 * C : CREATE
	 * R : READ
	 * U : UPDATE
	 * D : DELETE
	 */
	
	
	// Método para ir ao banco e executar uma query a partir da classe escolhida
	public static void save(Contato contato) throws Exception {
		
		/* Define a query de inserção com os valores a serem acrescentados pelo
		 import PreparedStatement */
		String query = "INSERT INTO contatos(nome, idade, contato) VALUES (?, ?, ?)";
		
		// Define a iniciação da conexão
		Connection conn = null;
		
		// Define a iniciação do PreparedStatement
		PreparedStatement pstm = null;
		
		// Tentando conexão com o DB
		try {
			// Cria uma conexão "conn" com o banco de dados 
			conn = ClassConnector.connectionToMySQL();
			
			// Cria uma PreparedStatement, para executar a query
			pstm = conn.prepareStatement(query);
			
			// Adiciona os valores esperados pela query (?, ?, ?)
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setString(3, contato.getContato());
			
			// Executa a query e volta um Boolean se falso
			pstm.execute();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		
		}finally {
			
			// Tenta fechar a conexão
			try {
				
				// Fecha as conexões
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
