package it.prova.listapersone.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {

	private String nome;
	private String cognome;
	private int eta;

	public Persona(String nome, String cognome, int eta) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean presenteInElenco(List<Persona> elenco) {

		for (Persona persona : elenco) {
			if (this.equals(persona))
				return true;
		}
		return false;

	}

	public static int quantePersoneConInizialeNelCognome(List<Persona> elenco, char iniziale) {
		int count = 0;
		for (Persona persona : elenco) {
			if (persona == null)
				break;
			if (persona.getCognome().charAt(0) == iniziale)
				count++;
		}
		return count;
	}

	public static List<String> estraiSoloCognome(List<Persona> elenco) {
		List<String> cognomiList = new ArrayList<String>();
		for (Persona persona : elenco) {
			cognomiList.add(persona.getCognome());
		}
		return cognomiList;

	}

	public static List<Persona> estraiSoloMaggiorenni(List<Persona> elenco) {
		List<Persona> maggiorenniList = new ArrayList<Persona>();
		for (Persona persona : elenco) {
			if (persona.getEta() >= 18)
				maggiorenniList.add(persona);
		}
		return maggiorenniList;

	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, eta, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cognome, other.cognome) && eta == other.eta && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	

}
