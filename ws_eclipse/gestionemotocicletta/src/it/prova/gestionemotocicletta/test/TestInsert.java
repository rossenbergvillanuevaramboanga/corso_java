package it.prova.gestionemotocicletta.test;

import java.util.List;

import it.prova.gestionemotocicletta.dao.MotociclettaDAO;
import it.prova.gestionemotocicletta.model.Motocicletta;

public class TestInsert {
	
	public static void main(String[] args) {
		
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		MotociclettaDAO motociclettaDAO = new MotociclettaDAO();
		int numberMotocicletteSelectAllList = -1;
		List<Motocicletta> motocicletteSelectAllList = motociclettaDAO.selectAll(); 
		numberMotocicletteSelectAllList = motocicletteSelectAllList.size();

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		
		//Creazione di due nuove motociclette
		Motocicletta motociclettaDaInserire1 = new Motocicletta("Honda", "CB1000R", 100); 
		Motocicletta motociclettaDaInserire2 = new Motocicletta("Honda", "Hornet", 150); 
		
		//Inserimento delle due nuove motociclette nella base di dati
		motociclettaDAO.insert(motociclettaDaInserire1);
		motociclettaDAO.insert(motociclettaDaInserire1);
		
		//Verifica 
		if(numberMotocicletteSelectAllList + 2 != motociclettaDAO.selectAll().size()) {
			throw new AssertionError("Errore nell'insert: FAILED");
		}
		else {
			System.out.println("Sono presenti due elementi in più");
		}
		
		
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");

		
	}

}
