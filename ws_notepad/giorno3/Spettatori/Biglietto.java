public class Biglietto{

    private String nomeSpettacolo; 
    private String letteraFila; 
    private int numeroPosto; 
    private int prezzo; 

    public Biglietto(String nomeSpettacolo, String letteraFila, int numeroPosto, int prezzo){
        this.nomeSpettacolo = nomeSpettacolo; 
        this.letteraFila = letteraFila; 
        this.numeroPosto = numeroPosto; 
        this.prezzo = prezzo; 
    }

    //Metodi get() e set()
    public String getNomeSpettacolo(){
        return this.nomeSpettacolo; 
    }

    public String getLetteraFila(){
        return this.letteraFila; 
    }

    public int getNumeroPosto(){
        return this.numeroPosto; 
    }

    public int getPrezzo(){
        return this.prezzo; 
    }

    public void setNomeSpettacolo(String nome){
        this.nomeSpettacolo = nome; 
    }

    public void setLetteraFila(String lettera){
        this.letteraFila = lettera; 
    }

    public void setNumeroPosto(int numero){
        this.numeroPosto = numero; 
    }

    public void setPrezzo(int prezzo){
        this.prezzo = prezzo; 
    }

    //Metodo toString()
    public String toString(){
        return this.nomeSpettacolo+ ", " + this.letteraFila + ", " + this.numeroPosto + ", " + this.prezzo;
    }

    //piuEconomico
    public static Biglietto piuEconomico(Biglietto[] elencoBiglietti){
        Biglietto bigliettoEconomico = elencoBiglietti[0];
        for(int i=1; i< elencoBiglietti.length-1; i++){
            if(bigliettoEconomico.getPrezzo() > elencoBiglietti[i].getPrezzo()) bigliettoEconomico = elencoBiglietti[i];
        }
        return bigliettoEconomico; 
    }


    //bigliettoAncoraInvenduto
    //Override di equals
    public boolean equals(Biglietto biglietto){
        return 
        this.nomeSpettacolo == biglietto.nomeSpettacolo &&
        this.letteraFila  == biglietto.letteraFila &&
        this.numeroPosto == biglietto.numeroPosto;
    }

    public boolean bigliettoAncoraInvenduto(Biglietto[] bigliettiInvenduti){
        for(Biglietto biglietto : bigliettiInvenduti){
            if(this.equals(biglietto)) return true;
        }
        return false;
    }

    //Metodi week01
    public boolean eIlPiuCaroDeiPaganti(Spettatore[] elencoSpettatori){
        for(Spettatore spettatore : elencoSpettatori){
            if(spettatore.getBiglietto().getPrezzo() > this.prezzo) return false;
        }
        return true;
    }

    public static boolean sonoTuttiBigliettiPerLoSpettacoloIntitolato(Biglietto[] elencoBiglietti, String titoloSpettacoloe){
        for(Biglietto biglietto : elencoBiglietti){
            if(!(biglietto.getNomeSpettacolo().equals(titoloSpettacoloe))) return false;
        }
        return true;
    }

    




    

    
}