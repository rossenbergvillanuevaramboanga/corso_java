package it.prova.gestionemotocicletta.test;

import java.util.List;

import it.prova.gestionemotocicletta.dao.MotociclettaDAO;
import it.prova.gestionemotocicletta.model.Motocicletta;

public class TestFindAllByCilindrataMaggioreDi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inizio....");

		// questo risulta l'oggetto incaricato di operazioni dao 
		MotociclettaDAO motociclettaDAO = new MotociclettaDAO();
		

		// #####################################################################
		System.out.println("############### test per verifica esistenza dati ###########################");
		
		int ciclindrataMinima  = 50; 
		
		List<Motocicletta> motocicletteSelectAllList = motociclettaDAO.findAllByCilindrataMaggioreDi(ciclindrataMinima);
		
		for (Motocicletta motociclettaItem : motocicletteSelectAllList) {
			System.out.println(motociclettaItem);
		}
		
		System.out.println(
				"####################### test per verifica esistenza dati: FINE     ##################################");
		System.out.println("#####################################################################");

	}

}
