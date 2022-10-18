package it.prova.provacollezioni.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/Users/rossenbergramboanga/corso_java/ws_eclipse/provacollezioni/src/it/prova/provacollezioni/model/Testo.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;

		while ((st = br.readLine()) != null) {

			// Print the string
			System.out.println(st);
		}
		
		br.close();

	}

}
