package aplicacao.model;

public class InteressadoModel {
	
	private String nomeInteressado;
	private String enderecoInteressado;
	private String numeroInteressado;
	private String complementoInteressado;
	private String emailInteressado;
	private String telefoneInteressado;
	private String tipoResiduoInteressado;
	private String diaSemanaColetaInteressado;
	
	public InteressadoModel () {
		super();
	}
	
	public InteressadoModel(String nomeInteressado, String enderecoInteressado, String numeroInteressado, String complementoInteressado, String emailInteressado, String telefoneInteressado, String tipoResiduoInteressado, String diaSemanaColetaInteressado) {
		super();
		this.nomeInteressado = nomeInteressado; 
		this.enderecoInteressado = enderecoInteressado;
		this.numeroInteressado = numeroInteressado;
		this.complementoInteressado = complementoInteressado;
		this.emailInteressado = emailInteressado;
		this.telefoneInteressado = telefoneInteressado;
		this.tipoResiduoInteressado = tipoResiduoInteressado; 
		this.diaSemanaColetaInteressado = diaSemanaColetaInteressado;
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

	public String getDiaSemanaColetaInteressado() {
		return diaSemanaColetaInteressado;
	}

	public void setDiaSemanaColetaInteressado(String diaSemanaColetaInteressado) {
		this.diaSemanaColetaInteressado = diaSemanaColetaInteressado;
	}

	
	
	
}
