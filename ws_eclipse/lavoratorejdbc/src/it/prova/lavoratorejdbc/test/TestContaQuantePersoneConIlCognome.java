package it.prova.lavoratorejdbc.test;

import java.util.List;

import it.prova.lavoratorejdbc.dao.LavoratoreDAO;
import it.prova.lavoratorejdbc.model.Lavoratore;

public class TestContaQuantePersoneConIlCognome {

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
		
		String cognomePrimaPersona ="Ramboanga"; //attualmentePresentiSullaBaseDati.get(0).getCognome();
		
		int result = lavoratoreDaoInstance.contaQuantePersoneConIlCognome(cognomePrimaPersona);
		
		System.out.println("Ci sono persone " + result + " con cognome:" + cognomePrimaPersona);
		
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");
		

	}

}
