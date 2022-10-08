public class Indirizzo{

    private String citta;
    private String via;
    private String civico;

    //Constructor

    public Indirizzo(String citta, String via, String civico){
        this.citta = citta;
        this.via = via;
        this.civico = civico; 
    }

    //Metodi get() e set()
    public String getCitta(){
        return this.citta;
    }
    
    public void setCitta(String citta){
        this.citta = citta;
    }

    public String getVia(){
        return this.via;
    }

    public void setVia(String via){
        this.via = via;
    }

    public String getCivico(){
        return this.civico;
    }

    public void setCivico(String civico){
        this.civico = civico;
    }

    public String stringIndirizzo(){
        return this.citta+ " - " + this.via+ ", "+ this.civico;
    }

    public boolean equals(Indirizzo indirizzo){
        if(
            this.citta == indirizzo.citta &&
            this.via == indirizzo.via &&
            this.civico == indirizzo.civico) return true; 

            return false; 
    }

    






}