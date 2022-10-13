package it.prova.eserciziocentrocommerciale.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Negozio {
	
	private String ragioneSociale;
	private String partitaIva;
	
	private CentroCommerciale centroCommerciale;
	private List<Lavoratore> listaLavoratori = new ArrayList<Lavoratore>(); 
	private List<Item> listaItems = new ArrayList<Item>();
	
	public Negozio(String ragioneSociale, String partitaIva, CentroCommerciale centroCommerciale,
			List<Lavoratore> listaLavoratori, List<Item> listaItems) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.partitaIva = partitaIva;
		this.centroCommerciale = centroCommerciale;
		this.listaLavoratori = listaLavoratori;
		this.listaItems = listaItems;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public CentroCommerciale getCentroCommerciale() {
		return centroCommerciale;
	}

	public void setCentroCommerciale(CentroCommerciale centroCommerciale) {
		this.centroCommerciale = centroCommerciale;
	}

	public List<Lavoratore> getListaLavoratori() {
		return listaLavoratori;
	}

	public void setListaLavoratori(List<Lavoratore> listaLavoratori) {
		this.listaLavoratori = listaLavoratori;
	}

	public List<Item> getListaItems() {
		return listaItems;
	}

	public void setListaItems(List<Item> listaItems) {
		this.listaItems = listaItems;
	} 
	
	public boolean addToItems(Lavoratore lavoratore, Item item) {
		if(lavoratore == null || item == null) return false;
		if(!item.getNegozio().equals(this)) return false;
		if(!lavoratore.getNegozio().equals(this)) return false;
		return lavoratore.handleItemAdd(item);
	}
	
	public boolean removeFromItems(Lavoratore lavoratore, Item item) {
		if(lavoratore == null || item == null) return false;
		if(!item.getNegozio().equals(this)) return false;
		if(!lavoratore.getNegozio().equals(this)) return false;
		return lavoratore.handleItemRemove(item); 
	}

	@Override
	public int hashCode() {
		return Objects.hash(centroCommerciale, listaItems, listaLavoratori, partitaIva, ragioneSociale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Negozio other = (Negozio) obj;
		return Objects.equals(centroCommerciale, other.centroCommerciale)
				&& Objects.equals(listaItems, other.listaItems)
				&& Objects.equals(listaLavoratori, other.listaLavoratori)
				&& Objects.equals(partitaIva, other.partitaIva) && Objects.equals(ragioneSociale, other.ragioneSociale);
	}

	@Override
	public String toString() {
		return "Negozio [ragioneSociale=" + ragioneSociale + ", partitaIva=" + partitaIva + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
