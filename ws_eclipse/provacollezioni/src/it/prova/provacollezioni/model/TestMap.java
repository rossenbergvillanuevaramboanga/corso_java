package it.prova.provacollezioni.model;

import java.util.HashMap;


public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMapAnimali = new HashMap<Integer, String>();
		hashMapAnimali.put(1, "Cane");
		hashMapAnimali.put(2, "Gatto");
		hashMapAnimali.put(3, "Topo");
		hashMapAnimali.put(4, "Pesce");
		hashMapAnimali.put(5, "Pappagallo");
		hashMapAnimali.put(6, "Delfino");
		
		System.out.println(hashMapAnimali);
		hashMapAnimali.put(6, "Cane");
		
		hashMapAnimali.remove(4);
		System.out.println(hashMapAnimali);
		

	}

}
