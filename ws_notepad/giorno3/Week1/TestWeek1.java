import java.util.Arrays;


public class TestWeek1{

    public static void main(String[] String){

        //TEST1: aggiungiAdOgniElemento
        System.out.println("\n ---------------TEST1: aggiungiAdOgniElemento");

        int[] testArray1 = {5,25,10,75,3};

        System.out.println("Input: "+ Arrays.toString(testArray1));
        System.out.println("Output: "+ Arrays.toString(AggiungiAdOgniElemento.aggiungiAdOgniElemento(testArray1)));
        
        //TEST2:trovaCaratteriPari
        System.out.println("\n---------------TEST2: trovaCaratteriPari");
        
        String testString1 = "Rossenberg";

        System.out.println("Input: " + testString1);
        System.out.println("Output: "+ TrovaCaratteriPari.trovaCaratteriPari(testString1));

        //TEST3: verificaSeMultipli
        System.out.println("\n---------------TEST3: verificaSeMultipli");
        
        int[] testValori1 = {2,5,7,9};
        int[] testValori2 = {4,10,21,36};
        int[] testValori3 = {4,10,21,27};
        int[] testValori4 = {1,6,4,3};

        System.out.println(
            Arrays.toString(testValori1) + ", " +  Arrays.toString(testValori2) + "\n" +
            Arrays.toString(testValori1) + ", " +  Arrays.toString(testValori3) + "\n" +
            Arrays.toString(testValori1) + ", " +  Arrays.toString(testValori4) + "\n" 
        );


        System.out.println(
            VerificaSeMultipli.verificaSeMultipli(testValori1, testValori2) + ", " +
            VerificaSeMultipli.verificaSeMultipli(testValori1, testValori3) + ", " +
            VerificaSeMultipli.verificaSeMultipli(testValori1, testValori4)
        );

        //TEST4: terminanoTuttiConIlCarattere
        System.out.println("\n---------------TEST4: terminanoTuttiConilCarattere");
        
        String[] testElencoNome1 = { "Matteo", "Marco", "Luca", "Giovanni"};
        String[] testElencoNome2 = { "Pippo", "Pluto", "Paperino"};
        char carattereDiControllo = 'o';

        System.out.println(Arrays.toString(testElencoNome1));
        System.out.println(Arrays.toString(testElencoNome2));
        System.out.println(carattereDiControllo);
        System.out.println(TermineCarattere.terminanoTuttiConIlCarattere(testElencoNome1, carattereDiControllo));
        System.out.println(TermineCarattere.terminanoTuttiConIlCarattere(testElencoNome2, carattereDiControllo));

        //TEST5: moduloArray
        System.out.println("\n---------------TEST5: moduloArray");

        int[] arrayNum = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrayNum));
        System.out.println("Modulo:" + ModuloArray.moduloArray(arrayNum));

        //TEST6: prodottoVettoriale
        System.out.println("\n---------------TEST6: prodottoVettoriale");

        int[] testArrayProdottoVettoriale1 = {2,3,4,5};
        int[] testArrayProdottoVettoriale2 = {3,4,5,6};
        
        System.out.println(Arrays.toString(testArrayProdottoVettoriale1));
        System.out.println(Arrays.toString(testArrayProdottoVettoriale2));
        System.out.println("Prodotto vettoriale: "+ Arrays.toString(ProdottoVettoriale.prodottoVettoriale(testArrayProdottoVettoriale1, testArrayProdottoVettoriale2)));


    }

}
