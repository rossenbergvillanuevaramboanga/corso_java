package it.prova.miainterfaccia.model;


public class Supermercato implements Negozio{
	
	private int articoliVenduti;
	
	public Supermercato() {};
	public Supermercato(int articoliVenduti) {
		this.articoliVenduti = articoliVenduti;
	}
	public int getArticoliVenduti() {
		return articoliVenduti;
	}
	public void setArticoliVenduti(int articoliVenduti) {
		this.articoliVenduti = articoliVenduti;
	}
	@Override
	public int stampaVendite() {
		// TODO Auto-generated method stub
		return this.articoliVenduti;
	}
	@Override
	public boolean eUgualeA(Negozio confronto) {
		// TODO Auto-generated method stub
		if(!(confronto instanceof Supermercato)) return false;
		Supermercato temp = (Supermercato) confronto;
		
		return this.getArticoliVenduti() == temp.getArticoliVenduti();
	}
	

}
