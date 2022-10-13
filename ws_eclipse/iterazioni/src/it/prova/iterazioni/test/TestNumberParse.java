package it.prova.iterazioni.test;

import javax.swing.JOptionPane;
import it.prova.iterazioni.model.NumberUtility;


public class TestNumberParse {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Dammi un numero") ;
		Integer result = NumberUtility.parseFromStringToInt(input);
		
		while (input != null && result == null){
			input = JOptionPane.showInputDialog("Dammi un numero");
			result = NumberUtility.parseFromStringToInt(input);
		};
		
		if(result != null) JOptionPane.showMessageDialog(null, result);
	}

}
