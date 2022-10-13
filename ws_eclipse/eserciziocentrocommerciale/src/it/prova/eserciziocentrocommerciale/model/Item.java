package it.prova.eserciziocentrocommerciale.model;

import java.util.Objects;

public class Item {
	
	private String codice;
	private String descrizione;
	private int prezzo; 
	private Negozio negozio;
	
	public Item(String codice, String descrizione, int prezzo, Negozio negozio) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.negozio = negozio;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public Negozio getNegozio() {
		return negozio;
	}

	public void setNegozio(Negozio negozio) {
		this.negozio = negozio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codice, descrizione, negozio, prezzo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(codice, other.codice) && Objects.equals(descrizione, other.descrizione)
				&& Objects.equals(negozio, other.negozio) && prezzo == other.prezzo;
	}

	@Override
	public String toString() {
		return "Item [codice=" + codice + ", descrizione=" + descrizione + ", prezzo=" + prezzo + "]";
	} 
	
	
	
	
	
	
	
	

}
