package it.prova.provainterfaccia.model;

public class Aquila implements Volatile{
	
	private String razzaAquila;
	
	public Aquila(){};
	
	public Aquila(String razzaAquila) {
		this.razzaAquila = razzaAquila;
	}
	
	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("Io volo con le ali.");
		
	}


	public String getRazzaAquila() {
		return razzaAquila;
	}



	public void setRazzaAquila(String razzaAquila) {
		this.razzaAquila = razzaAquila;
	}


	@Override
	public String stampaProprieta() {
		// TODO Auto-generated method stub
		return this.razzaAquila;
	}

	@Override
	public boolean eUgualeA(Volatile confronto) {
		// TODO Auto-generated method stub
		if(!(confronto instanceof Aquila)) return false;
		Aquila tempAquila = (Aquila) confronto;
		return this.razzaAquila.equals(tempAquila.getRazzaAquila());
	}

}
	
	
	
	
	
	


