package br.com.minds.mindinvest;

public class Acao extends Investimento {
	
	private String ticker;
	private String nomeAcao;
	private Investimento investimento;
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getNomeAcao() {
		return nomeAcao;
	}
	public void setNomeAcao(String nomeAcao) {
		this.nomeAcao = nomeAcao;
	}
	public Acao(Carteira carteira, String tipoInvestimento, boolean status, Investimento investimento, String ticker, String nomeAcao) {
		super(carteira, tipoInvestimento, status);
		this.ticker = ticker;
		this.nomeAcao = nomeAcao;
		this.investimento = investimento;
	}
	
}
