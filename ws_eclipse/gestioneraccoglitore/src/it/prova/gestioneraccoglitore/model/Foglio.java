package it.prova.gestioneraccoglitore.model;

public class Foglio {

	private String qualita;
	private String tipologia;
	private Raccoglitore raccoglitore;

	public Foglio() {
	}

	public Foglio(String qualita, String tipologia, Raccoglitore raccoglitore) {
		this.qualita = qualita;
		this.tipologia = tipologia;
		this.raccoglitore = raccoglitore;
	}
	
	

	public Foglio(Raccoglitore raccoglitore) {
		super();
		this.raccoglitore = raccoglitore;
	}

	public String getQualita() {
		return qualita;
	}

	public void setQualita(String qualita) {
		this.qualita = qualita;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public Raccoglitore getRaccoglitore() {
		return raccoglitore;
	}

	public void setRaccoglitore(Raccoglitore raccoglitore) {
		this.raccoglitore = raccoglitore;
	}

	@Override
	public String toString() {
		return "Foglio [qualita=" + qualita + ", tipologia=" + tipologia + "]";
	};
	
	public static String toString(Foglio[] fogli) {
		String resultString = "";
		int numero = 1;
		for(Foglio element : fogli) {
			if(element != null) {
			resultString += numero + " "+ element.toString() + "\n";
			numero ++;
			}
		}
		return resultString;
		
	};
	
	

}
