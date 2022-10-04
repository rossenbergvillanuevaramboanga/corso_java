public class ValutaArray{

	public static void main(String[] args){

		int[] valori = {7,8,11,2,4};

		for(int i=0; i< valori.length; i++){
			System.out.println(valori[i]);
		}

		int index=0;
		while(index<=valori.length -1){
			System.out.println(valori[index]);
			index++;
		}
	}
}