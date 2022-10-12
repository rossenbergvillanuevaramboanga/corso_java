package it.prova.gestionehotel.model;

public abstract class Cliente {
	
	private String nome; 
	private String cognome;
	private Stanza stanza;
	
	public Cliente(String nome, String cognome, Stanza stanza) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.stanza = stanza;
	}
	
	
	
	public abstract int sommaRealeDaPagare();



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public Stanza getStanza() {
		return stanza;
	}



	public void setStanza(Stanza stanza) {
		this.stanza = stanza;
	}
	
	
	
	
	
	
	
	

}
