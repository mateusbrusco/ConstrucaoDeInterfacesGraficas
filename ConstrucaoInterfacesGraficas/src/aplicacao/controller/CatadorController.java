package aplicacao.controller;

import java.util.ArrayList;

import aplicacao.dao.CatadorDAO;
import aplicacao.model.CatadorModel;
import aplicacao.model.InteressadoModel;

public class CatadorController {
	
	private CatadorDAO catadorDAO;
	private CatadorModel catador;
	
	
	public CatadorController() {
		catadorDAO = new CatadorDAO();
	}
	
	public void incluir(String nomeCatador, String enderecoCatador, String numeroCatador, String complementoCatador, String emailCatador, String telefoneCatador, String tipoResiduoColetado, String diaSemanaEmQueColeta, String rotas) {
		catador = new CatadorModel();
		catador.setNomeCatador(nomeCatador);
		catador.setEnderecoCatador(enderecoCatador);
		catador.setNumeroCatador(numeroCatador);
		catador.setComplementoCatador(complementoCatador);
		catador.setEmailCatador(emailCatador);
		catador.setTelefoneCatador(telefoneCatador);
		catador.setDiaSemanaEmQueColeta(diaSemanaEmQueColeta);
		catador.setTipoResiduoColetado(tipoResiduoColetado);
		catador.setRotas(rotas);
		catadorDAO.incluir(catador);
	}
	
	public void excluir(String nomeCatador) {
		catador = new CatadorModel();
		catador.setNomeCatador(nomeCatador);
		catadorDAO.excluir(catador);
	}
	

	public ArrayList<CatadorModel> consultar(String nome){
		return new CatadorModel().consultar(nome);
	}

	public void alterar(String nomeCatador, String enderecoCatador, String numeroCatador, String complementoCatador, String emailCatador, String telefoneCatador, String tipoResiduoColetado, String diaSemanaEmQueColeta, String rotas) {
		catador = new CatadorModel();
		catador.setNomeCatador(nomeCatador);
		catador.setEnderecoCatador(enderecoCatador);
		catador.setNumeroCatador(numeroCatador);
		catador.setComplementoCatador(complementoCatador);
		catador.setEmailCatador(emailCatador);
		catador.setTelefoneCatador(telefoneCatador);
		catador.setDiaSemanaEmQueColeta(diaSemanaEmQueColeta);
		catador.setTipoResiduoColetado(tipoResiduoColetado);
		catador.setRotas(rotas);
		catadorDAO.alterar(catador);
	}


}
