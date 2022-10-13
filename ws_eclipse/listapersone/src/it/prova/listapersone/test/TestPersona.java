package it.prova.listapersone.test;

import java.util.ArrayList;
import java.util.List;

import it.prova.listapersone.model.Persona;

public class TestPersona {
	
	public static String toStringListaPersona(List<Persona> elenco){
		String string = "";
		for(Persona persona : elenco) {
			string += persona.toString() + "\n";
		}
		return string;
		
	}
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Aldo","Comico", 50);
		Persona persona2 = new Persona("Giovanni", "Comico", 57);
		Persona persona3 = new Persona("Giacomo", "Comico", 60);
		Persona persona4 = new Persona("Maria", "Santo", 10);
		Persona persona5 = new Persona("Giuseppe","Santo", 10);
		Persona persona6 = new Persona("Bill", "Gates", 60);
		
		Persona personaNonPresenteInElencoPersona = new Persona("Elon", "Musk", 53);
		
		List<Persona> elenco1 = new ArrayList<Persona>();
		elenco1.add(persona1);
		elenco1.add(persona2);
		elenco1.add(persona3);
		elenco1.add(persona4);
		elenco1.add(persona5);
		elenco1.add(persona6);
		
		
		//Test: presenteInElenco
		System.out.println("\n-----TEST: presenteInElenco");
		System.out.println(persona1.presenteInElenco(elenco1)); //true
		System.out.println(personaNonPresenteInElencoPersona.presenteInElenco(elenco1)); //false
		

		//Test: quantePersoneConInizialeNelCognome
		System.out.println("\n-----TEST: quantePersoneConInizialeNelCognome");
		System.out.println(Persona.quantePersoneConInizialeNelCognome(elenco1,'C')); //3	
		System.out.println(Persona.quantePersoneConInizialeNelCognome(elenco1,'S')); //2	
		System.out.println(Persona.quantePersoneConInizialeNelCognome(elenco1,'G')); //1	
		System.out.println(Persona.quantePersoneConInizialeNelCognome(elenco1,'M')); //0

		
		//Test: estraiSoloCognome
		System.out.println("\n-----TEST: estraiSoloCognome");
		System.out.println(Persona.estraiSoloCognome(elenco1).toString());
		
		
		//Test: estraiSoloMaggiorenni
		System.out.println("\n-----TEST: estraiSoloMaggiorenni");
		System.out.println(toStringListaPersona(Persona.estraiSoloMaggiorenni(elenco1)));
		
		
	}

}
