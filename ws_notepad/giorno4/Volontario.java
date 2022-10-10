public class Volontario extends Lavoratore{

    private String nomeAssociazione;

    public Volontario(){}

    public Volontario(String nomeAssociazione){
        this.nomeAssociazione = nomeAssociazione;
    }

    public Volontario(String nome, String cognome, String nomeAssociazione){
        super(nome,cognome);
        this.nomeAssociazione = nomeAssociazione;
    }

    //Metodo get() e set()
    public String getNomeAssociazione(){
        return this.nomeAssociazione;
    }

    public void setNomeAssociazione(String nomeAssociazione){
        this.nomeAssociazione = nomeAssociazione;
    }
    
    public String percepisco(){
        return "No profit";
    }
    
}
