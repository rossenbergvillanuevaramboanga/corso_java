package it.prova.gestionehotel.test;


import it.prova.gestionehotel.model.Cliente;
import it.prova.gestionehotel.model.Hotel;
import it.prova.gestionehotel.model.Premio;
import it.prova.gestionehotel.model.Rappresentate;
import it.prova.gestionehotel.model.Stanza;
import it.prova.gestionehotel.model.Turista;


public class TestHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation of instance Hotel
		Hotel hotel = new Hotel("Alexander Palace", 5, null);
		
		//Creation of instance Stanza
		Stanza stanza1 = new Stanza(1, 100, hotel, null);
		Stanza stanza2 = new Stanza(2, 200, hotel, null);
		Stanza stanza3 = new Stanza(3, 300, hotel, null);
		
		//Creation of instance Stanza[]
		Stanza[] arrayStanzeHotel = {stanza1,stanza2,stanza3};
		
		//Creation of instance ClienteTurista
		Cliente turistaCliente1Stanza1 = new Turista("Aldo", "Comico", stanza1);
		Cliente turistaCliente2Stanza1 = new Turista("Giovanni", "Comico", stanza1);
		Cliente turistaCliente3Stanza1 = new Turista("Giacomo", "Comico", stanza1);
		
		Cliente[] arrayClientiStanza1 = {turistaCliente1Stanza1, turistaCliente2Stanza1,turistaCliente3Stanza1};
		stanza1.setClienti(arrayClientiStanza1);
		
		//Creation of instance ClienteRappresentante
		Cliente rappresentanteCliente1Stanza2 = new Rappresentate("Giuseppe", "Santi", stanza2);
		Cliente rappresentanteCliente2Stanza2 = new Rappresentate("Maria", "Santi", stanza2);
		
		Cliente[] arrayClientiStanza2 = {rappresentanteCliente1Stanza2, rappresentanteCliente2Stanza2};
		stanza2.setClienti(arrayClientiStanza2);
		
		//Creation of instance PremioCliente
		Cliente premioCliente1Stanza3 = new Premio("Bill", "Gates", stanza3);
		
		Cliente[] arrayClientiStanza3 = {premioCliente1Stanza3};
		stanza3.setClienti(arrayClientiStanza3);
		
		//Set arrayStanzeHotel to Hotel instance
		hotel.setStanze(arrayStanzeHotel);
		
		//Test-print 
		System.out.println("----------TEST: calcolaConto----------");
		System.out.println("Stanza 1: " + hotel.calcolaConto(stanza1) + "€"); //Expected: 300 
		System.out.println("Stanza 2: " + hotel.calcolaConto(stanza2) + "€"); //Expected: 320
		System.out.println("Stanza 3: " + hotel.calcolaConto(stanza3) + "€"); //Expected: 0
		
		
	}

}
