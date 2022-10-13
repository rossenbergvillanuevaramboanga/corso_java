package it.prova.eserciziocentrocommerciale.model;

import java.util.ArrayList;
import java.util.List;

public class CentroCommerciale {
	
	private String ragioneSociale; 
	private String indirizzoPerEsteso;
	private List<Negozio> listaNegozi = new ArrayList<Negozio>();
	
	public CentroCommerciale(String ragioneSociale, String indirizzoPerEsteso, List<Negozio> listaNegozi) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.indirizzoPerEsteso = indirizzoPerEsteso;
		this.listaNegozi = listaNegozi;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public String getIndirizzoPerEsteso() {
		return indirizzoPerEsteso;
	}

	public void setIndirizzoPerEsteso(String indirizzoPerEsteso) {
		this.indirizzoPerEsteso = indirizzoPerEsteso;
	}

	public List<Negozio> getListaNegozi() {
		return listaNegozi;
	}

	public void setListaNegozi(List<Negozio> listaNegozi) {
		this.listaNegozi = listaNegozi;
	}

	@Override
	public String toString() {
		return "CentroCommerciale [ragioneSociale=" + ragioneSociale + ", indirizzoPerEsteso=" + indirizzoPerEsteso
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
