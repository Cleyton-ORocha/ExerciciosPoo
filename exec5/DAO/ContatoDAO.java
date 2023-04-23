package exec5.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exec5.connections.ClassConnector;
import exec5.entities.Contato;

public class ContatoDAO {
	
	/*
	 * CRUD
	 * C : CREATE - V
	 * R : READ - v
	 * U : UPDATE - v
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
			System.out.println("Contato Salvo!");
			
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

	public static List<Contato> listaContato() {
		
		String sql = "SELECT * FROM CONTATOS";
		
		List<Contato> listaContato = new ArrayList<>();
				
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try{
			conn = ClassConnector.connectionToMySQL();
			
			// Prepara o conector para executar o código sql especificado
			pstm = conn.prepareStatement(sql);
			
			// Biblioteca que recebe a lista de itens que o banco repassou e tem métodos para tratar o resultado
			rset = pstm.executeQuery();
			
			// Varre a lista por linha
			while(rset.next()) {
				
				// Declara um novo contato para modificar sua estrutura para o do banco
				Contato contato = new Contato();
				
				// Modifica o nome do contato para o do banco
				contato.setId(rset.getInt("ID"));
				contato.setNome(rset.getString("NOME"));
				contato.setIdade(rset.getInt("IDADE"));
				contato.setContato(rset.getString("CONTATO"));
				
				listaContato.add(contato);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
				try {
					rset.close();
					pstm.close();
					conn.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
		}
			
		return listaContato;
		
	}
	
	public static void atualiza(Contato contato) throws Exception{
		
		String sql = "UPDATE CONTATOS SET NOME = ?, IDADE = ?, CONTATO = ? "
		+ "WHERE ID = ?;";
		
		
			Connection conn = null;
			PreparedStatement pstm = null;
			
		try {
			conn = ClassConnector.connectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, contato.getNome());
			pstm.setInt(2, contato.getIdade());
			pstm.setString(3, contato.getContato());
			pstm.setInt(4, contato.getId());
			
			pstm.execute();
		} 
		
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstm!=null) {
					pstm.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}
	
	public static void deletar(Contato contato) {
		
		String sql = "DELETE FROM CONTATOS WHERE ID = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ClassConnector.connectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, contato.getId());
			
			pstm.execute();
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstm!=null) {
					pstm.close();
				}

			} 
			
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
