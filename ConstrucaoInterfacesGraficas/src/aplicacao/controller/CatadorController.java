package aplicacao.controller;

import aplicacao.dao.CatadorDAO;
import aplicacao.model.CatadorModel;

public class CatadorController {
	
	private CatadorDAO catadorDAO;
	private CatadorModel catador;
	
	
	public CatadorController() {
		catadorDAO = new CatadorDAO();
	}
	
	public void incluir(String nomeCatador, String enderecoCatador, String numeroCatador, String complementoCatador, String emailCatador, String telefoneCatador, String tipoResiduoColetado, String diaSemanaEmQueColeta) {
		catador = new CatadorModel();
		catador.setNomeCatador(nomeCatador);
		catador.setEnderecoCatador(enderecoCatador);
		catador.setNumeroCatador(numeroCatador);
		catador.setComplementoCatador(complementoCatador);
		catador.setEmailCatador(emailCatador);
		catador.setTelefoneCatador(telefoneCatador);
		catador.setDiaSemanaEmQueColeta(diaSemanaEmQueColeta);
		catador.setTipoResiduoColetado(tipoResiduoColetado);
		catadorDAO.incluir(catador);
	}
	
	public void excluir(String nomeCatador) {
		catador = new CatadorModel();
		catador.setNomeCatador(nomeCatador);
		catadorDAO.excluir(catador);
	}
	
	public void alterar(String nomeCatador, String enderecoCatador, String numeroCatador, String complementoCatador, String emailCatador, String telefoneCatador, String tipoResiduoColetado, String diaSemanaEmQueColeta) {
		catador = new CatadorModel();
		catador.setNomeCatador(nomeCatador);
		catador.setEnderecoCatador(enderecoCatador);
		catador.setNumeroCatador(numeroCatador);
		catador.setComplementoCatador(complementoCatador);
		catador.setEmailCatador(emailCatador);
		catador.setTelefoneCatador(telefoneCatador);
		catador.setDiaSemanaEmQueColeta(diaSemanaEmQueColeta);
		catador.setTipoResiduoColetado(tipoResiduoColetado);
		catadorDAO.alterar(catador);
	}
	
	public void consultar() {
		
	}


}