package it.prova.gestioneraccoglitore.test;


import it.prova.gestioneraccoglitore.model.Foglio;
import it.prova.gestioneraccoglitore.model.Raccoglitore;

public class TestGestioneRaccoglitore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Raccoglitore raccoglitoreTest1 = new Raccoglitore("Verde",3);
		
		Foglio foglio1Raccoglitore1 = new Foglio("Riciclata","Quadretti",raccoglitoreTest1);
		Foglio foglio2Raccoglitore1 = new Foglio("Riciclata","Righe",raccoglitoreTest1);
		Foglio foglio3Raccoglitore1 = new Foglio("Fotografica","Bianco", raccoglitoreTest1);
		
		Foglio[] arrayFogliRaccoglitore1 = {
				foglio1Raccoglitore1,
				foglio2Raccoglitore1,
				foglio3Raccoglitore1};
		
		raccoglitoreTest1.setFogli(arrayFogliRaccoglitore1);
		
		Raccoglitore raccoglitoreTest2 = new Raccoglitore("Rosso", 5);
		
		Foglio foglio1Raccoglitore2 = new Foglio("Riciclata","Quadretti", raccoglitoreTest2);
		Foglio foglio2Raccoglitore2 = new Foglio("Premium", "Righe",raccoglitoreTest2);
		Foglio foglio3Raccoglitore2 = new Foglio("Fotografica","Quadretti",raccoglitoreTest2);
		Foglio foglio4Raccoglitore2 = new Foglio("Bozza","Righe",raccoglitoreTest2);
		Foglio foglio5Raccoglitore2 = new Foglio("Premium", "Bianco",raccoglitoreTest2);
		
		Foglio[] arrayFogliRaccoglitore2 = {
				foglio1Raccoglitore2, 
				foglio2Raccoglitore2, 
				foglio3Raccoglitore2,
				foglio4Raccoglitore2, 
				foglio5Raccoglitore2};
		
		raccoglitoreTest2.setFogli(arrayFogliRaccoglitore2);
		
		System.out.println("1 "+ raccoglitoreTest1.toString());
		System.out.println(Foglio.toString(arrayFogliRaccoglitore1));
		
		System.out.println("2 "+ raccoglitoreTest2.toString());
		System.out.println(Foglio.toString(arrayFogliRaccoglitore2));
		
		
		//------ Test: addToFogli
		Foglio foglioDaAggiungereAlRaccoglitore1 = new Foglio("Premium","Quadretti",raccoglitoreTest1);

		raccoglitoreTest1.addToFogli(foglioDaAggiungereAlRaccoglitore1);
		System.out.println(Foglio.toString(raccoglitoreTest1.getFogli()));
		
		
		//------ Test: removeToFogli
		int indiceDaTogliere = 1; 
		
		//System.out.println("Dimensione: " + raccoglitoreTest2.getFogli().length);
		//System.out.println(Foglio.toString(raccoglitoreTest2.getFogli()));
		
		//System.out.println("Rimozione " + indiceDaTogliere + " elemento.");
		raccoglitoreTest2.removeFromFoglio(indiceDaTogliere);
		
		//System.out.println("Dimensione: " + raccoglitoreTest2.getFogli().length);
		System.out.println(Foglio.toString(raccoglitoreTest2.getFogli()));
		
		

	}

}
