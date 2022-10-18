package it.prova.gestionemotocicletta.test;

import java.util.List;

import it.prova.gestionemotocicletta.dao.MotociclettaDAO;
import it.prova.gestionemotocicletta.model.Motocicletta;

public class TestDelete {
	public static void main(String[] args) {
		
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		MotociclettaDAO motociclettaDAO = new MotociclettaDAO();
		
		int numberMotocicletteSelectAllList = -1;
		List<Motocicletta> motocicletteSelectAllList = motociclettaDAO.selectAll(); 
		numberMotocicletteSelectAllList = motocicletteSelectAllList.size();
				

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		
		
		if(!motocicletteSelectAllList.isEmpty()) {
			
			Motocicletta primaMotociclettaDellaBaseDiDati = motocicletteSelectAllList.get(0);
			Long idPrimaMotociclettaDellaBaseDiDati = primaMotociclettaDellaBaseDiDati.getId();
			motociclettaDAO.delete(primaMotociclettaDellaBaseDiDati.getId());
			
			Motocicletta motociclettaRicaricata = motociclettaDAO.findById(idPrimaMotociclettaDellaBaseDiDati);
			if(motociclettaRicaricata != null) throw new AssertionError("Test di rimozione fallito");
		}
		else throw new AssertionError("Test di rimozione fallito perchè il database è vuoto.");
		
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");

		
		
	}

}
