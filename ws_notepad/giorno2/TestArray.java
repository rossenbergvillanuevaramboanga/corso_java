import java.util.*;

public class TestArray{

    public static boolean VerificaSeSommaUgualeZero(int[] valori){

        int somma = 0;
        for(int i=0; i< valori.length; i++){
            somma += valori[i];
        }

        return (somma == 0);
    }

    public static void main(String[] args){

        int[] myArray = {0,0,0,0,0};

        System.out.println("Input: " + Arrays.toString(myArray));
        System.out.println("Sum of array elements is zero: " + VerificaSeSommaUgualeZero(myArray));
    }

}