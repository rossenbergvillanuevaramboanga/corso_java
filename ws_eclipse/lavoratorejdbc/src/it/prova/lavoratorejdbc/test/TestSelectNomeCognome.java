package it.prova.lavoratorejdbc.test;

import java.text.ParseException;
import java.util.List;

import it.prova.lavoratorejdbc.dao.LavoratoreDAO;
import it.prova.lavoratorejdbc.model.Lavoratore;

public class TestSelectNomeCognome {
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		LavoratoreDAO lavoratoreDaoInstance = new LavoratoreDAO();
		int quantiSonoAttualmentePresenti = -1;

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		Lavoratore testLavoratore = new Lavoratore("Giuseppe", "Rossi",null, null);
		System.out.println("Cerco nel database le persone che si chiamano "+ testLavoratore.getNome()+ " "+ testLavoratore.getCognome());
		List<Lavoratore> attualmentePresentiSullaBaseDati = lavoratoreDaoInstance
				.selectByNomeCognome(testLavoratore.getNome(),testLavoratore.getCognome());
		quantiSonoAttualmentePresenti = attualmentePresentiSullaBaseDati.size();
		System.out.println("Sono attualmente presenti " + quantiSonoAttualmentePresenti + " records");
		for (Lavoratore lavoratoreItem : attualmentePresentiSullaBaseDati) {
			System.out.println(lavoratoreItem);
		}
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");
	}

}
