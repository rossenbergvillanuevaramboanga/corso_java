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

    //Verifica se l'automobile è presente nel catalogo
    public boolean modelloPresenteInCatalogo(Automobile[] catalogo){
        for(Automobile automobile : catalogo){
            if(this.modello.equals(automobile.modello)&&(this.marca.equals(automobile.marca))) return true;
        }
        return false;
    }

    //Verifica se tutte le auto nel catalogo sono ferme
    public static boolean sonoTutteFerme(Automobile[] catalogo){
        for(Automobile automobile: catalogo){
            if(automobile.velocitaCorrente != 0) return false;
        }
        return true;
    }

    //Stampa Catalogo
    public static void stampaCatalogo(Automobile[] catalogo){
        for(Automobile automobile : catalogo){
            automobile.stampaAutomobile();
        }
    }

    //Dato un catalogo e un modello restituisce il numero delle occorrenze
    public int numeroOccorrenze(Automobile[] catalogo){
        int count = 0;
        for(Automobile automobile : catalogo){
            if(this.modello.equals(automobile.modello)&&(this.marca.equals(automobile.marca))) count += 1;
        }
        return count;
    }

    //Dato un catalogo restituisce l'auto con la revisione più recente
    public static Automobile revisionePiuRecente(Automobile[] catalogo){
        Automobile mostRecent = catalogo[1];
        for(int i=1;i < catalogo.length; i++){
            if(mostRecent.annoUltimaRevisione < catalogo[i].annoUltimaRevisione) mostRecent = catalogo[i];
        }
        return mostRecent;
    }



}