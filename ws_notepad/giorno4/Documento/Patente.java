public class Patente extends Documento{

    private String tipo;

    public Patente(){};
    
    public Patente(String tipo){
        this.tipo = tipo;
    }
    //Metodi get() e set()
    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo; 
    }
    
}
