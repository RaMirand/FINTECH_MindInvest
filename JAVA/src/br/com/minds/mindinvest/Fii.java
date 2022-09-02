package br.com.minds.mindinvest;

public class Fii extends Investimento {
	
	private String ticker;
	private String nomeFII;
	public Investimento investimento;
	
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public String getNomeFII() {
		return nomeFII;
	}
	public void setNomeFII(String nomeFII) {
		this.nomeFII = nomeFII;
	}
	public Fii(Carteira carteira, String tipoInvestimento, boolean status, Investimento investimento, String ticker, String nomeFII) {
		super(carteira, tipoInvestimento, status);
		this.ticker = ticker;
		this.nomeFII = nomeFII;
		this.investimento = investimento;
	}

}
