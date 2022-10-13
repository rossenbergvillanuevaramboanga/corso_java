package it.prova.eserciziocentrocommerciale.model;

public class Commesso extends Lavoratore{

	public Commesso(String nome, String cognome, Negozio negozio) {
		super(nome, cognome, negozio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean handleItemAdd(Item item) {
		// TODO Auto-generated method stub
		if(item==null) return false;
		return this.getNegozio().getListaItems().add(item);
		
	}

	@Override
	public boolean handleItemRemove(Item item) {
		// TODO Auto-generated method stub
		if(item==null) return false; 
		return this.getNegozio().getListaItems().remove(item);
	}

}
