import java.util.*;

public class verificaSeOrdineDecrescente{

    public static boolean ordineDecrescente(int[] input){
        for(int i=0; i<input.length -1; i++){
            if(input[i] <= input[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args){

        //------- TEST: ordineDecrescente -------
        int[] myTestArray1 = {1,2,3,4};
        int[] myTestArray2 = {4,3,2,1};

        System.out.println("------- TEST: ordineDecrescente -------");
        System.out.println(Arrays.toString(myTestArray1) + " è in ordine decrescente?: " + ordineDecrescente(myTestArray1));
        System.out.println(Arrays.toString(myTestArray2) + " è in ordine decrescente?: " + ordineDecrescente(myTestArray2));

    }
}