import java.util.*;

public class TestArray2 {

	public static int dimmiQuantiMinoriDi(int[] input, int value){
		int count = 0;
		for(int i=0; i < input.length; i++) {
			if(input[i]<value) count += 1;
		}
		return count;
	}

	public static void main(String[] args){

		int[] myArray = {4, 6, 51, 24, 32, 4};
		int valore = 10;

		System.out.println("Array di ingresso: " + Arrays.toString(myArray));
		System.out.println("Elementi minori di 10: "+ dimmiQuantiMinoriDi(myArray,valore));


	}
}