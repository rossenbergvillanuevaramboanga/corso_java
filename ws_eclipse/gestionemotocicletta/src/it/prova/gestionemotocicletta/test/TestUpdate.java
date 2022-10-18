package it.prova.gestionemotocicletta.test;

import java.util.List;

import it.prova.gestionemotocicletta.dao.MotociclettaDAO;
import it.prova.gestionemotocicletta.model.Motocicletta;

public class TestUpdate {
	
	public static void main(String[] args) {

		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		MotociclettaDAO motociclettaDAO = new MotociclettaDAO();
		
		List<Motocicletta> motocicletteSelectAllList = motociclettaDAO.selectAll(); 
				

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		
		
		if(!motocicletteSelectAllList.isEmpty()) {
			
			Motocicletta primaMotociclettaDellaBaseDiDati = motocicletteSelectAllList.get(0);
			
			int nuovaCilindrata = 500; 
			
			System.out.println("Before update:" + primaMotociclettaDellaBaseDiDati.getCilindrata());
			
			primaMotociclettaDellaBaseDiDati.setCilindrata(nuovaCilindrata);
			motociclettaDAO.update(primaMotociclettaDellaBaseDiDati);
			
			//Prendo il primo elemento della base di Dati e verifico che sia stato cambiato
			List<Motocicletta> motocicletteSelectAllListAggiornata = motociclettaDAO.selectAll(); 
			Motocicletta primaMotociclettaDellaBaseDiDatiAggiornata = motocicletteSelectAllListAggiornata.get(0);
			
			if(primaMotociclettaDellaBaseDiDatiAggiornata.getCilindrata() != nuovaCilindrata) throw new AssertionError("Test di aggiornamento fallito");
		}
		else throw new AssertionError("Test di update fallito perchè il database è vuoto.");
		
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");

		
	}

}
