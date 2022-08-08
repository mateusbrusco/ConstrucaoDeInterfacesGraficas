package aplicacao.model;

import java.util.ArrayList;

import aplicacao.dao.InteressadoDAO;

public class InteressadoModel {
	
	private String nomeInteressado;
	private String enderecoInteressado;
	private String numeroInteressado;
	private String complementoInteressado;
	private String emailInteressado;
	private String telefoneInteressado;
	private String tipoResiduoInteressado;
	private String diaSemanaInteressado;
	private String latitudeInteressado;
	private String longitudeInteressado;
	
	public String getLatitudeInteressado() {
		return latitudeInteressado;
	}

	public void setLatitudeInteressado(String latitudeInteressado) {
		this.latitudeInteressado = latitudeInteressado;
	}

	public String getLongitudeInteressado() {
		return longitudeInteressado;
	}

	public void setLongitudeInteressado(String longitudeInteressado) {
		this.longitudeInteressado = longitudeInteressado;
	}

	public InteressadoModel () {
		super();
	}
	
	public InteressadoModel(String nomeInteressado, String enderecoInteressado, String numeroInteressado, String complementoInteressado, String emailInteressado, String telefoneInteressado, String tipoResiduoInteressado, String diaSemanaInteressado) {
		super();
		this.nomeInteressado = nomeInteressado; 
		this.enderecoInteressado = enderecoInteressado;
		this.numeroInteressado = numeroInteressado;
		this.complementoInteressado = complementoInteressado;
		this.emailInteressado = emailInteressado;
		this.telefoneInteressado = telefoneInteressado;
		this.tipoResiduoInteressado = tipoResiduoInteressado; 
		this.diaSemanaInteressado = diaSemanaInteressado;
	}

	public String getNomeInteressado() {
		return nomeInteressado;
	}

	public void setNomeInteressado(String nomeInteressado) {
		this.nomeInteressado = nomeInteressado;
	}

	public String getEnderecoInteressado() {
		return enderecoInteressado;
	}

	public void setEnderecoInteressado(String enderecoInteressado) {
		this.enderecoInteressado = enderecoInteressado;
	}

	public String getNumeroInteressado() {
		return numeroInteressado;
	}

	public void setNumeroInteressado(String numeroInteressado) {
		this.numeroInteressado = numeroInteressado;
	}

	public String getComplementoInteressado() {
		return complementoInteressado;
	}

	public void setComplementoInteressado(String complementoInteressado) {
		this.complementoInteressado = complementoInteressado;
	}

	public String getEmailInteressado() {
		return emailInteressado;
	}

	public void setEmailInteressado(String emailInteressado) {
		this.emailInteressado = emailInteressado;
	}

	public String getTelefoneInteressado() {
		return telefoneInteressado;
	}

	public void setTelefoneInteressado(String telefoneInteressado) {
		this.telefoneInteressado = telefoneInteressado;
	}

	public String getTipoResiduoInteressado() {
		return tipoResiduoInteressado;
	}

	public void setTipoResiduoInteressado(String tipoResiduoInteressado) {
		this.tipoResiduoInteressado = tipoResiduoInteressado;
	}

	public String getDiaSemanaInteressado() {
		return diaSemanaInteressado;
	}

	public void setDiaSemanaInteressado(String diaSemanaInteressado) {
		this.diaSemanaInteressado = diaSemanaInteressado;
	}
	
	public ArrayList<InteressadoModel> consultar(String nome){
		return new InteressadoDAO().consultar(nome);
	}

	
	
	
}
