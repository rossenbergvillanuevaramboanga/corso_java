public class FiguraGeometrica {

    protected int base, altezza; 

    public FiguraGeometrica(){};

    public FiguraGeometrica(int base, int altezza){
        this.base = base; 
        this.altezza = altezza;
    }

    //Metodo get() e set()
    public int getBase(){
        return this.base;
    }

    public void setBase(int base){
        this.base = base; 
    }

    public int getAltezza(){
        return this.altezza;
    }

    public void setAltezza(int altezza){
        this.altezza = altezza;
    }

    public int calcolaPerimetro(){
        return -1;
    }

    public int calcolaArea(){
        return -1;
    }
    
}
