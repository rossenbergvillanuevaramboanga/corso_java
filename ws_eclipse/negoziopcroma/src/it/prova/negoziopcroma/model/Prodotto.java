package it.prova.negoziopcroma.model;

import java.util.List;
import java.util.Objects;



public abstract class Prodotto {
	
	private String id;
	
	public Prodotto(String id) {
		super();
		this.id = id;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		return Objects.equals(id, other.id);
	}


	public String getIndirizzoProdotto(List<Negozio> listaNegozi){
		for(Negozio negozio : listaNegozi) {
			for(Portatile portatile : negozio.getPortatili()) {
				if(portatile.getId().equals(this.id) || 
						portatile.getProcessore().getId().equals(this.id)||
						portatile.getSchedaMadre().getId().equals(this.id)) return negozio.getIndirizzo();
			}
			
		}
		return null; 
	}
	
	
	
}
