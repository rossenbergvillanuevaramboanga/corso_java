package it.prova.gestioneraccoglitore.model;


public class Raccoglitore {

	private String colore;
	private int spessore;
	private Foglio[] fogli;

	public Raccoglitore() {
	};

	public Raccoglitore(String colore, int spessore) {
		this.colore = colore;
		this.spessore = spessore;

	}
	
	

	public Raccoglitore(String colore, int spessore, Foglio[] fogli) {
		this.colore = colore;
		this.spessore = spessore;
		this.fogli = fogli;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getSpessore() {
		return spessore;
	}

	public void setSpessore(int spessore) {
		this.spessore = spessore;
	}

	public Foglio[] getFogli() {
		return fogli;
	}

	public void setFogli(Foglio[] fogli) {
		this.fogli = fogli;
	}

	@Override
	public String toString() {
		return "Raccoglitore [colore=" + colore + ", spessore=" + spessore + "]";
	};
	
	//Metodi 
	
	public boolean addToFogli(Foglio nuovo) {
		
		if(nuovo == null) return false;
		
		Foglio[] resultArray = new Foglio[this.fogli.length + 1]; 
		
		for(int i=0; i  < resultArray.length - 1; i++) {
			resultArray[i] = this.fogli[i];
		}
		resultArray[resultArray.length - 1] = nuovo; 
		
		this.setFogli(resultArray);
		
		return true; 
		
	}
	
	public boolean removeFromFoglio(int indexToRemove) {
		int dimensioneArray = this.fogli.length;
		
		if(indexToRemove > dimensioneArray || indexToRemove < 0) return false; 
		
		Foglio[] resultArray = new Foglio[dimensioneArray - 1];
		
		for (int i = 0; i < resultArray.length ; i++) {
			if(i>=indexToRemove) resultArray[i] = this.fogli[i+1];
			resultArray[i] = this.fogli[i];
		}
		
		this.setFogli(resultArray);
		return true; 
	}
	
	

}
