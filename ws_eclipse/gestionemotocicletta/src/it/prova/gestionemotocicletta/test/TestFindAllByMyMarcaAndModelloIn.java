package it.prova.gestionemotocicletta.test;

import java.util.List;

import it.prova.gestionemotocicletta.dao.MotociclettaDAO;
import it.prova.gestionemotocicletta.model.Motocicletta;

public class TestFindAllByMyMarcaAndModelloIn {
	
	public static void main(String[] args) {
		
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		MotociclettaDAO motociclettaDAO = new MotociclettaDAO();
		

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		
		String[] modelliAmmessi = {"Katana","SV"};
		String marca = "Suzuki";
		
		List<Motocicletta> motocicletteSelectAllList = motociclettaDAO.findAllByMarcaAndModelloIn(marca, modelliAmmessi);
		
		
		for (Motocicletta motociclettaItem : motocicletteSelectAllList) {
			System.out.println(motociclettaItem);
		}
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");
	}

}
