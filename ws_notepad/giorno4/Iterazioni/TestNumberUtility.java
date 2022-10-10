import java.util.Arrays;
import java.util.Random;

public class TestNumberUtility {

    public static int[] randomArray(int dimensione){
        int[] result = new int[dimensione];

        for(int i=0;  i < dimensione; i++){
            result[i] = new Random().nextInt(100);
        }

        return result;
    }

    public static void main(String[] args) {

        //Test 1
        int[] testArrayDispariPari = randomArray(5);

        System.out.println("\n-------TEST: calcolaSeTantiDispariQuantiPari------");
        System.out.println(Arrays.toString(testArrayDispariPari));
        System.out.println(NumberUtility.calcolaSeTantiDispariQuantipari(testArrayDispariPari));

         //Test 2
        int[] testArrayDispariPariMinoreZero = randomArray(5);

        System.out.println("\n-------TEST: totaleElementiInPosizioniPariMenoTotaleElementiInPosizioneZeroMaggiorerDiZero------");
        System.out.println(Arrays.toString(testArrayDispariPariMinoreZero));
        System.out.println(NumberUtility.totaleElementiInPosizioniPariMenoTotaleElementiInPosizioneZeroMaggioreDiZero(testArrayDispariPariMinoreZero));
        
        //Test Casa 1
        int[] testArrayDivisibiliPer = randomArray(5);
        int  valueDivisibiliPer =  new Random().nextInt(10);

        System.out.println("\n-------TEST: quantiSonoDivisibiliPer------");
        System.out.println(Arrays.toString(testArrayDivisibiliPer));
        System.out.println(valueDivisibiliPer);
        System.out.println(NumberUtility.quantiSonoDivisibiliPer(testArrayDivisibiliPer,valueDivisibiliPer));

        //Test Casa 2
        int[] testArrayUnione1 = randomArray(5);
        int[] testArrayUnione2 = randomArray(5);

        System.out.println("\n-------TEST: creaUnione------");
        System.out.println(Arrays.toString(testArrayUnione1));
        System.out.println(Arrays.toString(testArrayUnione2));
        System.out.println(Arrays.toString(NumberUtility.creaUnione(testArrayUnione1,testArrayUnione2)));

        //Test Casa 3
        int[] testArrayScalare = randomArray(5);
        int  valueScalare =  new Random().nextInt(10);

        System.out.println("\n-------TEST: calcolareScalare------");
        System.out.println(Arrays.toString(testArrayScalare));
        System.out.println(valueScalare);
        System.out.println(NumberUtility.calcolareScalare(testArrayScalare,valueScalare));

        //Test Casa 4
        int[] testArrayCoda = randomArray(5);
        int  valueCoda =  new Random().nextInt(10);

        System.out.println("\n-------TEST: aggiungiInCoda------");
        System.out.println(Arrays.toString(testArrayCoda));
        System.out.println(valueCoda);
        System.out.println(Arrays.toString(NumberUtility.aggiungiInCoda(testArrayCoda,valueCoda)));
        
    }
    
}
