package br.com.minds.mindinvest;

import java.util.Date;

public class Tesouro extends Investimento {
	
	private String codigoSelic;
	private String titulo;
	private String descTitulo;
	private int qtdTesouto;
	private Date dataVencimento;
	private Investimento investimento;
	
	
	public String getCodigoSelic() {
		return codigoSelic;
	}
	public void setCodigoSelic(String codigoSelic) {
		this.codigoSelic = codigoSelic;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescTitulo() {
		return descTitulo;
	}
	public void setDescTitulo(String descTitulo) {
		this.descTitulo = descTitulo;
	}
	public int getQtdTesouto() {
		return qtdTesouto;
	}
	public void setQtdTesouto(int qtdTesouto) {
		this.qtdTesouto = qtdTesouto;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Tesouro(Carteira carteira, String tipoInvestimento, boolean status, String codigoSelic, String titulo,
			String descTitulo, int qtdTesouto, Date dataVencimento) {
		super(carteira, tipoInvestimento, status);
		this.codigoSelic = codigoSelic;
		this.titulo = titulo;
		this.descTitulo = descTitulo;
		this.qtdTesouto = qtdTesouto;
		this.dataVencimento = dataVencimento;
	}
}
