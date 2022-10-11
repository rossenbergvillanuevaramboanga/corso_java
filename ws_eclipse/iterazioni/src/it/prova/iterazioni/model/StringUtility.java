package it.prova.iterazioni.model;


public class StringUtility {
	
	public static String creaStringaAlContrario(String frase, int indice) {
		
		String resultString = "";
		
		if(indice % 2 == 0) {
			for(int i = frase.length() - 1 ; i>=0; i--) {				
				if(i % 2 == 0) resultString += frase.charAt(i);
			}
		}
		else {
			for(int i = frase.length() - 1 ; i>=0; i--) {
				if(i % 2 != 0) resultString += frase.charAt(i);	;
			}
		}
		
		return resultString;
	}
	public static char[] trasformaInArrayDiChar(String frase) {
		char[] result = new char[frase.length()];
		for (int i = 0; i < frase.length(); i++) {
			result[i] = frase.charAt(i);
			
		}
		return result;
	}
	
	public static boolean isPalindroma(String input) {
		for(int i=0; i<input.length()/2; i++) {
			if(!(input.charAt(i) == input.charAt(input.length()-1-i))) return false;
		}
		return true;
	}
	
	public static boolean sonoUgualiLunghezzeIesime(String[] first, String[] second){
		if(first.length!= second.length) return false;
		for (int i = 0; i < second.length; i++) {
			if(first[i].length()!=second[i].length()) return false;
			
		}
		return true;
	}

}
