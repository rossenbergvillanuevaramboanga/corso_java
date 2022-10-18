package it.prova.negoziopcroma.model;

import java.util.Objects;

public class Portatile extends Prodotto {
	
	private SchedaMadre schedaMadre; 
	private Processore processore;

	
	public Portatile(String id, SchedaMadre schedaMadre, Processore processore) {
		super(id);
		// TODO Auto-generated constructor stub
		this.schedaMadre = schedaMadre;
		this.processore = processore;
	}
	
	public Portatile(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}


	public SchedaMadre getSchedaMadre() {
		return schedaMadre;
	}


	public void setSchedaMadre(SchedaMadre schedaMadre) {
		this.schedaMadre = schedaMadre;
	}


	public Processore getProcessore() {
		return processore;
	}


	public void setProcessore(Processore processore) {
		this.processore = processore;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(processore, schedaMadre);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portatile other = (Portatile) obj;
		return Objects.equals(processore, other.processore) && Objects.equals(schedaMadre, other.schedaMadre);
	}
	
	
	
	
	
	

}
