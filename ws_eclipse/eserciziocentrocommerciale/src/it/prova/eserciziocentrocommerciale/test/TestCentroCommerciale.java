package it.prova.eserciziocentrocommerciale.test;

import java.util.ArrayList;
import java.util.List;

import it.prova.eserciziocentrocommerciale.model.Boss;
import it.prova.eserciziocentrocommerciale.model.CentroCommerciale;
import it.prova.eserciziocentrocommerciale.model.Commesso;
import it.prova.eserciziocentrocommerciale.model.Item;
import it.prova.eserciziocentrocommerciale.model.Lavoratore;
import it.prova.eserciziocentrocommerciale.model.Negozio;
import it.prova.eserciziocentrocommerciale.model.PersonaleAmministrativo;

public class TestCentroCommerciale {
	
	public static String toStringListaItems(List<Item> listaItems) {
		String result = "";
		for(Item item : listaItems) {
			result += item.toString() + "\n";
		}
		return result;
	}
	
	public static String toStringListaLavoratori(List<Lavoratore> listaLavoratori) {
		String result = "";
		for(Lavoratore lavoratore : listaLavoratori) {
			result += lavoratore.toString() + "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		
		//Creazione di un'istanza centro commericiale
		CentroCommerciale centroCommerciale1 = new CentroCommerciale("Porta di Roma", "Via Alberto Lionello, 201, 00139 Roma R", null);
		
		//---------------
		
		//Creazione di istanze negozi
		Negozio negozio1 = new Negozio("Apple Store", "1234567890", centroCommerciale1, null, null);
		Negozio negozio2 = new Negozio("Conad", "90435804984", centroCommerciale1, null, null);
		Negozio negozio3 = new Negozio("Zara", "93904903402", centroCommerciale1, null, null);
		
		//---------------
		
		//Creazione di Item al Negozio 1
		Item item1Negozio1 = new Item("94629", "iPhone14", 1000, negozio1);
		Item item2Negozio1 = new Item("30683", "iPhone14Pro", 1500, negozio1);
		Item item3Negozio1 = new Item("04826", "iPhone13", 900, negozio1);
		Item item4Negozio1 = new Item("05725", "iPhone13Pro", 1400, negozio1);
		
		//creazione di Item al Negozio 2
		Item item1Negozio2 = new Item("23582", "Pasta", 1, negozio2);
		Item item2Negozio2 = new Item("35836", "Carne", 10, negozio2);
		Item item3Negozio2 = new Item("23634", "Verdura", 5, negozio2);
		Item item4Negozio2 = new Item("08954", "Frutta", 6, negozio2);
		
		//Creazione di Item al Negozio 3
		Item item1Negozio3 = new Item("23582", "Maglietta", 10, negozio3);
		Item item2Negozio3 = new Item("35836", "Camicia", 15, negozio3);
		Item item3Negozio3 = new Item("23634", "Pantaloni", 25, negozio3);
		Item item4Negozio3 = new Item("08954", "Cappello", 8, negozio3);

		//---------------
		
		//Creazione di Lavoratori per Negozio 1
		Lavoratore commesso1Negozio1 = new Commesso("Bill", "Gates", negozio1);
		Lavoratore commesso2Negozio1 = new Commesso("Jeff", "Bezos", negozio1);
		Lavoratore BossNegozio1 = new Boss("Tim", "Cook", negozio1);
		Lavoratore personaleAmministrativoNegozio1 = new PersonaleAmministrativo("Steve", "Jobs", negozio1);
		
		//Creazione di Lavoratori per Negozio 2
		
		Lavoratore commesso1Negozio2 = new Commesso("Maria", "Rossi", negozio2);
		Lavoratore commesso2Negozio2 = new Commesso("Giuseppe", "Rossi", negozio2);
		Lavoratore BossNegozio2 = new Boss("Francesco", "Pugliese", negozio2);
		Lavoratore personaleAmministrativoNegozio2 = new PersonaleAmministrativo("Nerio", "Alessandri", negozio2);
		
		//Creazione di Lavoratori per Negozio 3
		
		Lavoratore commesso1Negozio3 = new Commesso("Maria", "Rossi", negozio3);
		Lavoratore commesso2Negozio3 = new Commesso("Giuseppe", "Rossi", negozio3);
		Lavoratore BossNegozio3 = new Boss("Amancio", "Ortega", negozio3);
		Lavoratore personaleAmministrativoNegozio3 = new PersonaleAmministrativo("Pablo", "Isla", negozio3);
		
		//---------------  
		
		//Creazione Liste e Assegnazione
		
		//Centro Commerciale - ListaNegozi
		
		List<Negozio> listaNegozioCentroCommerciale1 = new ArrayList<Negozio>();
		listaNegozioCentroCommerciale1.add(negozio1);
		listaNegozioCentroCommerciale1.add(negozio2);
		listaNegozioCentroCommerciale1.add(negozio3);
		centroCommerciale1.setListaNegozi(listaNegozioCentroCommerciale1);
		
		//Negozio - Lista Item
		
		List<Item> listaItemNegozio1 = new ArrayList<Item>();
		listaItemNegozio1.add(item1Negozio1);
		listaItemNegozio1.add(item2Negozio1);
		listaItemNegozio1.add(item3Negozio1);
		listaItemNegozio1.add(item4Negozio1);
		negozio1.setListaItems(listaItemNegozio1);
		
		List<Item> listaItemNegozio2 = new ArrayList<Item>();
		listaItemNegozio2.add(item1Negozio2);
		listaItemNegozio2.add(item2Negozio2);
		listaItemNegozio2.add(item3Negozio2);
		listaItemNegozio2.add(item4Negozio2);
		negozio2.setListaItems(listaItemNegozio2);
		
		List<Item> listaItemNegozio3 = new ArrayList<Item>();
		listaItemNegozio3.add(item1Negozio3);
		listaItemNegozio3.add(item2Negozio3);
		listaItemNegozio3.add(item3Negozio3);
		listaItemNegozio3.add(item4Negozio3);
		negozio3.setListaItems(listaItemNegozio3);
		
		//Negozio - Lista Lavoratori
		
		List<Lavoratore> listaLavoratoriNegozio1 = new ArrayList<Lavoratore>();
		listaLavoratoriNegozio1.add(commesso1Negozio1);
		listaLavoratoriNegozio1.add(commesso2Negozio1);
		listaLavoratoriNegozio1.add(BossNegozio1);
		listaLavoratoriNegozio1.add(personaleAmministrativoNegozio1);
		negozio1.setListaLavoratori(listaLavoratoriNegozio1);
		
		List<Lavoratore> listaLavoratoriNegozio2 = new ArrayList<Lavoratore>();
		listaLavoratoriNegozio2.add(commesso1Negozio2);
		listaLavoratoriNegozio2.add(commesso2Negozio2);
		listaLavoratoriNegozio2.add(BossNegozio2);
		listaLavoratoriNegozio2.add(personaleAmministrativoNegozio2);
		negozio2.setListaLavoratori(listaLavoratoriNegozio2);
		
		List<Lavoratore> listaLavoratoriNegozio3 = new ArrayList<Lavoratore>();
		listaLavoratoriNegozio3.add(commesso1Negozio3);
		listaLavoratoriNegozio3.add(commesso2Negozio3);
		listaLavoratoriNegozio3.add(BossNegozio3);
		listaLavoratoriNegozio3.add(personaleAmministrativoNegozio3);
		negozio3.setListaLavoratori(listaLavoratoriNegozio3);
		
		//---------------
		
		System.out.println("Lista Negozio 1: \n" + toStringListaItems(listaItemNegozio1));
		System.out.println("Lista Negozio 2: \n" + toStringListaItems(listaItemNegozio2));
		System.out.println("Lista Negozio 3: \n" + toStringListaItems(listaItemNegozio3));	
		
		System.out.println("Lavoratori Negozio 1: \n" + toStringListaLavoratori(listaLavoratoriNegozio1));
		System.out.println("Lavoratori Negozio 2: \n" + toStringListaLavoratori(listaLavoratoriNegozio2));
		System.out.println("Lavoratori Negozio 3: \n" + toStringListaLavoratori(listaLavoratoriNegozio3));
		
		
		//Test - addToItem e removeFromItems
		
		//Aggiungo iPhone15 al Negozio1 al Commesso1Negozio1 : True
		System.out.println("Aggiungo iPhone15 al Negozio 1 dal commesso1: True ");
		Item item1NuovoNegozio1 = new Item("23642", "iPhone15", 2000, negozio1);
		System.out.println(negozio1.addToItems(commesso1Negozio1, item1NuovoNegozio1));
		System.out.println("Lista Negozio 1: \n" + toStringListaItems(listaItemNegozio1));
		
		//Aggiungo iPhone15 al Negozio1 al BossNegozio1 : False
		System.out.println("Aggiungo iPhone15Pro al Negozio 1 dal Boss: False ");
		Item item2NuovoNegozio1 = new Item("23642", "iPhone15Pro", 2000, negozio1);
		System.out.println(negozio1.addToItems(BossNegozio1, item2NuovoNegozio1));
		System.out.println("Lista Negozio 1: \n" + toStringListaItems(listaItemNegozio1));
		
		//Aggiungo iPhone15 al Negozio1 dal Commesso1Negozio3 : False
		System.out.println("Aggiungo iPhone15 al Negozio1 dal Commesso1Negozio3 : False");
		Item item3NuovoNegozio1 = new Item("96582", "iPhone15Pro", 2500, negozio1);
		System.out.println(negozio1.addToItems(commesso1Negozio3, item3NuovoNegozio1));
		System.out.println("Lista Negozio 1: \n" + toStringListaItems(listaItemNegozio1));
		
		//Rimuovo iPhone14Pro dal Negozio1 dal Commesso1Negozio1 : True
		System.out.println("Rimuovo iPhone14Pro al Negozio1 dal Commesso1Negozio1: True ");
		System.out.println(negozio1.removeFromItems(commesso1Negozio1, item2Negozio1));
		System.out.println("Lista Negozio 1: \n" + toStringListaItems(listaItemNegozio1));
		
		//Rimuovo iPhone13 dal Negozio1 dal PersonaleAmministrativoNegozio1 : False
		System.out.println("Rimuovo iPhone13 al Negozio1 dal PersonaleAmministrativoNegozio1: False ");
		System.out.println(negozio1.removeFromItems(personaleAmministrativoNegozio1, item3Negozio1));
		System.out.println("Lista Negozio 1: \n" + toStringListaItems(listaItemNegozio1));


		
		
	}

}
