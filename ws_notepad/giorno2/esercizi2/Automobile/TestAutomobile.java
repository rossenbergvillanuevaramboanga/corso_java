public class TestAutomobile{

    public static void main(String[] args){

        //------- TEST 1: accellera -------
        System.out.println("------- TEST 1: accellera -------");

        Automobile auto1 = new Automobile("Fiat", "500", 90, 2008);
        int accelerazione = 10;

        auto1.stampaAutomobile();
        
        System.out.printf("Accelleriamo l'auto aumentando di %d Km/h \n", accelerazione);
        System.out.printf("Risultato: ");
        auto1.accellera(accelerazione);
        auto1.stampaAutomobile();

        System.out.println();

        //------- TEST 2: checkSePiuDiDueAnni -------
        System.out.println("------- TEST 2: checkSePiuDiDueAnni -------");

        Automobile auto2 = new Automobile("Fiat", "Panda", 100, 2012);
        int annoDiRiferimento = 2022;

        auto2.stampaAutomobile();
        System.out.printf("Sono passati piú di 2 anni dall'anno di revisione al %d ? \n", annoDiRiferimento);
        System.out.println("Risultato: " + auto2.checkSePiuDiDueAnni(annoDiRiferimento));
        System.out.println();

        //------- TEST 3: modelloPresenteInCatalogo -------
        System.out.println("------- TEST 3: modelloPresenteInCatalogo -------");

        Automobile autoPerTestPresentiInCatalogo1 = new Automobile("Fiat", "Panda", 100, 2012);
        Automobile autoPerTestPresentiInCatalogo2 = new Automobile("Lamborghini", "Urus", 100, 2019);
        Automobile autoPerTestPresentiInCatalogo3 = new Automobile("Tesla", "ModelX", 100, 2022);
        Automobile autoPerTestPresentiInCatalogo4 = new Automobile("Fiat", "500XL", 100, 2012);

        Automobile autoPresente = new Automobile("Fiat", "Panda", 100, 2012);
        Automobile autoNonPresente = new Automobile("Testla", "ModelS", 100, 2012);
        
        Automobile[] catalogoTest1 = {
            autoPerTestPresentiInCatalogo1, 
            autoPerTestPresentiInCatalogo2, 
            autoPerTestPresentiInCatalogo3, 
            autoPerTestPresentiInCatalogo4
        };
        Automobile.stampaCatalogo(catalogoTest1);
        System.out.printf("Auto %s %s presente nel catalogo? \n", autoPresente.getMarca(), autoPresente.getModello() );
        System.out.println("Risultato: " + autoPresente.modelloPresenteInCatalogo(catalogoTest1));  //True
        System.out.printf("Auto %s %s presente nel catalogo? \n", autoNonPresente.getMarca(), autoNonPresente.getModello());
        System.out.println("Risultato: " + autoNonPresente.modelloPresenteInCatalogo(catalogoTest1)); //False

        System.out.println();

        //------- TEST 4: sonoTutteFerme -------
        System.out.println("------- TEST 4: sonoTutteFerme -------");

        Automobile autoFermePerTest1 = new Automobile("Fiat", "Panda", 0, 2012);
        Automobile autoFermePerTest2 = new Automobile("Lamborghini", "Urus", 0, 2019);
        Automobile autoFermePerTest3 = new Automobile("Tesla", "ModelX", 100, 2022);
        Automobile autoFermePerTest4 = new Automobile("Fiat", "500XL", 0, 2012);

        Automobile[] catalogoTutteFerme = {
            autoFermePerTest1,
            autoFermePerTest2
        };

        Automobile[] catalogoNonTutteFerme = {
            autoFermePerTest3,
            autoFermePerTest4
        };

        Automobile.stampaCatalogo(catalogoTutteFerme);
        System.out.println("Le auto del catalogo 1 sono tutte ferme?");
        System.out.println("Risultato: " + Automobile.sonoTutteFerme(catalogoTutteFerme));  //True

        Automobile.stampaCatalogo(catalogoNonTutteFerme);
        System.out.println("Le auto del catalogo 2 sono tutte ferme?");
        System.out.println("Risultato: " + Automobile.sonoTutteFerme(catalogoNonTutteFerme));  //False

        System.out.println();

        //------- TEST 5: numeroOccorrenze -------
        System.out.println("------- TEST 5: numeroOccorrenze -------");

        Automobile autoNumeroOccorrenze1 = new Automobile("Fiat", "Panda", 0, 2012);
        Automobile autoNumeroOccorrenze2 = new Automobile("Lamborghini", "Urus", 0, 2019);
        Automobile autoNumeroOccorrenze3 = new Automobile("Tesla", "ModelX", 100, 2022);
        Automobile autoNumeroOccorrenze4 = new Automobile("Fiat", "Panda", 0, 2012);

        Automobile[] catalogoNumeroOccorrenze = {
            autoNumeroOccorrenze1,
            autoNumeroOccorrenze2,
            autoNumeroOccorrenze3,
            autoNumeroOccorrenze4,
        };

        Automobile.stampaCatalogo(catalogoNumeroOccorrenze);

        System.out.printf("Auto %s %s è presente nel catalogo %d volte\n", 
        autoNumeroOccorrenze1.getMarca(), 
        autoNumeroOccorrenze1.getModello(),
        autoNumeroOccorrenze1.numeroOccorrenze(catalogoNumeroOccorrenze)
        );

        System.out.println();

        //------- TEST 6: revisionePiuRecente -------
        System.out.println("------- TEST 5: revisionePiuRecente -------");

        Automobile autoRevisioneRecente1 = new Automobile("Fiat", "Panda", 0, 2012);
        Automobile autoRevisioneRecente2 = new Automobile("Lamborghini", "Urus", 0, 2019);
        Automobile autoRevisioneRecente3 = new Automobile("Tesla", "ModelX", 100, 2022);
        Automobile autoRevisioneRecente4 = new Automobile("Fiat", "Panda", 0, 2012);

        Automobile[] catalogoRevisioneRecente = {
            autoRevisioneRecente1,
            autoRevisioneRecente2,
            autoRevisioneRecente3,
            autoRevisioneRecente4,
        };

        Automobile.stampaCatalogo(catalogoRevisioneRecente);
        System.out.printf("Auto %s %s ha la revisione più recente nel catalogo\n", 
        Automobile.revisionePiuRecente(catalogoRevisioneRecente).getModello(), 
        Automobile.revisionePiuRecente(catalogoRevisioneRecente).getMarca()
        );

        System.out.println();



                
    }
}