public class ProdottoVettoriale{

    /*Dati due array di interi in ingresso, restituisce un array del loro prodotto vettoriale.*/
    
    public static int[] prodottoVettoriale(int[] primo, int[] secondo){
        int[] resultArray = new int[primo.length];
        if(primo.length != secondo.length) return resultArray;
        for(int i=0; i<primo.length;i++){
            resultArray[i] = primo[i]*secondo[i];
        }
        return resultArray;
    }
}