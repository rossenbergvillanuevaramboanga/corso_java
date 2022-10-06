public class Persona{

    private String nome;
    private String cognome;
    private int eta;

    //Constructor
    public Persona(String nome, String cognome, int eta){
        this.nome = nome; 
        this.cognome=cognome; 
        this.eta=eta;
    }
    //Constructor Overloading
    public Persona(){
        this.nome ="";
        this.cognome = "";
        this.eta= 0;
    }

    //Metodi get() e set

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome; 
    }

    public int getEta(){
        return eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    //Metodo piu anziano
    public String piuAnziano(Persona p2){
        if(this.eta > p2.eta) return this.nome;
        else if(this.eta == p2.eta) return "Hanno la stessa età";
        else return p2.nome;
    }

    public boolean isOlderThan(Persona p){
        return this.eta > p.eta;
    }

    
}