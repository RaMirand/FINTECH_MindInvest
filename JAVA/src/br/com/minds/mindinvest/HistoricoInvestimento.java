package br.com.minds.mindinvest;

import java.util.Date;

public class HistoricoInvestimento {
	
	private String idHistInvestimento;
	private float vlrUnit;
	private int unidades;
	private Date dataOperacao;
	
	
	public String getIdHistInvestimento() {
		return idHistInvestimento;
	}
	public void setIdHistInvestimento(String idHistInvestimento) {
		this.idHistInvestimento = idHistInvestimento;
	}
	public float getVlrUnit() {
		return vlrUnit;
	}
	public void setVlrUnit(float vlrUnit) {
		this.vlrUnit = vlrUnit;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Date getDataOperacao() {
		return dataOperacao;
	}
	public void setDataOperacao(Date dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

}
