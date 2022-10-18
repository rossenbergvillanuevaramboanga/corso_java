package it.prova.negoziopcroma.model;

import java.util.ArrayList;
import java.util.List;

public class Negozio {
	
	private String indirizzo; 
	private List<Portatile> portatili = new  ArrayList<Portatile>();
	
	public Negozio(String indirizzo, List<Portatile> prodottiList) {
		super();
		this.indirizzo = indirizzo;
		this.portatili = prodottiList;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<Portatile> getPortatili() {
		return portatili;
	}

	public void setPortatili(List<Portatile> portatili) {
		this.portatili = portatili;
	}
	
	

	
	



}
