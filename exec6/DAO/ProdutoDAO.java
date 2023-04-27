package exec6.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exec6.connectionMySQL.ClassConnector;
import exec6.entities.Produto;

public class ProdutoDAO {
	
	public static List<Produto> listaProduto = new ArrayList<>();
	
	
	
 	public static void saveEstoqueProdutos(Produto produto) {
		String sql = "INSERT INTO ESTOQUEPRODUTO (NOME, CATEGORIA, VALOR, DESCRICAO, QUANTIDADE) VALUES(?, ?, ?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ClassConnector.connectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getCategoria());
			pstm.setDouble(3, produto.getValor());
			pstm.setString(4, produto.getDescricao());
			pstm.setInt(5, produto.getQuantidade());
			
			pstm.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(conn!=null) {
					conn.close();
				}
				
				if(pstm!=null) {
					pstm.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	public static void listarTodosProdutos(Produto produto) {
		String sql = "SELECT * FROM ESTOQUEPRODUTO";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = exec6.connectionMySQL.ClassConnector.connectionToMySQL(); 
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				produto.setIdproduto(rset.getInt("IDPRODUTO"));
				produto.setNome(rset.getString("NOME"));
				produto.setCategoria(rset.getString("CATEGORIA"));
				produto.setValor(rset.getDouble("VALOR"));
				produto.setNome(rset.getString("DESCRICAO"));
				
				listaProduto.add(produto);
			}
		}catch(Exception e){
				e.printStackTrace();
		}finally {
			
				try {
					if(conn!=null) {
						conn.close();}
					
					if(pstm!=null) {
						pstm.close();}
					
					if(rset!=null) {
						rset.close();}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
 	public static void updateEstoqueProdutos(Produto produto) {
		String sql = "UPDATE ESTOQUEPRODUTO SET NOME = ?, CATEGORIA = ?, VALOR = ?, DESCRICAO = ?, QUANTIDADE = ? "
				+ "WHERE IDProduto = ?;";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ClassConnector.connectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getCategoria());
			pstm.setDouble(3, produto.getValor());
			pstm.setString(4, produto.getDescricao());
			pstm.setInt(5, produto.getQuantidade());
			
			pstm.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(conn!=null) {
					conn.close();
				}
				
				if(pstm!=null) {
					pstm.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

 	public static void deleteEstoqueProdutos(Produto produto) {
		String sql = "DELETE FROM ESTOQUEPRODUTO WHERE IDProduto = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ClassConnector.connectionToMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, produto.getIdproduto());
			
			
			pstm.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(conn!=null) {
					conn.close();
				}
				
				if(pstm!=null) {
					pstm.close();
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}



}
