package it.prova.iterazioni.model;

import java.util.ArrayList;
import java.util.List;




public class NumberUtilityList {
	
	//ESERCIZIO 1
	public static boolean calcolaSeTantiDispariQuandiPari(List<Integer> input) {
		int countPari = 0; 
		int countDispari = 0; 
		
		for(Integer number : input) {
			if(number % 2 == 0) countPari++; 
			else countDispari++; 
		}
		return countDispari == countPari;
	}
	
	//ESERCIZIO 2
	public static boolean totaleElementiInPosizioniPariMenoTotaleElementiInPosizioneZeroMaggioreDiZero(List<Integer> input) {
		int sommaPari = 0; 
		int sommaDispari = 0; 
		boolean isPari = true; 
		for(Integer number : input) {
			if(isPari){
				sommaPari += number;
				isPari=false;
				
			}
			else {
				sommaDispari += number;
				isPari=true;
			}
		}
		return sommaPari - sommaDispari > 0;
	}
	
	//ESERCIZIO 3
	public static int quantiSonoDivisibiliPer(List<Integer> valore, int divisore) {
		int count = 0; 
		for(Integer number: valore) {
			if(number % divisore == 0 || number == 0) count++;
		}
		return count;
	}
	
	//ESERCIZIO 4
	public static List<Integer> creaUnione(List<Integer> primo, List<Integer> secondo){
		
		List<Integer> result = new ArrayList<Integer>(primo);
		for(Integer number : secondo) {
			result.add(number);
		}
		return result; 	
	}
	
	//ESERCIZIO 5
	public static int calcolaScalare(List<Integer> input, int valore) {
		int sum = 0; 
		for(Integer number : input) sum += number;
		return sum * valore; 
	}
	
	//ESERCIZIO 6
	public static List<Integer> aggiungiInCoda(List<Integer> input, int valore){
		input.add(valore);
		return input;
	}
	
	

}
