public class TestArray3 {

	public static boolean presenteSoloUnaVolta(String[] elenco, String input){

		int count = 0, i = 0; 

		while(count <=1 && i<elenco.length){
			if(elenco[i].equals(input)) count +=1; 
			i +=1; 
		}

		return count == 1; 
	}

	public static void main(String[] args){

		String[] myArray = {"Gatto", "Cane", "Topo", "Pesce", "Cane", "Criceto"};
		String parola = "Topo"; 
		String parola2 = "Cane";
		String parola3 = "Criceto";

		System.out.println(presenteSoloUnaVolta(myArray,parola));
		System.out.println(presenteSoloUnaVolta(myArray,parola2));
		System.out.println(presenteSoloUnaVolta(myArray,parola3));
	}
}