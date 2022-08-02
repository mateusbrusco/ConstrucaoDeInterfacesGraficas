package aplicacao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import aplicacao.model.CatadorModel;

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
		
	}
	
	public CatadorModel consultar(CatadorModel catador) {
		return null;
		
	}

}
