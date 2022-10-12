package it.prova.gestionehotel.model;

import java.util.Arrays;
import java.util.Objects;

public class Stanza {
	
	private int numeroStanza; 
	private int quantoAPersona; 
	private Hotel hotel;
	private Cliente[] clienti;

	public Stanza(int numeroStanza, int quantoAPersona, Hotel hotel, Cliente[] clienti) {
		super();
		this.numeroStanza = numeroStanza;
		this.quantoAPersona = quantoAPersona;
		this.hotel = hotel;
		this.clienti = clienti;
	}

	public int getNumeroStanza() {
		return numeroStanza;
	}

	public void setNumeroStanza(int numeroStanza) {
		this.numeroStanza = numeroStanza;
	}

	public int getQuantoAPersona() {
		return quantoAPersona;
	}

	public void setQuantoAPersona(int quantoAPersona) {
		this.quantoAPersona = quantoAPersona;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Cliente[] getClienti() {
		return clienti;
	}

	public void setClienti(Cliente[] clienti) {
		this.clienti = clienti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(clienti);
		result = prime * result + Objects.hash(hotel, numeroStanza, quantoAPersona);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stanza other = (Stanza) obj;
		return Arrays.equals(clienti, other.clienti) && Objects.equals(hotel, other.hotel)
				&& numeroStanza == other.numeroStanza && quantoAPersona == other.quantoAPersona;
	}
	
	
	
	
	
	
	
	


	
	
	
	

}
