import java.util.Arrays;

public class TestPersona{

    public static void main(String[] args){
        //Creazione di persone
        Persona personaTest1 = new Persona("Rossenberg","Ramboanga",25);
        Persona personaTest2 = new Persona("Rene","Neumann",25);
        Persona personaTest3 = new Persona("Alberto", "Multari", 40);

        //Creazione di indirizzi
        Indirizzo indirizzoTest1 = new Indirizzo("Roma", "Via Cagliari", "38");
        Indirizzo indirizzoTest2 = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoTest3 = new Indirizzo("Roma","Via Mosca", "52");

        //setIndirizzo ai Test
        personaTest1.setIndirizzo(indirizzoTest1); 
        personaTest2.setIndirizzo(indirizzoTest2); 
        personaTest3.setIndirizzo(indirizzoTest3); 

        //Stampa
        System.out.println(personaTest1.stringPersona()+ " abita a "+personaTest1.getIndirizzo().stringIndirizzo());
        System.out.println(personaTest2.stringPersona()+ " abita a "+personaTest2.getIndirizzo().stringIndirizzo());
        System.out.println(personaTest3.stringPersona()+ " abita a "+personaTest3.getIndirizzo().stringIndirizzo());

        //----- TEST: abiatA ----
        System.out.println("----- TEST: abiatA ----");

        Persona personaAbita = new Persona("Rossenberg","Ramboanga",25);
        Indirizzo indirizzoAbita = new Indirizzo("Roma", "Via Cagliari", "38");
        personaAbita.setIndirizzo(indirizzoAbita); 

        String cittaAbita1 = "Roma";
        String cittaAbita2 = "Milano";

        System.out.printf(personaAbita.stringPersona()+ " abita a %s ? \n",cittaAbita1);
        System.out.println(personaAbita.abitaA(cittaAbita1));
        System.out.printf(personaAbita.stringPersona()+ " abita a %s ? \n",cittaAbita2);
        System.out.println(personaAbita.abitaA(cittaAbita2));
        
        //----- TEST: haAlmenoUnConcittadino ----
        System.out.println("----- TEST: haAlmenoUnConcittadino ----");

        //Creazione di persona 
        Persona personaConcittadinoTest = new Persona("Rossenberg","Ramboanga",25);

        Persona personaConcittadino1 = new Persona("Nicky","Abero",19);
        Persona personaConcittadino2 = new Persona("Rene","Neumann",25);
        Persona personaConcittadino3 = new Persona("Lorenzo", "Dongalen", 40);

        //Creazione di indirizzi
        Indirizzo indirizzoConcittadinoTest = new Indirizzo("Roma", "Via Cagliari", "38");

        Indirizzo indirizzoConcittadino1 = new Indirizzo("Monterotondo", "Via Montopoli", "4");
        Indirizzo indirizzoConcittadino2 = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoConcittadino3 = new Indirizzo("Milano","Via Ettore Rolli", "52");

        //setIndirizzo ai Test
        personaConcittadinoTest.setIndirizzo(indirizzoConcittadinoTest); 

        personaConcittadino1.setIndirizzo(indirizzoConcittadino1); 
        personaConcittadino2.setIndirizzo(indirizzoConcittadino2); 
        personaConcittadino3.setIndirizzo(indirizzoConcittadino3); 

        //Creazione Array Elenco di Perosne
        Persona[] elencoPersoneNoConcittadino = {personaConcittadino1,personaConcittadino3};
        Persona[] elencoPersoneSiConcittadino = {personaConcittadino2,personaConcittadino3};

        //Stampa Elenco di Persone
        System.out.println("Primo Elenco: \n" + Persona.stringElenco(elencoPersoneNoConcittadino));
        System.out.println("Secondo Elenco: \n" + Persona.stringElenco(elencoPersoneSiConcittadino));


        System.out.print(personaConcittadinoTest.stringPersona()+ " ha un concittadino nel primo elenco ?\n");
        System.out.println(personaConcittadinoTest.haAlmenoUnConcittadino(elencoPersoneNoConcittadino)); //False
        System.out.print(personaConcittadinoTest.stringPersona()+ " ha un concittadino nel secondo elenco ?\n");
        System.out.println(personaConcittadinoTest.haAlmenoUnConcittadino(elencoPersoneSiConcittadino)); //True

        //----- TEST: sonoTuttiPiuAnziani ----

        System.out.println("----- TEST: sonoTuttiPiuAnziani ----");

        //Creazione di indirizzi

        Indirizzo indirizzoAnziana = new Indirizzo("Roma", "Via Cagliari", "38");
        Indirizzo indirizzoAnziana1 = new Indirizzo("Monterotondo", "Via Montopoli", "4");
        Indirizzo indirizzoAnziana2 = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoAnziana3 = new Indirizzo("Milano","Via Ettore Rolli", "52");


        //Creazione di persona 
        Persona personaAnzianaTest = new Persona("Rossenberg","Ramboanga",25, indirizzoAnziana);
        Persona personaAnzianaTest1 = new Persona("Nicky","Abero",19,indirizzoAnziana1);
        Persona personaAnzianaTest2 = new Persona("Rene","Neumann",25,indirizzoAnziana2);
        Persona personaAnzianaTest3 = new Persona("Lorenzo", "Dongalen", 40, indirizzoAnziana3);

        //Elenco di persone
        Persona[] elencoPersoneAnziana = {personaAnzianaTest1,personaAnzianaTest2,personaAnzianaTest3};
        
        //Stampa Elenco di Persone
        System.out.println(Persona.stringElenco(elencoPersoneAnziana));

        //Stampa
        System.out.print(personaAnzianaTest.stringPersona()+ " è la più anziana dell'elenco: ? \n");
        System.out.println(personaAnzianaTest.sonoTuttiPiuAnziani(elencoPersoneAnziana)); //False

        //----- TEST: quantiAbitanoNelMioStessoPalazzo ----

        System.out.println("----- TEST: quantiAbitanoNelMioStessoPalazzo ----");

        Indirizzo indirizzoStessoPalazzo1 = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoStessoPalazzo2 = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoStessoPalazzo3 = new Indirizzo("Milano","Via Ettore Rolli", "52");

        //Creazione di persona 
        Persona personaStessoPalazzo1 = new Persona("Rossenberg","Ramboanga",25, indirizzoStessoPalazzo1);
        Persona personaStessoPalazzo2 = new Persona("Nicky","Abero",19,indirizzoStessoPalazzo2);
        Persona personaStessoPalazzo3 = new Persona("Rene","Neumann",25,indirizzoStessoPalazzo3);

        //Elenco di persone
        Persona[] elencoPersoneStessoPalazzo = {personaStessoPalazzo2,personaStessoPalazzo3};
        //Stampa Elenco di Persone
        System.out.println(Persona.stringElenco(elencoPersoneStessoPalazzo));

        
        //Stampa
        System.out.print("Quanti abitano nel palazzo di "+ personaStessoPalazzo1.stringPersona()+ "? \n");
        System.out.println(personaStessoPalazzo1.quantiAbitanoNelMioStessoPalazzo(elencoPersoneStessoPalazzo)); //1

        //----- TEST: vieneACoabitareConTe ----
        System.out.println("----- TEST: vieneACoabiareConTes ----");

        Indirizzo indirizzoMio = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoCoinquilino = new Indirizzo("Milano","Via Ettore Rolli", "52");

        Persona personaIo = new Persona("Rossenberg","Ramboanga",25, indirizzoMio);
        Persona personaNuovoCoinquilino = new Persona("Nicky","Abero",19,indirizzoCoinquilino);

        System.out.println(personaIo.stringPersona());
        System.out.println(personaNuovoCoinquilino.stringPersona());
        System.out.println("Cambia Indirizzo del Nuovo Coinquilino");
        personaIo.vieneACoabitareConTe(personaNuovoCoinquilino);
        System.out.println(personaNuovoCoinquilino.stringPersona());

        //----- TEST: getIndirizzoOver60 ----
        System.out.println("----- TEST: getIndirizzoOver60 ----");

        //Creazione Indirizzi
        Indirizzo indirizzoOver601 = new Indirizzo("Roma", "Via Cagliari", "38");
        Indirizzo indirizzoOver602 = new Indirizzo("Monterotondo", "Via Montopoli", "4");
        Indirizzo indirizzoOver603 = new Indirizzo("Roma", "Via Laurina", "52");
        Indirizzo indirizzoOver604 = new Indirizzo("Milano","Via Ettore Rolli", "52");
        //Creazione di persona 
        Persona personaOver601 = new Persona("Rossenberg","Ramboanga",25, indirizzoOver601);
        Persona personaOver602 = new Persona("Nicky","Abero",19,indirizzoOver602);
        Persona personaOver603 = new Persona("Rene","Neumann",60,indirizzoOver603);
        Persona personaOver604 = new Persona("Rene","Neumann",80,indirizzoOver604);

        //Elenco di persone
        Persona[] elencoPersone = {personaOver601,personaOver602,personaOver603,personaOver604};

        //Test
        System.out.println("Elenco persone");
        System.out.println(Persona.stringElenco(elencoPersone));

        //Indirizzo[] elencoIndirizzi = Persona.getIndirizziOver60(elencoPersone);

        //System.out.println("Giusto fino a qua");
        //System.out.println(Persona.stringElencoIndirizzi(elencoIndirizzi));
        
    }
}