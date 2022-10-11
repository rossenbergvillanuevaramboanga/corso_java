package it.prova.iterazioni.model;



public class NumberUtility {
	
	//Esercizio 1

    public static boolean calcolaSeTantiDispariQuantipari(int[] input){
        int countPari = 0; 
        int countDispari = 0;
        for(int number:input){
            if(number % 2 == 0) countPari++; 
            else countDispari++; 
        }
        return countDispari == countPari;
    }

    //Esercizio 2

    public static boolean totaleElementiInPosizioniPariMenoTotaleElementiInPosizioneZeroMaggioreDiZero(int[] input){
        int sommaPari = 0; 
        int sommaDispari = 0; 
        for(int i=0; i< input.length; i++){
            if(i%2 == 0){
                sommaPari += input[i];
            }
            else{
                sommaDispari += input[i];
            }
        }
        return sommaPari - sommaDispari > 0; 
    }

    //EsecizioCasa1

    public static int quantiSonoDivisibiliPer(int[] valore, int divisore){
        int count = 0; 
        for(int number : valore){
            if(number % 2 == 0) count ++;
        }
        return count;
    }

    //EsercizioCasa2

    public static int[] creaUnione(int[] primo, int[] secondo){

        int[] unione = new int[primo.length + secondo.length];

        for(int i=0; i< primo.length ; i++){
            unione[i] = primo[i];
        }

        for(int j=0; j< secondo.length; j++){
            unione[primo.length+j] = secondo[j];
        }
        return unione; 
    }

    //EsecizioCasa3

    public static int calcolareScalare(int[] input, int valore){
        int sum =0; 
        for(int number : input) sum += number; 
        return sum * valore;
    }

    //EsercizioCasa4

    public static int[] aggiungiInCoda(int[] input, int valore){
        int[] result = new int[input.length +1];
        for(int i=0; i<input.length ; i++){
                result[i] = input[i]; 

        }
        result[result.length -1] = valore; 
        return result;
    }
    
    //Ordinamento
    public static void ordina(int[] array) {
    	
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
 
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        
    	
    }
    
   
	

}
