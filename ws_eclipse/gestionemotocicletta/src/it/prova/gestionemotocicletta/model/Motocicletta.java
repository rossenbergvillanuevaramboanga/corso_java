package it.prova.gestionemotocicletta.model;

public class Motocicletta {
	
	private Long id; 
	private String marca; 
	private String modello;
	private Integer cilindrata; 
	
	public Motocicletta() {
		// TODO Auto-generated constructor stub
	}

	public Motocicletta(String marca, String modello, Integer cilindrata) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Motocicletta [id=" + id + ", marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ "]";
	}
	
	
	
	
	

}
