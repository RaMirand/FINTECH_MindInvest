package br.com.minds.mindinvest;

public class Fundo extends Investimento {
	
	private String nomeFundo;
	private String classeFundo;
	private String cnpjFundo;	
	public Investimento investimento;
	
	public String getNomeFundo() {
		return nomeFundo;
	}
	public void setNomeFundo(String nomeFundo) {
		this.nomeFundo = nomeFundo;
	}
	public String getClasseFundo() {
		return classeFundo;
	}
	public void setClasseFundo(String classeFundo) {
		this.classeFundo = classeFundo;
	}
	public String getCnpjFundo() {
		return cnpjFundo;
	}
	public void setCnpjFundo(String cnpjFundo) {
		this.cnpjFundo = cnpjFundo;
	}
//	public Fundo(Investimento investimento, String nomeFundo, String classeFundo, String cnpjFundo) {
//		super();
//		this.nomeFundo = nomeFundo;
//		this.classeFundo = classeFundo;
//		this.cnpjFundo = cnpjFundo;		
//	}
	public Fundo(Carteira carteira, String tipoInvestimento, boolean status, String nomeFundo, String classeFundo,
			String cnpjFundo, Investimento investimento) {
		super(carteira, tipoInvestimento, status);
		this.nomeFundo = nomeFundo;
		this.classeFundo = classeFundo;
		this.cnpjFundo = cnpjFundo;
		this.investimento = investimento;
	}
}
