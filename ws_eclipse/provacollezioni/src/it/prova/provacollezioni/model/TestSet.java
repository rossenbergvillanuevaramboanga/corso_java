package it.prova.provacollezioni.model;

import java.util.HashSet;
import java.util.Set; 

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> listaAnimali = new HashSet<String>();
		listaAnimali.add("Cane");
		listaAnimali.add("Cane");
		listaAnimali.add("Cane");
		listaAnimali.add("Cane");
		
		System.out.println(listaAnimali);
		
		listaAnimali.remove("Cane");
		System.out.println(listaAnimali);
		

	}

}
