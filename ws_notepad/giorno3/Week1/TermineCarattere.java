public class TermineCarattere{

    /*Dato un array di Stringhe e un carattere in input, verifica che tutte le stringhe nell'array
     * terminino con il carattere in input.
     */

    public static boolean terminanoTuttiConIlCarattere(String[] elencoNomi, char carattere){
        for(String nome:elencoNomi){
            if(nome.charAt(nome.length()-1) != carattere)return false;
        }
        return true;
    }

}