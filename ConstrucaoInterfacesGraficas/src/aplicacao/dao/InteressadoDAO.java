package aplicacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import aplicacao.model.InteressadoModel;

public class InteressadoDAO {
	
	public void incluir(InteressadoModel interessado) {
		
		String sql = "INSERT INTO interessado (nomeInteressado, enderecoInteressado, numeroInteressado, complementoInteressado, emailInteressado, telefoneInteressado, tipoResiduoInteressado, diaSemanaColetaInteressado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
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
			pstm.setString(8, interessado.getDiaSemanaColetaInteressado());			
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
		
		String sql = "DELETE FROM interessado WHERE nomeInteressado = ?";
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
		
		String sql = "UPDATE interessado SET enderecoInteressado = ?, numeroInteressado = ?, complementoInteressado = ?, emailInteressado = ?, telefoneInteressado = ?, tipoResiduoInteressado = ?, diaSemanaColetaInteressado = ?  WHERE nomeInteressado = ?";
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
			pstm.setString(8, interessado.getDiaSemanaColetaInteressado());			
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
	
	public ArrayList<InteressadoModel> consultar(InteressadoModel interessado) {
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ArrayList<InteressadoModel> listaInteressados = null;
		
		try {
			String sql = "SELECT * FROM interessado WHERE nomeInteressado = ?";
			con = ConexaoBD.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, interessado.getNomeInteressado());
			rs = pstm.executeQuery();
			
			if(rs != null) {
				listaInteressados = new ArrayList<>();
				
				while(rs.next()) {
					
					interessado = new InteressadoModel();
					interessado.setNomeInteressado(rs.getString("nomeInteressado"));
					interessado.setEnderecoInteressado(rs.getString("enderecoInteressado"));
					interessado.setNumeroInteressado(rs.getString("numeroInteressado"));
					interessado.setComplementoInteressado(rs.getString("complementoInteressado"));
					interessado.setEmailInteressado(rs.getString("emailInteressado"));
					interessado.setTelefoneInteressado(rs.getString("telefoneInteressado"));
					interessado.setTipoResiduoInteressado(rs.getString("tipoResiduoInteressado"));
					interessado.setDiaSemanaColetaInteressado(rs.getString("diaSemanaColetaInteressado"));
					listaInteressados.add(interessado);
					
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
