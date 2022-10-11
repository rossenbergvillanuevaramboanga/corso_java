package it.prova.esempioo.model;

public class Indirizzo {
	
	private String citta; 
	private String via;
	private String civicoString;
	
	public Indirizzo() {}
	

	public Indirizzo(String citta, String via, String civicoString) {
		super();
		this.citta = citta;
		this.via = via;
		this.civicoString = civicoString;
	}


	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}


	public String getVia() {
		return via;
	}


	public void setVia(String via) {
		this.via = via;
	}


	public String getCivicoString() {
		return civicoString;
	}


	public void setCivicoString(String civicoString) {
		this.civicoString = civicoString;
	}
	
	
	
	

}
