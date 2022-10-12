package it.prova.gestionehotel.model;

public class Rappresentate extends Cliente {

	public Rappresentate(String nome, String cognome, Stanza stanza) {
		super(nome, cognome, stanza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int sommaRealeDaPagare() {
		// TODO Auto-generated method stub
		return (int) (this.getStanza().getQuantoAPersona() * 0.8);
	}

}
