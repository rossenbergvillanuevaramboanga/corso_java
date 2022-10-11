package it.prova.iterazioni.test;

import java.util.Arrays;

import it.prova.iterazioni.model.StringUtility;

public class TestStringUtility {
	
	public static void main(String[] args) {
		
		//Test: creaStringAlContrariaConIndice
		
		System.out.println("------TEST: creaStringaAlContrarioConIndice");
		String stringaAlContrarioString = "Rossenberg";
		int indiceAlContrarioPari = 4; 
		int indiceAlContrarioDispari = 3; 
		
		System.out.println(StringUtility.creaStringaAlContrario(stringaAlContrarioString, indiceAlContrarioPari));
		System.out.println(StringUtility.creaStringaAlContrario(stringaAlContrarioString, indiceAlContrarioDispari));
		
		//Test: trasformaInArray
		
		System.out.println("------TEST: trasformaInArray");
		String stringaInArray = "Rossenberg";
		
		System.out.println(stringaInArray);
		System.out.println(Arrays.toString(StringUtility.trasformaInArrayDiChar(stringaInArray)));
		
		
		//Test: isPalindroma
		System.out.println("------TEST: creaStringaAlContrarioConIndice");
		String stringNotPalindroma = "Rossenberg";
		String stringPalindroma = "anna";
		
		System.out.println(StringUtility.isPalindroma(stringNotPalindroma)); //false
		System.out.println(StringUtility.isPalindroma(stringPalindroma)); //true
		
		//Test: sonoUgualiLunghezzeIesime
		System.out.println("------TEST: sonoUgualiLunghezzeIesime");
		String[] firstArray = { "casa", "cane", "tre"};
		String[] secondArray = { "ciao", "cosa", "due"};
		String[] thirdArray = { "delfino", "cosa", "due"};
		
		
		System.out.println(StringUtility.sonoUgualiLunghezzeIesime(firstArray,secondArray)); //true
		System.out.println(StringUtility.sonoUgualiLunghezzeIesime(firstArray,thirdArray)); //false		
		
		
		
		
	}

}
