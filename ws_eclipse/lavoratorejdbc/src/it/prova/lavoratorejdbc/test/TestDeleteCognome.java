package it.prova.lavoratorejdbc.test;

import java.util.List;

import it.prova.lavoratorejdbc.dao.LavoratoreDAO;
import it.prova.lavoratorejdbc.model.Lavoratore;

public class TestDeleteCognome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao
		LavoratoreDAO lavoratoreDaoInstance = new LavoratoreDAO();

		System.out.println("################ test se esiste almeno uno ne sfrutto il cognome per rimozione #######");
		List<Lavoratore> attualmentePresentiSullaBaseDati = lavoratoreDaoInstance
				.elencaTuttiQuelliAttualmenteSullaBaseDati();

		if (!attualmentePresentiSullaBaseDati.isEmpty()) {
			//Stampa del Database
			for (Lavoratore lavoratoreItem : attualmentePresentiSullaBaseDati) {
				System.out.println(lavoratoreItem);
			}
			
			Lavoratore elementoCheVoglioEliminare = attualmentePresentiSullaBaseDati.get(0);
			System.out.println("Elimino il primo cognome della lista: " + elementoCheVoglioEliminare.getCognome());

			// mi salvo id per sfruttarlo dopo per provare a ricaricarlo
			Long idElementoRicaricataDaDbPerTestDelete = elementoCheVoglioEliminare.getId();
			
			// eseguo delete vero e proprio
			lavoratoreDaoInstance.deleteByCognome(elementoCheVoglioEliminare.getCognome());

			// ora lo ricarico e verifico che non ci sia
			Lavoratore elementoRicaricatoDaDbPerTestUpdate = lavoratoreDaoInstance
					.findById(idElementoRicaricataDaDbPerTestDelete);
			if (elementoRicaricatoDaDbPerTestUpdate != null)
				throw new AssertionError("test di rimozione: FAILED");
		} else
			throw new AssertionError("test di rimozione: FAILED in quanto non c'è nulla da rimuovere");

		System.out.println("################### test se esiste almeno uno ne sfrutto l'cognome per rimozione :FINE #######");


	}

}
