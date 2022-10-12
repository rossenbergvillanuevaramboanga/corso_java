package it.prova.gestionehotel.model;


public class Hotel {
	
	private String ragioneSociale;
	private int stelle;
	private Stanza[] stanze;
	
	public Hotel(String ragioneSociale, int stelle, Stanza[] stanze) {
		super();
		this.ragioneSociale = ragioneSociale;
		this.stelle = stelle;
		this.stanze = stanze;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getStelle() {
		return stelle;
	}

	public void setStelle(int stelle) {
		this.stelle = stelle;
	}

	public Stanza[] getStanze() {
		return stanze;
	}

	public void setStanze(Stanza[] stanze) {
		this.stanze = stanze;
	} 
	
	public int calcolaConto(Stanza input) {
		
		if(this.isStanzaInHotel(input))return -1; 
		
		int resultSomma = 0;
		for(Cliente elem : this.stanzaInHotel(input).getClienti()){
			resultSomma += elem.sommaRealeDaPagare();
		}
		return resultSomma;
	}
	
	public boolean isStanzaInHotel(Stanza input) {
		for(Stanza stanze : this.stanze) {
			if(!(stanze.equals(input))) return false;
		}
		return true; 
	}
	
	public Stanza stanzaInHotel(Stanza input){
		for(Stanza stanze : this.stanze) {
			if(stanze.equals(input)) return stanze;
		}
		return null;
	}
	
	

}
