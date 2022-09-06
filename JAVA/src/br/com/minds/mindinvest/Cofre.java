package br.com.minds.mindinvest;

public class Cofre {
	
	private String idCofre;
	private String nomeCofre;
	private float vlrCofre;
	private String tipoCofre;
	private float balancoCofre;
	private Usuario usuario;
	
	
	public String getIdCofre() {
		return idCofre;
	}
	public void setIdCofre(String idCofre) {
		this.idCofre = idCofre;
	}
	public String getNomeCofre() {
		return nomeCofre;
	}
	public void setNomeCofre(String nomeCofre) {
		this.nomeCofre = nomeCofre;
	}
	public float getVlrCofre() {
		return vlrCofre;
	}
	public void setVlrCofre(float vlrCofre) {
		this.vlrCofre = vlrCofre;
	}
	public String getTipoCofre() {
		return tipoCofre;
	}
	public void setTipoCofre(String tipoCofre) {
		this.tipoCofre = tipoCofre;
	}
	public float getBalancoCofre() {
		return balancoCofre;
	}
	public void setBalancoCofre(float balancoCofre) {
		this.balancoCofre = balancoCofre;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
