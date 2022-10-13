package it.prova.eserciziocentrocommerciale.model;

public class Boss extends Lavoratore {

	public Boss(String nome, String cognome, Negozio negozio) {
		super(nome, cognome, negozio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handleItemAdd(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleItemRemove(Item item) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
