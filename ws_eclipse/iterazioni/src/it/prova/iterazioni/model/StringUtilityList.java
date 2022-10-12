package it.prova.iterazioni.model;

import java.util.List;

public class StringUtilityList {
	
	public static boolean sonoUgualiLunghezzeIesime(List<String> first, List<String> second) {
		if(first.size()!=second.size()) return false;
		for(int i = 0; i < first.size(); i++) {
			if(first.get(i).length() != second.get(i).length()) return false;
		}
		return true;
	}
	
}
