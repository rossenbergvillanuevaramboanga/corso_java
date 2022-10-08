import java.util.Arrays;

public class TestSpettatore{

    public static void main(String[] args) {

        //-----TEST: incassoSpettatoriNellaMiaFila
        System.out.println("-----TEST: incassoSpettatoriNellaMiaFila");

        //Creazione Biglietto
        Biglietto biglietto1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto biglietto2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto biglietto3 = new Biglietto("Avengers","D", 3, 20 );
        Biglietto biglietto4 = new Biglietto("Il re leone","A", 12, 60 );
        //Creazione Spettatori
        Spettatore spettatore1 = new Spettatore("Simba", "Rambo", "12345", biglietto1);
        Spettatore spettatore2 = new Spettatore("Ariel", "Neumann", "34356", biglietto2);
        Spettatore spettatore3 = new Spettatore("Tony","Stark", "34576", biglietto3);
        Spettatore spettatore4 = new Spettatore("Nala", "Lion", "90473", biglietto4);
        //Creazione ListaSpettatori
        Spettatore[] listaSpettatoriStessaFile = {spettatore1,spettatore2,spettatore3,spettatore4};

        //Stampe Spettatori
        System.out.println(spettatore1.toString());
        System.out.println(spettatore2.toString());
        System.out.println(spettatore3.toString());
        System.out.println(spettatore4.toString());

        //-----TEST: incassoSpettatoriNellaMiaFila
        System.out.println("-----TEST: incassoSpettatoriNellaMiaFila");
        System.out.println(spettatore1.incassoSpettatoriNellaMiaFila(listaSpettatoriStessaFile)); 
        //Expected Result: 120

        //-----TEST: numeroSpettatoriDelMioStessoSpettacolo

        System.out.println("-----TEST: numeroSpettatoriDelMioStessoSpettacolo");

        //Creazione Biglietto
        Biglietto bigliettoStessoBiglietto1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoStessoBiglietto2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto bigliettoStessoBiglietto3 = new Biglietto("Avengers","D", 3, 20 );
        Biglietto bigliettoStessoBiglietto4 = new Biglietto("Il re leone","A", 12, 60 );
        //Creazione Persone
        Spettatore spettatoreStessoBiglietto1 = new Spettatore("Ross", "Rambo", "12345", bigliettoStessoBiglietto1);
        Spettatore spettatoreStessoBiglietto2 = new Spettatore("Ariel", "Neumann", "34356", bigliettoStessoBiglietto2);
        Spettatore spettatoreStessoBiglietto3 = new Spettatore("Tony","Stark", "34576", bigliettoStessoBiglietto3);
        Spettatore spettatoreStessoBiglietto4 = new Spettatore("Nala", "Lion", "90473", bigliettoStessoBiglietto4);
        //Creazione ListaSpettatori
        Spettatore[] ListaSpettatoriStessoSpettacolo = {spettatoreStessoBiglietto2,spettatoreStessoBiglietto3,spettatoreStessoBiglietto4};
        
        //Test
        System.out.println(spettatoreStessoBiglietto1.numeroSpettatoriDelMioStessoSpettacolo(ListaSpettatoriStessoSpettacolo));
        //Expected Result: 1

        //-----TEST: numeroSpettatoriDelMioStessoSpettacolo
        System.out.println("-----TEST: spettatoriDelMioStessoSpettacolo");
        int aspettativa1 = 0;
        int aspettativa2 = 2;
        System.out.println(spettatoreStessoBiglietto1.spettatoriDelMioStessoSpettacoloSuperaAspettativa(ListaSpettatoriStessoSpettacolo,aspettativa1));//true
        System.out.println(spettatoreStessoBiglietto1.spettatoriDelMioStessoSpettacoloSuperaAspettativa(ListaSpettatoriStessoSpettacolo, aspettativa2));//false

        //-----TEST: piuEconomico
        System.out.println("-----TEST: piuEconomico");
        //Expected Result: Avengers, D, 3, 20
        

        Biglietto bigliettoEconomico1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoEconomico2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto bigliettoEconomico3 = new Biglietto("Avengers","D", 3, 20 );
        Biglietto bigliettoEconomico4 = new Biglietto("Il re leone","A", 12, 60 );

        Biglietto[] listaBigliettiEconomici = {bigliettoEconomico1,bigliettoEconomico2,bigliettoEconomico3,bigliettoEconomico4};

        System.out.println(Biglietto.piuEconomico(listaBigliettiEconomici));

        //-----TEST: piuEconomico
        System.out.println("-----TEST: bigliettoInvenduto");

        Biglietto myBiglietto = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoInvenduto1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoInvenduto2 = new Biglietto("Avengers","D", 3, 20 );
        Biglietto bigliettoInvenduto3 = new Biglietto("Il re leone","A", 12, 60 );

        Biglietto[] listBigliettiInvenduti = {bigliettoInvenduto1,bigliettoInvenduto2,bigliettoInvenduto3};

        System.out.println(myBiglietto.bigliettoAncoraInvenduto(listBigliettiInvenduti));//True

        //-----METODI PER WEEK 01
        System.out.println("\n---------METODI PER WEEK 01");

        //--------contaQuantiSenzaBiglietto
        System.out.println("\n---------contaQuantiSenzaBiglietto");

        //Creazione Biglietto
        Biglietto bigliettoSenzaBiglietto1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoSenzaBiglietto2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto bigliettoSenzaBiglietto3 = new Biglietto("Avengers","D", 3, 20 );
        //Creazione Persone
        Spettatore spettatoreSenzaBiglietto1 = new Spettatore("Ross", "Rambo", "12345", bigliettoSenzaBiglietto1);
        Spettatore spettatoreSenzaBiglietto2 = new Spettatore("Ariel", "Neumann", "34356", bigliettoSenzaBiglietto2);
        Spettatore spettatoreSenzaBiglietto3 = new Spettatore("Tony","Stark", "34576", bigliettoSenzaBiglietto3);
        Spettatore spettatoreSenzaBiglietto4 = new Spettatore("Nala", "Lion", "90473");
        //Creazione ListaSpettatori
        Spettatore[] ListaSpettatoriSenzaBiglietto = {
            spettatoreSenzaBiglietto1,
            spettatoreSenzaBiglietto2,
            spettatoreSenzaBiglietto3,
            spettatoreSenzaBiglietto4
        };

        System.out.println(Spettatore.contaQuantiSenzaBiglietto(ListaSpettatoriSenzaBiglietto));
        //Expected Result: 1

        
         //--------contaQuantiNellaMiaStessaFila
         System.out.println("\n//--------contaQuantiNellaMiaStessaFila");

         //Creazione Biglietto
        Biglietto bigliettoStessaFila1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoStessaFila2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto bigliettoStessaFila3 = new Biglietto("Il re leone","D", 3, 20 );
        Biglietto bigliettoStessaFila4 = new Biglietto("Il re leone","A", 12, 60 );

        //Creazione Persone
        Spettatore spettatoreStessaFila1 = new Spettatore("Ross", "Rambo", "12345", bigliettoStessaFila1);
        Spettatore spettatoreStessaFila2 = new Spettatore("Ariel", "Neumann", "34356", bigliettoStessaFila2);
        Spettatore spettatoreStessaFila3 = new Spettatore("Tony","Stark", "34576", bigliettoStessaFila3);
        Spettatore spettatoreStessaFila4 = new Spettatore("Nala", "Lion", "90473",bigliettoStessaFila4);
        //Creazione ListaSpettatori
        Spettatore[] ListaStessaFila = {
            spettatoreStessaFila1,
            spettatoreStessaFila2,
            spettatoreStessaFila3,
            spettatoreStessaFila4
        };

        System.out.println(spettatoreStessaFila1.contaQuantiNellaMiaStessaFila(ListaStessaFila));
        //Expected Result: 2

        //--------eIlPiuCaroDeiPaganti
        System.out.println("\n//--------eIlPiuCaroDeiPaganti");

        //Creazione Biglietto
        Biglietto bigliettoCaro1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto bigliettoCaro2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto bigliettoCaro3 = new Biglietto("Avengers","D", 3, 20 );
        //Creazione Persone
        Spettatore spettatoreCaro1 = new Spettatore("Ross", "Rambo", "12345", bigliettoCaro1);
        Spettatore spettatoreCaro2 = new Spettatore("Ariel", "Neumann", "34356", bigliettoCaro2);
        Spettatore spettatoreCaro3 = new Spettatore("Tony","Stark", "34576", bigliettoCaro3);
        //Creazione ListaSpettatori
        Spettatore[] ListaSpettatoriCaro = {
            spettatoreCaro1,
            spettatoreCaro2,
            spettatoreCaro3,
        };

        System.out.println(bigliettoCaro1.eIlPiuCaroDeiPaganti(ListaSpettatoriCaro));
        System.out.println(bigliettoCaro2.eIlPiuCaroDeiPaganti(ListaSpettatoriCaro));
        System.out.println(bigliettoCaro3.eIlPiuCaroDeiPaganti(ListaSpettatoriCaro));
        /*
        Expected Result:
        true
        false
        false */

        //--------sonoTuttiBigliettiPerLoSpettacoloIntitolato
        System.out.println("\n//--------sonoTuttiBigliettiPerLoSpettacoloIntitolato");

        //Creazione Biglietto
        Biglietto biglietoNomeSpettacolo1 = new Biglietto("Il re leone","A", 4, 60 );
        Biglietto biglietoNomeSpettacolo2 = new Biglietto("La Sirenetta","A", 3, 30 );
        Biglietto biglietoNomeSpettacolo3 = new Biglietto("Il re leone","D", 3, 20 );
        Biglietto biglietoNomeSpettacolo4 = new Biglietto("Il re leone","A", 12, 60 );

        //Creazione Liste

        Biglietto[] listeNomeSpettacolo1 = {biglietoNomeSpettacolo1,biglietoNomeSpettacolo2,biglietoNomeSpettacolo3};
        Biglietto[] listeNomeSpettacolo2 = {biglietoNomeSpettacolo1,biglietoNomeSpettacolo3,biglietoNomeSpettacolo4};

        System.out.println(Biglietto.sonoTuttiBigliettiPerLoSpettacoloIntitolato(listeNomeSpettacolo1, "Il re leone"));
        System.out.println(Biglietto.sonoTuttiBigliettiPerLoSpettacoloIntitolato(listeNomeSpettacolo2, "Il re leone"));

        /*
        Expected Result:
        false
        true
        */

 






    






    
    }
    
}