package it.prova.provainterfaccia.test;

import it.prova.provainterfaccia.model.Aquila;
import it.prova.provainterfaccia.model.Gallina;
import it.prova.provainterfaccia.model.Pinguino;
import it.prova.provainterfaccia.model.Volatile;

public class TestVolatile {
	
	public static void main(String[] args) {
		
		//Test 1
		System.out.println("-----TEST 1-----");
		
		Volatile v = new Aquila();
		v.vola();
		v = new Gallina(); 
		v.vola();
		v = new Pinguino();
		v.vola();
		
		//Test 2 - stampaProprieta
		System.out.println("-----TEST 2: stampaProprieta-----");
		
		Volatile aquila1 = new Aquila("Reale");
		Volatile gallina1 = new Gallina("Marrone");
		Volatile pinguino1 = new Pinguino("Antartide");
		
		System.out.println(aquila1.stampaProprieta());
		System.out.println(gallina1.stampaProprieta());
		System.out.println(pinguino1.stampaProprieta());
		
		//Test 3 - eUgualeA
		System.out.println("-----TEST 3: eUgualeA-----");
		
		Volatile aquilaUguale1 = new Aquila("Reale");
		Volatile aquilaUguale2 = new Aquila("Reale");
		Volatile gallinaUguale1 = new Gallina("Marrone");
		Volatile pinguinoUguale1 = new Pinguino("Antartide");
		
		System.out.println(aquilaUguale1.eUgualeA(aquilaUguale2)); //true
		System.out.println(gallinaUguale1.eUgualeA(pinguinoUguale1)); //false
		
		
		
		
	}

}
