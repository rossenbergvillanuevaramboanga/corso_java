public class Passaporto{

    private String codiceIdentificativo;
    private String cittaRilascio; 
    private int annoRilascio; 

    public Passaporto(String codiceIdentificativo, String cittaRilascio, int annoRilascio){
        this.codiceIdentificativo = codiceIdentificativo; 
        this.cittaRilascio = cittaRilascio; 
        this.annoRilascio = annoRilascio; 
    }


    //Metodi get() e set()
    public String getCodiceIdentificativo(){
        return this.codiceIdentificativo;
    }

    public String getCittaRilascio(){
        return this.cittaRilascio;
    }

    public int getAnnoRilascio(){
        return this.annoRilascio;
    }

    public void setCodiceIdentificativo(String codiceIdentificativo){
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public void setCittaRilascio(String cittaRilascio){
        this.cittaRilascio = cittaRilascio;
    }

    public void setCodiceIdentificativo(int annoRilascio){
        this.annoRilascio = annoRilascio;
    }

    public String toString(){
        return this.codiceIdentificativo + ", " +
        this.cittaRilascio + ", " +
        this.annoRilascio;
    }

}