package aplicacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import aplicacao.model.InteressadoModel;

public class InteressadoDAO {
	
	public void incluir(InteressadoModel interessado) {
		
		String sql = "INSERT INTO interessado (nome, endereco, numero, complemento, email, telefone, tiporesiduo, diasemana) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConexaoBD.getConnection();
			
			pstm = con.prepareStatement(sql);
			pstm.setString(1, interessado.getNomeInteressado());
			pstm.setString(2, interessado.getEnderecoInteressado());
			pstm.setString(3, interessado.getNumeroInteressado());
			pstm.setString(4, interessado.getComplementoInteressado());
			pstm.setString(5, interessado.getEmailInteressado());
			pstm.setString(6, interessado.getTelefoneInteressado());
			pstm.setString(7, interessado.getTipoResiduoInteressado());
			pstm.setString(8, interessado.getDiaSemanaInteressado());			
			pstm.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void excluir(InteressadoModel interessado) {
		
		String sql = "DELETE FROM interessado WHERE nome = ?";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConexaoBD.getConnection();
			
			pstm = con.prepareStatement(sql);
			pstm.setString(1, interessado.getNomeInteressado());		
			pstm.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void alterar(InteressadoModel interessado) {
		
		String sql = "UPDATE interessado SET endereco = ?, numero = ?, complemento = ?, email = ?, telefone = ?, tiporesiduo = ?, diasemana = ?  WHERE nome = ?";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConexaoBD.getConnection();
			
			pstm = con.prepareStatement(sql);
			pstm.setString(1, interessado.getEnderecoInteressado());
			pstm.setString(2, interessado.getNumeroInteressado());
			pstm.setString(3, interessado.getComplementoInteressado());
			pstm.setString(4, interessado.getEmailInteressado());
			pstm.setString(5, interessado.getTelefoneInteressado());
			pstm.setString(6, interessado.getTipoResiduoInteressado());
			pstm.setString(7, interessado.getDiaSemanaInteressado());
			pstm.setString(8, interessado.getNomeInteressado());
			pstm.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public ArrayList<InteressadoModel> consultar(String nome) {
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ArrayList<InteressadoModel> interessados = null;
		
		try {
			String sql = "SELECT * FROM interessado WHERE nome = ?";
			con = ConexaoBD.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, nome);
			rs = pstm.executeQuery();
			
			if(rs != null) {
				interessados = new ArrayList<InteressadoModel>();
				
				while(rs.next()) {
					InteressadoModel interessado = new InteressadoModel();
					interessado.setNomeInteressado(rs.getString("nome"));
					interessado.setEnderecoInteressado(rs.getString("endereco"));
					interessado.setNumeroInteressado(rs.getString("numero"));
					interessado.setComplementoInteressado(rs.getString("complemento"));
					interessado.setEmailInteressado(rs.getString("email"));
					interessado.setTelefoneInteressado(rs.getString("telefone"));
					interessado.setTipoResiduoInteressado(rs.getString("tiporesiduo"));
					interessado.setDiaSemanaInteressado(rs.getString("diasemana"));
					interessados.add(interessado);
				}
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return interessados;
	}

}
