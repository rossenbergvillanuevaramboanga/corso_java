public class CartaIdentita extends Documento {

    private String comune;

    public CartaIdentita(){};
    
    public CartaIdentita(String comune){
        this.comune = comune;
    }
    //Metodi get() e set()
    public String getComune(){
        return this.comune;
    }

    public void setComune(String comune){
        this.comune = comune; 
    }

    public String stampaDocumento(){
        return super.stampaDocumento() + " " + this.comune;
    }


    
}
