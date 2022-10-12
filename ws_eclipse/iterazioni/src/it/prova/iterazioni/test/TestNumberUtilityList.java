package it.prova.iterazioni.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import it.prova.iterazioni.model.NumberUtilityList;


public class TestNumberUtilityList {
	
	public static List<Integer> randomList(int dimensione){
        List<Integer> result = new ArrayList<Integer>();

        for(int i=0;  i < dimensione; i++){
            result.add(new Random().nextInt(100));
        }

        return result;
    }

    public static void main(String[] args) {

        //Test 1
        List<Integer> testListDispariPari = randomList(6);
        
        System.out.println("\n-------TEST: calcolaSeTantiDispariQuantiPari------");
        System.out.println(Arrays.toString(testListDispariPari.toArray()));
        System.out.println(NumberUtilityList.calcolaSeTantiDispariQuandiPari(testListDispariPari));
        
        
        

       
         //Test 2
        List<Integer> testListDispariPariMinoreZero = randomList(5);

        System.out.println("\n-------TEST: totaleElementiInPosizioniPariMenoTotaleElementiInPosizioneZeroMaggiorerDiZero------");
        System.out.println(Arrays.toString(testListDispariPariMinoreZero.toArray()));
        System.out.println(NumberUtilityList.totaleElementiInPosizioniPariMenoTotaleElementiInPosizioneZeroMaggioreDiZero(testListDispariPariMinoreZero));
        
        
        //Test 3
        List<Integer> testListDivisibiliPer = randomList(5);
        int  valueDivisibiliPer =  new Random().nextInt(10) + 1;

        System.out.println("\n-------TEST: quantiSonoDivisibiliPer------");
        System.out.println(Arrays.toString(testListDivisibiliPer.toArray()));
        System.out.println(valueDivisibiliPer);
        System.out.println(NumberUtilityList.quantiSonoDivisibiliPer(testListDivisibiliPer,valueDivisibiliPer));
        
        

        //Test 4
        List<Integer> testListUnione1 = randomList(5);
        List<Integer> testListUnione2 = randomList(5);

        System.out.println("\n-------TEST: creaUnione------");
        System.out.println(Arrays.toString(testListUnione1.toArray()));
        System.out.println(Arrays.toString(testListUnione2.toArray()));
        System.out.println(Arrays.toString(NumberUtilityList.creaUnione(testListUnione1,testListUnione2).toArray()));
        
       
        //Test 5
        List<Integer> testListScalare = randomList(5);
        int  valueScalare =  new Random().nextInt(10);

        System.out.println("\n-------TEST: calcolareScalare------");
        System.out.println(Arrays.toString(testListScalare.toArray()));
        System.out.println(valueScalare);
        System.out.println(NumberUtilityList.calcolaScalare(testListScalare,valueScalare));
        
        

        //Test 6
        List<Integer> testListCoda = randomList(5);
        int  valueCoda =  new Random().nextInt(10);

        System.out.println("\n-------TEST: aggiungiInCoda------");
        System.out.println(Arrays.toString(testListCoda.toArray()));
        System.out.println(valueCoda);
        System.out.println(Arrays.toString(NumberUtilityList.aggiungiInCoda(testListCoda,valueCoda).toArray()));
        
     
        
    }

}
