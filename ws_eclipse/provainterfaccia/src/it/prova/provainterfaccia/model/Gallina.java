package it.prova.provainterfaccia.model;

public class Gallina implements Volatile {
	
	private String piumaggio;
	
	public Gallina() {};
	
	public Gallina(String piumaggio) {
		this.piumaggio = piumaggio;
	}

	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Io saltello.");
		
	}

	public String getPiumaggio() {
		return piumaggio;
	}

	public void setPiumaggio(String piumaggio) {
		this.piumaggio = piumaggio;
	}

	@Override
	public String stampaProprieta() {
		// TODO Auto-generated method stub
		return this.piumaggio;
	}

	@Override
	public boolean eUgualeA(Volatile confronto) {
		// TODO Auto-generated method stub
		if(!(confronto instanceof Gallina)) return false;
		Gallina tempGallina = (Gallina) confronto; 
		return this.piumaggio.equals(tempGallina.getPiumaggio());
	
	}

}
