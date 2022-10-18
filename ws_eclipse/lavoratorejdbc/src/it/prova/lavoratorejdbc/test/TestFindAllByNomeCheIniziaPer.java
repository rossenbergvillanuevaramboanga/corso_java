package it.prova.lavoratorejdbc.test;

import java.util.List;

import it.prova.lavoratorejdbc.dao.LavoratoreDAO;
import it.prova.lavoratorejdbc.model.Lavoratore;


public class TestFindAllByNomeCheIniziaPer {
	
	public static void main(String[] args) {
		
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		LavoratoreDAO lavoratoreDaoInstance = new LavoratoreDAO();

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		List<Lavoratore> attualmentePresentiSullaBaseDati = lavoratoreDaoInstance
				.elencaTuttiQuelliAttualmenteSullaBaseDati();
		for (Lavoratore lavoratoreItem : attualmentePresentiSullaBaseDati) {
			System.out.println(lavoratoreItem);
		}
		
		String inizialeString = "ma";
		
		List<Lavoratore> lavoratoriConInizialeMA = lavoratoreDaoInstance.findAllByNomeCheIniziaPer(inizialeString);
		
		System.out.println("Tutti quelli nati con iniziale: " + inizialeString);
		
		for (Lavoratore lavoratoreItem : lavoratoriConInizialeMA) {
			System.out.println(lavoratoreItem);
		}
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");
		
		
		
	}

}
