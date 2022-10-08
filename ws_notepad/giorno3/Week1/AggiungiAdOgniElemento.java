public class AggiungiAdOgniElemento{

    /*Dato un array di interi in input, restituisce un nuovo array di interi che continiene
     * i valori dell'array in input incrementati di 50 se il risultato è divisibile per 50 
     * e 0 altrimenti.
    */

    public static int[] aggiungiAdOgniElemento(int[] input){
        int[] arrayResult = new int[input.length];
        for(int i=0; i< input.length; i++){ 
            if(input[i] % 25 == 0){
                arrayResult[i]=input[i]+50;
            }
            else{
                arrayResult[i]=0;
            };
        }
        return arrayResult;
    }

}