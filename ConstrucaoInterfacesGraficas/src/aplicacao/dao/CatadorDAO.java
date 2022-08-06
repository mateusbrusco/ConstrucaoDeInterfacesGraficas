package aplicacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import aplicacao.model.CatadorModel;
import aplicacao.model.InteressadoModel;

public class CatadorDAO {
	
	public void incluir(CatadorModel catador) {
		
		String sql = "INSERT INTO catador (nome, endereco, numero, complemento, email, telefone, tiporesiduo, diasemana, rotas) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConexaoBD.getConnection();
			
			pstm = con.prepareStatement(sql);
			pstm.setString(1, catador.getNomeCatador());
			pstm.setString(2, catador.getEnderecoCatador());
			pstm.setString(3, catador.getNumeroCatador());
			pstm.setString(4, catador.getComplementoCatador());
			pstm.setString(5, catador.getEmailCatador());
			pstm.setString(6, catador.getTelefoneCatador());
			pstm.setString(7, catador.getTipoResiduoColetado());
			pstm.setString(8, catador.getDiaSemanaEmQueColeta());
			pstm.setString(9, catador.getRotas());
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
	
	public void excluir(CatadorModel catador) {
		
	}
	
	public void alterar(CatadorModel catador) {
		
		String sql = "UPDATE catador SET endereco = ?, numero = ?, complemento = ?, email = ?, telefone = ?, tiporesiduo = ?, diasemana = ?, rotas = ? WHERE nome = ?";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConexaoBD.getConnection();
			
			pstm = con.prepareStatement(sql);
			pstm.setString(1, catador.getEnderecoCatador());
			pstm.setString(2, catador.getNumeroCatador());
			pstm.setString(3, catador.getComplementoCatador());
			pstm.setString(4, catador.getEmailCatador());
			pstm.setString(5, catador.getTelefoneCatador());
			pstm.setString(6, catador.getTipoResiduoColetado());
			pstm.setString(7, catador.getDiaSemanaEmQueColeta());
			pstm.setString(8, catador.getRotas());
			pstm.setString(9, catador.getNomeCatador());
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

	public ArrayList<CatadorModel> consultar(String nome) {
		
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement pstm = null;
		ArrayList<CatadorModel> catadores = null;
		
		try {
			String sql = "SELECT * FROM catador WHERE nome = ?";
			con = ConexaoBD.getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, nome);
			rs = pstm.executeQuery();
			
			if(rs != null) {
				catadores = new ArrayList<CatadorModel>();
				
				while(rs.next()) {
					CatadorModel catador = new CatadorModel();
					catador.setNomeCatador(rs.getString("nome"));
					catador.setEnderecoCatador(rs.getString("endereco"));
					catador.setNumeroCatador(rs.getString("numero"));
					catador.setComplementoCatador(rs.getString("complemento"));
					catador.setEmailCatador(rs.getString("email"));
					catador.setTelefoneCatador(rs.getString("telefone"));
					catador.setTipoResiduoColetado(rs.getString("tiporesiduo"));
					catador.setDiaSemanaEmQueColeta(rs.getString("diasemana"));
					catador.setRotas(rs.getString("rotas"));
					catadores.add(catador);
				}
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return catadores;
	}

}
