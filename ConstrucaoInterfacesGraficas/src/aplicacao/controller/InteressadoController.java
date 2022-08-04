package aplicacao.controller;

import java.util.ArrayList;

import aplicacao.dao.InteressadoDAO;
import aplicacao.model.InteressadoModel;

public class InteressadoController {
	
	private InteressadoDAO interessadoDAO;
	private InteressadoModel interessado;
	
	
	public InteressadoController() {
		interessadoDAO = new InteressadoDAO();
	}
	
	
	public void incluir(String nomeInteressado, String enderecoInteressado, String numeroInteressado, String complementoInteressado, String emailInteressado, String telefoneInteressado, String tipoResiduoInteressado, String diaSemanaInteressado) {
		interessado = new InteressadoModel();
		interessado.setNomeInteressado(nomeInteressado);
		interessado.setEnderecoInteressado(enderecoInteressado);
		interessado.setNumeroInteressado(numeroInteressado);
		interessado.setComplementoInteressado(complementoInteressado);
		interessado.setEmailInteressado(emailInteressado);
		interessado.setTelefoneInteressado(telefoneInteressado);
		interessado.setDiaSemanaInteressado(diaSemanaInteressado);
		interessado.setTipoResiduoInteressado(tipoResiduoInteressado);
		interessadoDAO.incluir(interessado);
	}
	
	public void excluir(String nomeInteressado) {
		interessado = new InteressadoModel();
		interessado.setNomeInteressado(nomeInteressado);
		interessadoDAO.excluir(interessado);
	}
	
	public void alterar(String nomeInteressado, String enderecoInteressado, String numeroInteressado, String complementoInteressado, String emailInteressado, String telefoneInteressado, String tipoResiduoInteressado, String diaSemanaColetaInteressado) {
		interessado = new InteressadoModel();
		interessado.setNomeInteressado(nomeInteressado);
		interessado.setEnderecoInteressado(enderecoInteressado);
		interessado.setNumeroInteressado(numeroInteressado);
		interessado.setComplementoInteressado(complementoInteressado);
		interessado.setEmailInteressado(emailInteressado);
		interessado.setTelefoneInteressado(telefoneInteressado);
		interessado.setDiaSemanaInteressado(diaSemanaColetaInteressado);
		interessado.setTipoResiduoInteressado(tipoResiduoInteressado);
		interessadoDAO.alterar(interessado);
	}
	
	public ArrayList<InteressadoModel> consultar(String nome){
		return new InteressadoModel().consultar(nome);
	}


}
