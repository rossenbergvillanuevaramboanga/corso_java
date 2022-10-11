package it.prova.provainterfaccia.model;

public class Pinguino implements Volatile {
	
	private String continenteAppartenenza;
	
	public Pinguino() {};
	public Pinguino(String continenteAppartenenza) {
		this.continenteAppartenenza = continenteAppartenenza;
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Io non volo.");
		
	}

	public String getContinenteAppartenenza() {
		return continenteAppartenenza;
	}

	public void setContinenteAppartenenza(String continenteAppartenenza) {
		this.continenteAppartenenza = continenteAppartenenza;
	}

	@Override
	public String stampaProprieta() {
		// TODO Auto-generated method stub
		return this.continenteAppartenenza;
	}
	@Override
	public boolean eUgualeA(Volatile confronto) {
		// TODO Auto-generated method stub
		if(!(confronto instanceof Pinguino)) return false;
		Pinguino temPinguino = (Pinguino) confronto; 
		return this.getContinenteAppartenenza().equals(temPinguino.getContinenteAppartenenza());
	}

}
