public class TrovaCaratteriPari{

    /*Data una string in input, restituisce una nuova stringa contenente in caratteri
     * della string in ingresso nelle posizioni pari.
     */
    
    public static String trovaCaratteriPari(String input){
        String result = "";
        for(int i=0;i<input.length();i+=2){
            result += input.charAt(i);
        }
        return result;
    }
}