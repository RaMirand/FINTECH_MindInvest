package br.com.minds.mindinvest;

import java.util.Date;

public class Tesouro extends Investimento {
	
	private String codigoSelic;
	private String titulo;
	private String descTitulo;
	private String nomeTitulo;
	private int qtdTesouto;
	private Date dataVencimento;
	
	
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
	public String getNomeTitulo() {
		return nomeTitulo;
	}
	public void setNomeTitulo(String nomeTitulo) {
		this.nomeTitulo = nomeTitulo;
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
	
}
