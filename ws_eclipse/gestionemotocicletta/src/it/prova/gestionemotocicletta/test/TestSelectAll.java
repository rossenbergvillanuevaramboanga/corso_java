package it.prova.gestionemotocicletta.test;

import java.util.List;

import it.prova.gestionemotocicletta.dao.MotociclettaDAO;
import it.prova.gestionemotocicletta.model.Motocicletta;

public class TestSelectAll {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		MotociclettaDAO motociclettaDAO = new MotociclettaDAO();
		int numberMotocicletteSelectAllList = -1;

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		List<Motocicletta> motocicletteSelectAllList = motociclettaDAO.selectAll();
		numberMotocicletteSelectAllList = motocicletteSelectAllList.size();
		System.out.println("Sono attualmente presenti " + numberMotocicletteSelectAllList + " records");
		for (Motocicletta motociclettaItem : motocicletteSelectAllList) {
			System.out.println(motociclettaItem);
		}
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");


	}

}
