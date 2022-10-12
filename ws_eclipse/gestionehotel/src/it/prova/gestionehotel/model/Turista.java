package it.prova.gestionehotel.model;

public class Turista extends Cliente{

	public Turista(String nome, String cognome, Stanza stanza) {
		super(nome, cognome, stanza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int sommaRealeDaPagare() {
		// TODO Auto-generated method stub
		return this.getStanza().getQuantoAPersona();
	}
	
	
	
	

}
