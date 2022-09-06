package br.com.minds.mindinvest;

public class Carteira {
	
	private String idCarteira;
	private String nomeCarteira;
	private String tipoCarteira;
	private Usuario usuario;
	
	
	public String getIdCarteira() {
		return idCarteira;
	}
	public void setIdCarteira(String idCarteira) {
		this.idCarteira = idCarteira;
	}
	public String getNomeCarteira() {
		return nomeCarteira;
	}
	public void setNomeCarteira(String nomeCarteira) {
		this.nomeCarteira = nomeCarteira;
	}
	public String getTipoCarteira() {
		System.out.println(tipoCarteira);
		return tipoCarteira;
	}
	public void setTipoCarteira(String tipoCarteira) {
		this.tipoCarteira = tipoCarteira;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Carteira (Usuario usuario, String nomeCarteira, String tipoCarteira) {
		super();
		this.usuario = usuario;
		this.nomeCarteira = nomeCarteira;
		this.tipoCarteira = tipoCarteira;
	}
}
