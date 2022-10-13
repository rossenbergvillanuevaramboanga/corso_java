package it.prova.eserciziocentrocommerciale.model;

import java.util.Objects;

public abstract class Lavoratore {
	
	protected String nome; 
	protected String cognome; 
	private Negozio negozio; 

	public Lavoratore(String nome, String cognome, Negozio negozio) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.negozio = negozio;
	}

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
	
	public Negozio getNegozio() {
		return negozio;
	}

	public void setNegozio(Negozio negozio) {
		this.negozio = negozio;
	}

	public abstract boolean handleItemAdd(Item item);
	
	public abstract boolean handleItemRemove(Item item);

	@Override
	public int hashCode() {
		return Objects.hash(cognome, negozio, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lavoratore other = (Lavoratore) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(negozio, other.negozio)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Lavoratore [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
	

}
