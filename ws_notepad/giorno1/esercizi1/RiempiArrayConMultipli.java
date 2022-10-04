import java.util.Arrays;

public class RiempiArrayConMultipli{

    public static void main(String[] args){

        int value = 5;
        int[] myArray = new int[5];

        myArray[0] = value;

        for(int i=1; i< myArray.length; i++){
            myArray[i] = myArray[i-1]*2;
        };

        //Stampa Array con ciclo for
        /*

        for(int i=0; i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

        */
        System.out.printf("Valore: %d. Dimensione Array: %d.\n", value, myArray.length);
        System.out.println(Arrays.toString(myArray));
    }
}