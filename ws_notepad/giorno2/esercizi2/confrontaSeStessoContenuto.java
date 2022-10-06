import java.util.*;

public class confrontaSeStessoContenuto{

    public static boolean stessoContenuto(int[] sorgente, int[] destinazione){
        if(sorgente.length != destinazione.length) return false;
        for(int i=0; i < sorgente.length; i++){
            if(sorgente[i] != destinazione[i]) return false;
        }
        return true;
    }

    public static void main(String[] args){

        //------- TEST: stessoContenuto -------
        int[] myTestArray1 = {1,2,3,4};
        int[] myTestArray2 = {1,2,3};
        int[] myTestArray3 = {1,2,3,4};
        int[] myTestArray4 = {3,4,5,6};

        System.out.println("------- TEST 1: stessoContenuto -------");
        System.out.println(Arrays.toString(myTestArray1) + " ha lo stesso contenuto di " + Arrays.toString(myTestArray2) + ": " + stessoContenuto(myTestArray1,myTestArray2)); // false
        System.out.println(Arrays.toString(myTestArray1) + " ha lo stesso contenuto di " + Arrays.toString(myTestArray3) + ": " + stessoContenuto(myTestArray1,myTestArray3)); // true
        System.out.println(Arrays.toString(myTestArray1) + " ha lo stesso contenuto di " + Arrays.toString(myTestArray4) + ": " + stessoContenuto(myTestArray1,myTestArray4)); // false

    }
    
}