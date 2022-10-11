package it.prova.miainterfaccia.model;

public class Farmacia implements Negozio {
	
	public int farmaciVenduti;
	
	public Farmacia() {};
	public Farmacia(int farmaciVenduti) {
		this.farmaciVenduti = farmaciVenduti;
	}
	
	public int getFarmaciVenduti() {
		return farmaciVenduti;
	}
	public void setFarmaciVenduti(int farmaciVenduti) {
		this.farmaciVenduti = farmaciVenduti;
	}
	@Override
	public int stampaVendite() {
		// TODO Auto-generated method stub
		return this.farmaciVenduti;
	}
	@Override
	public boolean eUgualeA(Negozio confronto) {
		// TODO Auto-generated method stub
		if(!(confronto instanceof Farmacia)) return false;
		Farmacia temp = (Farmacia) confronto;
		
		return this.getFarmaciVenduti() == temp.getFarmaciVenduti();
	}
	

}
