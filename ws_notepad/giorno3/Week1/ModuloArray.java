public class ModuloArray{

    /*Dato un array di interi, restituisce un nuovo array con i valori dell'array
     * di input al quadrato. 
     */

    public static int moduloArray(int[] valori){
        int result =0;
        for(int num: valori) result += num*num ;
        return result;
    }



}