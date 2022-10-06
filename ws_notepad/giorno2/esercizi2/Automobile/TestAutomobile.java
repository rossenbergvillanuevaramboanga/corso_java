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
        System.out.printf("Risultato: " + auto2.checkSePiuDiDueAnni(annoDiRiferimento));
        System.out.println();
                
    }
}