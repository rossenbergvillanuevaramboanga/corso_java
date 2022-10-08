public class Spettatore{

    private String nome;
    private String cognome; 
    private String numCD; 
    private Biglietto biglietto; 

    //Costruttore
    public Spettatore(String nome, String cognome, String numCD){
        this.nome = nome; 
        this.cognome = cognome; 
        this.numCD = numCD; 
    }

    //Costruttore
    public Spettatore(String nome, String cognome, String numCD, Biglietto biglietto){
        this.nome = nome; 
        this.cognome = cognome; 
        this.numCD = numCD;
        this.biglietto = biglietto;
    }

    //Metodi get() e set()
    public String getNome(){
        return this.nome; 
    }

    public String getCognome(){
        return this.cognome; 
    }

    public String getNumCD(){
        return this.numCD; 
    }

    public Biglietto getBiglietto(){
        return this.biglietto; 
    }

    public void setNome(String nome){
        this.nome = nome; 
    }

    public void setCognome(String cognome){
        this.cognome = cognome; 
    }

    public void setNumCD(String numCD){
        this.numCD = numCD; 
    }

    public void setBiglietto(Biglietto biglietto){
        this.biglietto = biglietto; 
    }

    public String toString(){
        return this.nome+ ", " + this.cognome + ", " + this.numCD + ", " + this.biglietto.toString();
    }

    //incassoSpettatoriNellaMiaFila
    public int incassoSpettatoriNellaMiaFila(Spettatore[] elencoPaganti){
        int incasso = 0;
        for(Spettatore spettatore: elencoPaganti){
            if(
                spettatore.getBiglietto().getNomeSpettacolo().equals(this.biglietto.getNomeSpettacolo())
                &&
                spettatore.getBiglietto().getLetteraFila().equals(this.biglietto.getLetteraFila())
                
            ) incasso += spettatore.getBiglietto().getPrezzo();
        }
        return incasso; 
    }

    //numeroSpettatoriDelMioStessoSpettacolo
    public int numeroSpettatoriDelMioStessoSpettacolo(Spettatore[] elencoSpettatori){
        int count = 0; 
        for(Spettatore s: elencoSpettatori){
            if(this.biglietto.getNomeSpettacolo().equals(s.biglietto.getNomeSpettacolo())) count += 1; 
        }
        return count; 
    }

    //spettatoriDelMioStessoSpettacoloSuperaAspettativa
    public boolean spettatoriDelMioStessoSpettacoloSuperaAspettativa(Spettatore[] elencoSpettatori,int aspettativa){
        return this.numeroSpettatoriDelMioStessoSpettacolo(elencoSpettatori) > aspettativa; 
    }
    

    // Compiti per wee1
    public static int contaQuantiSenzaBiglietto(Spettatore[] elencoSpettatori){
        int count = 0;
        for(Spettatore spettatore : elencoSpettatori){
            if(spettatore.biglietto == null) count +=1;
        }
        return count;
    }

    public int contaQuantiNellaMiaStessaFila(Spettatore[] elencoSpettatori){
        int count = 0;
        for(Spettatore spettatore: elencoSpettatori){
            if(spettatore.biglietto.getNomeSpettacolo().equals(this.biglietto.getNomeSpettacolo()) &&
            spettatore.biglietto.getLetteraFila().equals(this.biglietto.getLetteraFila())) count +=1;
        }
        return count;
    }



    
}