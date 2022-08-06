package aplicacao.model;

import java.util.ArrayList;

import aplicacao.dao.CatadorDAO;
import aplicacao.dao.InteressadoDAO;

public class CatadorModel {
	
	private String nomeCatador;
	private String enderecoCatador;
	private String numeroCatador;
	private String complementoCatador;
	private String emailCatador;
	private String telefoneCatador;
	private String tipoResiduoColetado;
	private String diaSemanaEmQueColeta;
	private String rotas;
	
	public CatadorModel () {
		super();
	}
	
	public CatadorModel(String nomeCatador, String enderecoCatador, String numeroCatador, String complementoCatador, String emailCatador, String telefoneCatador, String tipoResiduoColetado, String diaSemanaEmQueColeta, String rotas) {
		super();
		this.nomeCatador = nomeCatador; 
		this.enderecoCatador = enderecoCatador;
		this.numeroCatador = numeroCatador;
		this.complementoCatador = complementoCatador;
		this.emailCatador = emailCatador;
		this.telefoneCatador = telefoneCatador;
		this.tipoResiduoColetado = tipoResiduoColetado; 
		this.diaSemanaEmQueColeta = diaSemanaEmQueColeta;
		this.rotas = rotas;
	}

	public String getNomeCatador() {
		return nomeCatador;
	}

	public void setNomeCatador(String nomeCatador) {
		this.nomeCatador = nomeCatador;
	}

	public String getEnderecoCatador() {
		return enderecoCatador;
	}

	public void setEnderecoCatador(String enderecoCatador) {
		this.enderecoCatador = enderecoCatador;
	}

	public String getNumeroCatador() {
		return numeroCatador;
	}

	public void setNumeroCatador(String numeroCatador) {
		this.numeroCatador = numeroCatador;
	}

	public String getComplementoCatador() {
		return complementoCatador;
	}

	public void setComplementoCatador(String complementoCatador) {
		this.complementoCatador = complementoCatador;
	}

	public String getEmailCatador() {
		return emailCatador;
	}

	public void setEmailCatador(String emailCatador) {
		this.emailCatador = emailCatador;
	}

	public String getTelefoneCatador() {
		return telefoneCatador;
	}

	public void setTelefoneCatador(String telefoneCatador) {
		this.telefoneCatador = telefoneCatador;
	}

	public String getTipoResiduoColetado() {
		return tipoResiduoColetado;
	}

	public void setTipoResiduoColetado(String tipoResiduoColetado) {
		this.tipoResiduoColetado = tipoResiduoColetado;
	}

	public String getDiaSemanaEmQueColeta() {
		return diaSemanaEmQueColeta;
	}

	public void setDiaSemanaEmQueColeta(String diaSemanaEmQueColeta) {
		this.diaSemanaEmQueColeta = diaSemanaEmQueColeta;
	}
	
	public String getRotas() {
		return rotas;
	}

	public void setRotas(String rotas) {
		this.rotas = rotas;
	}
	
	public ArrayList<CatadorModel> consultar(String nome){
		return new CatadorDAO().consultar(nome);
	}



}
