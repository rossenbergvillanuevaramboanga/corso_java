public class Automobile{

    private String marca, modello;
    private int velocitaCorrente, annoUltimaRevisione;

    //Costruttore
    public Automobile(String marca, String modello, int velocitaCorrente, int annoUltimaRevisione){
        this.marca = marca;
        this.modello = modello;
        this.velocitaCorrente = velocitaCorrente;
        this.annoUltimaRevisione = annoUltimaRevisione;
    }

    //get() e set() methods
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModello(){
        return modello;
    }

    public void setModello(String modello){
        this.modello = modello;
    }
    public int getVelocitaCorrente(){
        return velocitaCorrente;
    }

    public void setVelocitaCorrente(int velocitaCorrente){
        this.velocitaCorrente = velocitaCorrente;
    }
    public int getAnnoUltimaRevisione(){
        return annoUltimaRevisione;
    }

    public void setAnnoUltimaRevisione(int annoUltimaRevisione){
        this.annoUltimaRevisione = annoUltimaRevisione;
    }

    // Metodi ausiliari di Stampa
    public void stampaAutomobile(){
        System.out.println(this.marca + ", "+this.modello+ ", "+this.velocitaCorrente+ " K/h , "+this.annoUltimaRevisione);
    }

    // Incrementa la velocita corrente del valore di ingresso
    public void accellera(int incremento){
        this.velocitaCorrente += incremento;
    }

    //Confronta se sono passati piú di due anni da annoUltimaRevisione a annoPerConfronto
    public boolean checkSePiuDiDueAnni(int annoPerConfronto){
        return annoPerConfronto - annoUltimaRevisione > 2;
    }


}