package br.com.minds.mindinvest;

import java.util.Date;

public class Transacao {
	
	private String idTransacao;
	private String tipoTransacao;
	private String naturezaTransacao;
	private Date dataTransacao;
	private boolean recorrente;
	private String descTransacao;
	
	
	public String getIdTransacao() {
		return idTransacao;
	}
	public void setIdTransacao(String idTransacao) {
		this.idTransacao = idTransacao;
	}
	public String getTipoTransacao() {
		return tipoTransacao;
	}
	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	public String getNaturezaTransacao() {
		return naturezaTransacao;
	}
	public void setNaturezaTransacao(String naturezaTransacao) {
		this.naturezaTransacao = naturezaTransacao;
	}
	public Date getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public boolean isRecorrente() {
		return recorrente;
	}
	public void setRecorrente(boolean recorrente) {
		this.recorrente = recorrente;
	}
	public String getDescTransacao() {
		return descTransacao;
	}
	public void setDescTransacao(String descTransacao) {
		this.descTransacao = descTransacao;
	}

}
