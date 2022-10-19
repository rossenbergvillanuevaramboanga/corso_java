package it.prova.primoonetomany.test;

import java.util.List;

import it.prova.primoonetomany.dao.ArticoloDAO;
import it.prova.primoonetomany.dao.NegozioDAO;
import it.prova.primoonetomany.model.Articolo;
import it.prova.primoonetomany.model.Negozio;

public class NegozioTest {

	public static void main(String[] args) {
		NegozioDAO negozioDAOInstance = new NegozioDAO();
		ArticoloDAO articoloDAOInstance = new ArticoloDAO();

		// ora con i dao posso fare tutte le invocazioni che mi servono
		System.out.println("In tabella negozio ci sono " + negozioDAOInstance.list().size() + " elementi.");
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.");

		testInserimentoNegozio(negozioDAOInstance);
		System.out.println("In tabella negozio ci sono " + negozioDAOInstance.list().size() + " elementi.");

		testFindByIdNegozio(negozioDAOInstance);

		testInsertArticolo(negozioDAOInstance, articoloDAOInstance);
		System.out.println("In tabella negozio ci sono " + negozioDAOInstance.list().size() + " elementi.");
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.");

		testFindByIdArticolo(articoloDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.");

		// ESERCIZIO: COMPLETARE DAO E TEST RELATIVI

		// testUpdateNegozio
		testUpdateNegozio(negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + negozioDAOInstance.list().size() + " elementi.\n");

		// testDeleteNegozio
		testDeleteNegozio(negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + negozioDAOInstance.list().size() + " elementi.\n");

		// testFindAllByInizialiNegozio
		testFindAllByInizialiNegozio(negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + negozioDAOInstance.list().size() + " elementi.\n");

		// testFindByIdEagerArticolo
		testFindByIdEagerArticolo(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

		// testUpdateArticolo
		testUpdateArticolo(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

		// testDeleteArticolo
		testDeleteArticolo(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

		// testFindAllByNegozioArticolo
		testFindAllByNegozioArticolo(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

		// testFindAllByMatricolaArticolo
		testFindAllByMatricolaArticolo(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

		// testFindAllByIndirizzoArticolo
		testFindAllByIndirizzoArticolo(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

		// ESERCIZIO SUCCESSIVO
		/*
		 * se io voglio caricare un negozio e contestualmente anche i suoi articoli
		 * dovrò sfruttare il populateArticoli presente dentro negoziodao. Per esempio
		 * Negozio negozioCaricatoDalDb = negozioDAOInstance.selectById...
		 * 
		 * negozioDAOInstance.populateArticoli(negozioCaricatoDalDb);
		 * 
		 * e da qui in poi il negozioCaricatoDalDb.getArticoli() non deve essere più a
		 * size=0 (se ha articoli ovviamente) LAZY FETCHING (poi ve lo spiego)
		 */
		
		// testPopulateArticoliNegozio
		testPopulateArticoliNegozio(articoloDAOInstance, negozioDAOInstance);
		System.out.println("In tabella articolo ci sono " + articoloDAOInstance.list().size() + " elementi.\n");

	}

	public static void testUpdateNegozio(NegozioDAO negozioDAOInstance) {

		System.out.println(".......testUpdateNegozio inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozioDaInserire = new Negozio("Negozio2", "via roma 10");
		negozioDAOInstance.insert(negozioDaInserire);

		// Prendo la lista dal DB
		List<Negozio> listaNegozi = negozioDAOInstance.list();

		negozioDaInserire = listaNegozi.get(listaNegozi.size() - 1);
		negozioDaInserire.setIndirizzo("via firenze 29");

		int quantiNegoziUpdate = negozioDAOInstance.update(negozioDaInserire);
		if (quantiNegoziUpdate != 1)
			throw new RuntimeException("testUpdateNegozio : FAILED");

		quantiNegoziUpdate = negozioDAOInstance.delete(negozioDaInserire.getId());
		if (quantiNegoziUpdate != 1)
			throw new RuntimeException("testUpdateNegozio : DELETE FAILED");

		System.out.println(".......testUpdateNegozio fine: PASSED.............");
	}

	public static void testDeleteNegozio(NegozioDAO negozioDAOInstance) {

		System.out.println(".......testDeleteNegozio inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozioDaInserire = new Negozio("NegozioTest", "via mondo 200");
		negozioDAOInstance.insert(negozioDaInserire);

		// Prendo la lista dal DB
		List<Negozio> listaNegozi = negozioDAOInstance.list();

		negozioDaInserire = listaNegozi.get(listaNegozi.size() - 1);
		// Eliminazione

		int quantiNegoziUpdate = negozioDAOInstance.delete(negozioDaInserire.getId());
		if (quantiNegoziUpdate != 1)
			throw new RuntimeException("testDeleteNegozio : DELETE FAILED");

		System.out.println(".......testDeleteNegozio fine: PASSED.............");

	}

	public static void testFindAllByInizialiNegozio(NegozioDAO negozioDAOInstance) {

		System.out.println(".......testFindAllByInizialiNegozio inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozioDaInserire1 = new Negozio("AppleStorePortaDiRoma", "via porta di roma");
		Negozio negozioDaInserire2 = new Negozio("AppleStoreViaDelCorso", "via del  corso");
		String iniziali = "AppleStore";

		negozioDAOInstance.insert(negozioDaInserire1);
		negozioDAOInstance.insert(negozioDaInserire2);

		// Prendo la lista dal DB
		List<Negozio> listaNegoziIniziali = negozioDAOInstance.findAllByIniziali(iniziali);

		// Verifica del FIND
		if (listaNegoziIniziali.size() != 2)
			throw new RuntimeException("testFindAllByInizialiNegozio : FIND FAILED");

		// Clear
		for (Negozio negozio : listaNegoziIniziali) {
			if (negozioDAOInstance.delete(negozio.getId()) != 1)
				throw new RuntimeException("testFindAllByInizialiNegozio : DELETE FAILED");

		}
		System.out.println(".......testFindAllByInizialiNegozio fine: PASSED.............");

	}

	public static void testPopulateArticoliNegozio(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testPopulateArticoliNegozio inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		// Articolo 1
		Articolo articolo1 = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo1);

		// Articolo 2
		Articolo articolo2 = new Articolo("Playstation", "hjfs45924", negozio);
		articoloDAOInstance.insert(articolo2);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo1 = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo1.setId(idArticolo1);

		Long idArticolo2 = listaArticoli.get(listaArticoli.size() - 2).getId();
		articolo2.setId(idArticolo2);

		// PROPER TEST
		negozioDAOInstance.populateArticoli(negozio);

		if (negozio.getArticoli().size() != 2)
			throw new RuntimeException("testPopulateArticoliNegozio : POPULATE ARTICOLI FAILED");

		// Clear
		if (articoloDAOInstance.delete(idArticolo1) != 1)
			throw new RuntimeException("testPopulateArticoliNegozio : DELETE ARTICOLO FAILED");
		if (articoloDAOInstance.delete(idArticolo2) != 1)
			throw new RuntimeException("testPopulateArticoliNegozio : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testPopulateArticoliNegozio : DELETE NEGOZIO FAILED");

		System.out.println(".......testPopulateArticoliNegozio fine: PASSED.............");

	}

	public static void testFindByIdEagerArticolo(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testFindByIdEagerArticolo inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		Articolo articolo = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo.setId(idArticolo);

		// PROPER TEST
		if (!(idArticolo.equals(articoloDAOInstance.findByIdEager(idArticolo).getId())))
			throw new RuntimeException("testFindByIdEagerArticolo : FIND FAILED");

		// Clear
		if (articoloDAOInstance.delete(idArticolo) != 1)
			throw new RuntimeException("testFindByIdEagerArticolo : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testFindByIdEagerArticolo : DELETE NEGOZIO FAILED");

		System.out.println(".......testFindByIdEagerArticolo fine: PASSED.............");

	}

	public static void testUpdateArticolo(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testUpdateArticolo inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		Articolo articolo = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo.setId(idArticolo);
		articolo.setNome("Playstation5");

		// PROPER TEST
		if (articoloDAOInstance.update(articolo) != 1)
			throw new RuntimeException("testUpdateArticolo : UPDATE FAILED");

		// Clear
		if (articoloDAOInstance.delete(idArticolo) != 1)
			throw new RuntimeException("testUpdateArticolo : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testUpdateArticolo : DELETE NEGOZIO FAILED");

		System.out.println(".......testUpdateArticolo fine: PASSED.............");

	}

	public static void testDeleteArticolo(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testDeleteArticolo inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		Articolo articolo = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo.setId(idArticolo);

		// Clear
		if (articoloDAOInstance.delete(idArticolo) != 1)
			throw new RuntimeException("testDeleteArticolo : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testDeleteArticolo : DELETE NEGOZIO FAILED");

		System.out.println(".......testDeleteArticolo fine: PASSED.............");

	}

	public static void testFindAllByNegozioArticolo(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testFindAllByNegozioArticolo inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		Articolo articolo = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo.setId(idArticolo);

		// PROPER TEST
		if (articoloDAOInstance.findAllByNegozio(negozio).size() == 0)
			throw new RuntimeException("testFindAllByNegozioArticolo : FIND ALL BY NEGOZIO FAILED");

		// Clear
		if (articoloDAOInstance.delete(idArticolo) != 1)
			throw new RuntimeException("testFindAllByNegozioArticolo : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testFindAllByNegozioArticolo : DELETE NEGOZIO FAILED");

		System.out.println(".......testFindAllByNegozioArticolo fine: PASSED.............");

	}

	public static void testFindAllByMatricolaArticolo(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testFindAllByMatricolaArticolo inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		Articolo articolo = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo.setId(idArticolo);

		// PROPER TEST
		if (articoloDAOInstance.findAllByMatricola(articolo.getMatricola()).size() == 0)
			throw new RuntimeException("testFindAllByMatricolaArticolo : FIND ALL BY MATRICOLA FAILED");

		// Clear
		if (articoloDAOInstance.delete(idArticolo) != 1)
			throw new RuntimeException("testFindAllByMatricolaArticolo : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testFindAllByMatricolaArticolo : DELETE NEGOZIO FAILED");

		System.out.println(".......testFindAllByMatricolaArticolo fine: PASSED.............");

	}

	public static void testFindAllByIndirizzoArticolo(ArticoloDAO articoloDAOInstance, NegozioDAO negozioDAOInstance) {

		System.out.println(".......testFindAllByIndirizzoArticolo inizio.............");

		// Creazione di oggetto negozio dentro il DB
		Negozio negozio = new Negozio("GameStopMilano", "via milano");
		negozioDAOInstance.insert(negozio);

		List<Negozio> listaNegozi = negozioDAOInstance.list();

		Long idNegozio = listaNegozi.get(listaNegozi.size() - 1).getId();
		negozio.setId(idNegozio);

		// Creazione di oggetto articolo dentro il DB
		Articolo articolo = new Articolo("Nintendo Swift", "ajjg30452", negozio);
		articoloDAOInstance.insert(articolo);

		List<Articolo> listaArticoli = articoloDAOInstance.list();

		Long idArticolo = listaArticoli.get(listaArticoli.size() - 1).getId();
		articolo.setId(idArticolo);

		// PROPER TEST
		if (articoloDAOInstance.findAllByIndirizzoNegozio(negozio.getIndirizzo()).size() == 0)
			throw new RuntimeException("testFindAllByIndirizzoArticolo : FIND ALL BY INDIRIZZO NEGOZIO FAILED");

		// Clear
		if (articoloDAOInstance.delete(idArticolo) != 1)
			throw new RuntimeException("testFindAllByIndirizzoArticolo : DELETE ARTICOLO FAILED");
		if (negozioDAOInstance.delete(idNegozio) != 1)
			throw new RuntimeException("testFindAllByIndirizzoArticolo : DELETE NEGOZIO FAILED");

		System.out.println(".......testFindAllByIndirizzoArticolo fine: PASSED.............");

	}

	private static void testInserimentoNegozio(NegozioDAO negozioDAOInstance) {
		System.out.println(".......testInserimentoNegozio inizio.............");
		int quantiNegoziInseriti = negozioDAOInstance.insert(new Negozio("Negozio1", "via dei mille 14"));
		if (quantiNegoziInseriti < 1)
			throw new RuntimeException("testInserimentoNegozio : FAILED");

		System.out.println(".......testInserimentoNegozio fine: PASSED.............");
	}

	private static void testFindByIdNegozio(NegozioDAO negozioDAOInstance) {
		System.out.println(".......testFindByIdNegozio inizio.............");
		List<Negozio> elencoNegoziPresenti = negozioDAOInstance.list();
		if (elencoNegoziPresenti.size() < 1)
			throw new RuntimeException("testFindByIdNegozio : FAILED, non ci sono negozi sul DB");

		Negozio primoNegozioDellaLista = elencoNegoziPresenti.get(0);

		Negozio negozioCheRicercoColDAO = negozioDAOInstance.findById(primoNegozioDellaLista.getId());
		if (negozioCheRicercoColDAO == null
				|| !negozioCheRicercoColDAO.getNome().equals(primoNegozioDellaLista.getNome()))
			throw new RuntimeException("testFindByIdNegozio : FAILED, i nomi non corrispondono");

		System.out.println(".......testFindByIdNegozio fine: PASSED.............");
	}

	private static void testInsertArticolo(NegozioDAO negozioDAOInstance, ArticoloDAO articoloDAOInstance) {
		System.out.println(".......testInsertArticolo inizio.............");
		// mi serve un negozio esistente
		List<Negozio> elencoNegoziPresenti = negozioDAOInstance.list();
		if (elencoNegoziPresenti.size() < 1)
			throw new RuntimeException("testInsertArticolo : FAILED, non ci sono negozi sul DB");

		Negozio primoNegozioDellaLista = elencoNegoziPresenti.get(0);

		int quantiArticoliInseriti = articoloDAOInstance
				.insert(new Articolo("articolo1", "matricola1", primoNegozioDellaLista));
		if (quantiArticoliInseriti < 1)
			throw new RuntimeException("testInsertArticolo : FAILED");

		System.out.println(".......testInsertArticolo fine: PASSED.............");
	}

	private static void testFindByIdArticolo(ArticoloDAO articoloDAOInstance) {
		System.out.println(".......testFindByIdArticolo inizio.............");
		List<Articolo> elencoArticoliPresenti = articoloDAOInstance.list();
		if (elencoArticoliPresenti.size() < 1)
			throw new RuntimeException("testFindByIdArticolo : FAILED, non ci sono articoli sul DB");

		Articolo primoArticoloDellaLista = elencoArticoliPresenti.get(0);

		Articolo articoloCheRicercoColDAO = articoloDAOInstance.findById(primoArticoloDellaLista.getId());
		if (articoloCheRicercoColDAO == null
				|| !articoloCheRicercoColDAO.getNome().equals(primoArticoloDellaLista.getNome()))
			throw new RuntimeException("testFindByIdArticolo : FAILED, i nomi non corrispondono");

		System.out.println(".......testFindByIdArticolo fine: PASSED.............");
	}

}
