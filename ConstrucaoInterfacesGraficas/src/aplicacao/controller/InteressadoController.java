package aplicacao.controller;

import aplicacao.dao.InteressadoDAO;
import aplicacao.model.InteressadoModel;

public class InteressadoController {
	
	private InteressadoDAO interessadoDAO;
	private InteressadoModel interessado;
	
	
	public InteressadoController() {
		interessadoDAO = new InteressadoDAO();
	}
	
	
	public void incluir(String nomeInteressado, String enderecoInteressado, String numeroInteressado, String complementoInteressado, String emailInteressado, String telefoneInteressado, String tipoResiduoInteressado, String diaSemanaColetaInteressado) {
		interessado = new InteressadoModel();
		interessado.setNomeInteressado(nomeInteressado);
		interessado.setEnderecoInteressado(enderecoInteressado);
		interessado.setNumeroInteressado(numeroInteressado);
		interessado.setComplementoInteressado(complementoInteressado);
		interessado.setEmailInteressado(emailInteressado);
		interessado.setTelefoneInteressado(telefoneInteressado);
		interessado.setDiaSemanaColetaInteressado(diaSemanaColetaInteressado);
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
		interessado.setDiaSemanaColetaInteressado(diaSemanaColetaInteressado);
		interessado.setTipoResiduoInteressado(tipoResiduoInteressado);
		interessadoDAO.alterar(interessado);
	}
	
	public void consultar() {
		
	}


}