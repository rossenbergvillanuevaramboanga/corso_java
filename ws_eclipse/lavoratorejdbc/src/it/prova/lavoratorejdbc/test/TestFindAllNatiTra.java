package it.prova.lavoratorejdbc.test;

import java.util.Date;
import java.util.List;

import it.prova.lavoratorejdbc.dao.LavoratoreDAO;
import it.prova.lavoratorejdbc.model.Lavoratore;

public class TestFindAllNatiTra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		java.util.Date inizioDate = attualmentePresentiSullaBaseDati.get(0).getDataDiNascita();
		java.util.Date fineDate = new Date();
		
		List<Lavoratore> natiTraDateList = lavoratoreDaoInstance.findAllNatiTra(inizioDate, fineDate);
		
		System.out.println("Tutti quelli nati tra " + inizioDate +  " e " + fineDate);
		
		for (Lavoratore lavoratoreItem : natiTraDateList) {
			System.out.println(lavoratoreItem);
		}
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");

	}

}
