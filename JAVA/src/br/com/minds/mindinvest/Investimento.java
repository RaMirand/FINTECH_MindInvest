package br.com.minds.mindinvest;

public class Investimento {
	
	private String idInvestimento;
	private String tipoInvestimento;
	private float valorInvestido;
	private float valorAtual;
	private boolean status;
	private Carteira carteira;
	
	
	public String getIdInvestimento() {
		return idInvestimento;
	}
	public void setIdInvestimento(String idInvestimento) {
		this.idInvestimento = idInvestimento;
	}
	public String getTipoInvestimento() {
		return tipoInvestimento;
	}
	public void setTipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}
	public float getValorInvestido() {
		return valorInvestido;
	}
	public void setValorInvestido(float valorInvestido) {
		this.valorInvestido = valorInvestido;
	}
	public float getValorAtual() {
		return valorAtual;
	}
	public void setValorAtual(float valorAtual) {
		this.valorAtual = valorAtual;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Carteira getCarteira() {
		return carteira;
	}
	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}
	public Investimento(Carteira carteira, String tipoInvestimento, boolean status) {
		super();
		this.carteira = carteira;
		this.tipoInvestimento = tipoInvestimento;
		this.status = status;
	}
}
