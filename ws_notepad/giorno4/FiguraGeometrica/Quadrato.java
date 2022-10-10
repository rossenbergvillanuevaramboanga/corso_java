public class Quadrato extends FiguraGeometrica {

    public Quadrato(){};

    public int calcolaPerimetro(){
        return this.base * 4;
    }

    public int calcolaArea(){
        return this.base * this.base;
    }
    
}
