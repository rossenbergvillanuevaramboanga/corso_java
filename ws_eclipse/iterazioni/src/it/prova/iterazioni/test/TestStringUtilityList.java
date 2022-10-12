package it.prova.iterazioni.test;

import java.util.Arrays;
import java.util.List;

import it.prova.iterazioni.model.StringUtilityList;

public class TestStringUtilityList {

	public static void main(String[] args) {

		// Test: sonoUgualiLunghezzeIesime
		System.out.println("------TEST: sonoUgualiLunghezzeIesime");
		List<String> firstList = Arrays.asList("casa", "cane", "tre");
		List<String> secondList = Arrays.asList("ciao", "cosa", "due");
		List<String> thirdList = Arrays.asList("a", "b", "c");

		System.out.println(StringUtilityList.sonoUgualiLunghezzeIesime(firstList, secondList)); // true
		System.out.println(StringUtilityList.sonoUgualiLunghezzeIesime(firstList, thirdList)); // false
	}

}
