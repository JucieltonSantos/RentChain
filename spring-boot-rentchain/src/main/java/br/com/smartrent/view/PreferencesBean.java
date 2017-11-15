package br.com.smartrent.view;

import br.com.smartrent.model.Segmento;

public class PreferencesBean {
	
	
	private Segmento segmentoEscolhido;

	private boolean bares;

	public Segmento getSegmentoEscolhido() {
		return segmentoEscolhido;
	}

	public void setSegmentoEscolhido(Segmento segmentoEscolhido) {
		this.segmentoEscolhido = segmentoEscolhido;
	}

	public boolean isBares() {
		return bares;
	}

	public void setBares(boolean bares) {
		this.bares = bares;
	}
	
	
	private String texto;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	
	
}
