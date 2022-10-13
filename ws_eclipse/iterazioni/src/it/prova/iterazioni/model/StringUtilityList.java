package it.prova.iterazioni.model;

import java.util.ArrayList;
import java.util.List;

public class StringUtilityList {
	
	public static boolean sonoUgualiLunghezzeIesime(List<String> first, List<String> second) {
		if(first.size()!=second.size()) return false;
		for(int i = 0; i < first.size(); i++) {
			if(first.get(i).length() != second.get(i).length()) return false;
		}
		return true;
	}
	
	public static List<Character> trasformaInListDiCharacters(String frase) {
		List<Character> result = new ArrayList<Character>(frase.length());
		for (int i = 0; i < frase.length(); i++) {
			result.add(frase.charAt(i));
			
		}
		return result;
	}
	
}
