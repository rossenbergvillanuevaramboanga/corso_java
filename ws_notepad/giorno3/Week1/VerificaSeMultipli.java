public class VerificaSeMultipli{

    /*Dato due array di interi, verifica se gli elementi del secondo array sono multipli
     * del primo nelle medesime posizionni.
     */

    public static boolean verificaSeMultipli(int[] valori, int[] multipli){
        if(valori.length != multipli.length) return false;
        for(int i=0; i<valori.length;i++){
            if(valori[i]%multipli[i]!=0) return false;
        }
        return false;

    }
}