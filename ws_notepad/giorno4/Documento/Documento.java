public class Documento{

    private String numero;
    private String dataRilascio;
    private String dataScadenza; 

    public Documento(){};

    public Documento(String numero, String dataRilascio, String dataScadenza){
        this.numero = numero;
        this.dataRilascio = dataRilascio;
        this.dataScadenza = dataScadenza;

    }

    //Metodi get() e set()

    public String getNumero(){
        return this.numero;
    }

    public String getDataRilascio(){
        return this.dataRilascio;
    }

    public String getDataScadenza(){
        return this.dataScadenza;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setDataRilascio(String dataRilascio){
        this.dataRilascio = dataRilascio;
    }

    public void setDataScadenza(String dataScadenza){
        this.dataScadenza = dataScadenza;
    }

    //Metodo di Stampa
    public String stampaDocumento(){
        return this.numero + " " + this.dataRilascio + " " + this.dataScadenza;

    }

    //Metodo Statico
    public static int quantiDocumenti(Documento[] cartella){
        int count = cartella.length; 
        for(Documento doc: cartella){
            if(doc instanceof CartaIdentita || doc instanceof Patente) count--;
        }

        return count;
    }

    


    
}