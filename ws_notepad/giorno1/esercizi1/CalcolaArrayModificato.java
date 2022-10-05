import java.util.*;
import java.io.*;

public class CalcolaArrayModificato{

    public static int[] modificaArray(int[] array, int valore){

        //Creazione di un nuovo oggetto di tipo array di int
        int[] result = new int[array.length];

        for(int i=0; i < array.length; i++){
            if(array[i]- valore <=0) result[i] = 0;
            else{ 
                result[i] = array[i]- valore;
            }
        };

        return result;
    }

    
    public static void main(String[] args){

        int[] myArray = {5,3,7,80,45};
        int num = 7;

        System.out.println("Array di input: " + Arrays.toString(myArray));
        System.out.printf("Valore di decremento: %d \n",num);

        int[] risultato = modificaArray(myArray, num);

        System.out.println("Risultato: " + Arrays.toString(risultato));
        
    }
}