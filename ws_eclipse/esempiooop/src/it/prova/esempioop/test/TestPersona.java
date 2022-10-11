package it.prova.esempioop.test;

import it.prova.esempioo.model.Indirizzo;
import it.prova.esempioo.model.Persona;

public class TestPersona {
	
	public static void main(String[] args) {
		
		Indirizzo indirizzo1 =  new Indirizzo();
		indirizzo1.setCitta("Roma");
		indirizzo1.setVia("Via cagliari");
		indirizzo1.setCivicoString("38");
		
		Persona persona1 = new Persona();
		persona1.setNome("Rossenberg");
		persona1.setCognome("Ramboanga");
		persona1.setEta(25);
		persona1.setIndirizzo(indirizzo1);
		
		System.out.println(persona1.getIndirizzo().getCitta());
		
	}

}
