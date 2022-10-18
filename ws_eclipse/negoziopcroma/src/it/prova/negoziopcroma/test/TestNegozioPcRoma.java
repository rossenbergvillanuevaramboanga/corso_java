package it.prova.negoziopcroma.test;

import java.util.ArrayList;
import java.util.List;

import it.prova.negoziopcroma.model.Negozio;
import it.prova.negoziopcroma.model.Portatile;
import it.prova.negoziopcroma.model.Processore;
import it.prova.negoziopcroma.model.SchedaMadre;

public class TestNegozioPcRoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crezione di negozi
		Negozio negozio1 = new Negozio("Via Cagliari 38", null);
		Negozio negozio2 = new Negozio("Via Roma 24", null);
		Negozio negozio3 = new Negozio("Via Firenze 10", null);

		List<Negozio> listaNegozi = new ArrayList<Negozio>();
		listaNegozi.add(negozio1);
		listaNegozi.add(negozio2);
		listaNegozi.add(negozio3);

		// Creazione di oggetti

		// Negozio1
		SchedaMadre schedaMadre1Negozio1 = new SchedaMadre("asd195");
		SchedaMadre schedaMadre2Negozio1 = new SchedaMadre("ckg495");
		Processore processore1Negozio1 = new Processore("oio039");
		Processore processore2Negozio1 = new Processore("sjf938");
		Portatile portatile1Negozio1 = new Portatile("jpe937", schedaMadre1Negozio1, processore1Negozio1);
		Portatile portatile2Negozio1 = new Portatile("dif038", schedaMadre2Negozio1, processore2Negozio1);

		List<Portatile> listaProdottiNegozio1 = new ArrayList<Portatile>();
		listaProdottiNegozio1.add(portatile1Negozio1);
		listaProdottiNegozio1.add(portatile2Negozio1);
		negozio1.setPortatili(listaProdottiNegozio1);

		// Negozio2
		SchedaMadre schedaMadre1Negozio2 = new SchedaMadre("dkh298");
		SchedaMadre schedaMadre2Negozio2 = new SchedaMadre("cjh938");
		Processore processore1Negozio2 = new Processore("cjh298");
		Processore processore2Negozio2 = new Processore("sgf597");
		Portatile portatile1Negozio2 = new Portatile("fkd973", schedaMadre1Negozio2, processore1Negozio2);
		Portatile portatile2Negozio2 = new Portatile("fhs347", schedaMadre2Negozio2, processore2Negozio2);

		List<Portatile> listaProdottiNegozio2 = new ArrayList<Portatile>();
		listaProdottiNegozio2.add(portatile1Negozio2);
		listaProdottiNegozio2.add(portatile2Negozio2);
		negozio2.setPortatili(listaProdottiNegozio2);

		// Negozio3
		SchedaMadre schedaMadre1Negozio3 = new SchedaMadre("djk938");
		SchedaMadre schedaMadre2Negozio3 = new SchedaMadre("dhr987");
		Processore processore1Negozio3 = new Processore("fhs374");
		Processore processore2Negozio3 = new Processore("ehf937");
		Portatile portatile1Negozio3 = new Portatile("fhr384", schedaMadre1Negozio3, processore1Negozio3);
		Portatile portatile2Negozio3 = new Portatile("dhf757", schedaMadre2Negozio3, processore2Negozio3);

		List<Portatile> listaProdottiNegozio3 = new ArrayList<Portatile>();
		listaProdottiNegozio3.add(portatile1Negozio3);
		listaProdottiNegozio3.add(portatile2Negozio3);
		negozio3.setPortatili(listaProdottiNegozio3);

		// Creazione di oggetti difettosi
		SchedaMadre schedaMadreDifettosa = new SchedaMadre("djk938");
		Processore processoreDifettoso = new Processore("cjh298");
		Portatile portatileDifettoso = new Portatile("jpe937");

		System.out.println("-----------TEST-------------");
		System.out.println(schedaMadreDifettosa.getId() + " si trova nel Negozio in "+ schedaMadreDifettosa.getIndirizzoProdotto(listaNegozi));
		System.out.println(processoreDifettoso.getId() + " si trova nel Negozio in "+ processoreDifettoso.getIndirizzoProdotto(listaNegozi));
		System.out.println(portatileDifettoso.getId() + " si trova nel Negozio in "+ portatileDifettoso.getIndirizzoProdotto(listaNegozi));
		System.out.println("---------FINE TEST----------");

		

	}

}
