public class Lavoratore{

    protected String nome; 
    protected String cognome;

    //Costruttore 

    public Lavoratore(){}
    
    public Lavoratore(String nome, String cognome){
        this.nome = nome; 
        this.cognome = cognome; 
    }

    //Metodi get() e set()

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome; 
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    //Metodo percepisco()
    public String percepisco(){
        return "N. D.";
    }
}