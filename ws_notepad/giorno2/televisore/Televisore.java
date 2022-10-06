public class Televisore{

    private String marca, modello; 
    private int prezzo, pollici; 

    //Constructor
    public Televisore(String marca,String modello, int prezzo, int pollici){
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.pollici = pollici;
    }

    //get() and set() methods
    public String getMarca(){
        return marca;
    }

    public String getModello(){
        return modello;
    }

    public int getPrezzo(){
        return prezzo;
    }

    public int getPollici(){
        return pollici;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModello(String modello){
        this.modello = modello;
    }

    public void setPrezzo(int prezzo){
        this.prezzo = prezzo;
    }

    public void setPollici(int pollici){
        this.pollici = pollici;
    }

    //Metodo ausiliario di Stampa

    public String stampaTelevisore(){
        return this.marca + ", " + this.modello +", " + this.prezzo + " Euro, " + this.pollici + " pollici.";

    }

    //Metodo costaMeno
    public boolean costaMeno(Televisore t){
        return this.prezzo < t.prezzo;
    }

    //Metodo stessaMarca
    public boolean stessaMarca(Televisore t){
        return this.marca.equals(t.marca);
    }

    //Metodo piuGrandeDi
    public boolean piuGrandeDi(Televisore t){
        return this.pollici>t.pollici; 
    }

    //Metodo miglioreQualitaPrezzoDi
    public boolean miglioreQualitaPrezzoDi(Televisore t){

        double inchPriceRatio1 = (double)this.prezzo / this.pollici; 
        double inchPriceRatio2 = (double)t.prezzo / t.pollici;
        
        //System.out.println(inchPriceRatio1);
        //System.out.println(inchPriceRatio2);

        return inchPriceRatio1 < inchPriceRatio2;

    }

    //Metodo existCheaperTelevision

    public boolean existCheaperTelevision(Televisore[] catalogo){

        for (Televisore televisore : catalogo) {
            if(televisore.prezzo < this.prezzo) {
                 return true;
            }
        }
        return false; 
    }

    public int manyLarger(Televisore[] catalogo){
        int result = 0;
        for(Televisore televisore: catalogo){
            if(this.pollici < televisore.pollici){
                result +=1;
            }
        }
        return result;
    }

    public int manyExprensiveSameBrand(Televisore[] catalogo){
        int result = 0;
        for(Televisore televisore: catalogo){
            if(this.stessaMarca(televisore) && !this.costaMeno(televisore)){
                result +=1;
            }
        }
        return result;

    }

    public int sumCatalog(Televisore[] catalogo){
        int sum = 0; 
        for(Televisore televisore: catalogo) sum += televisore.prezzo; 
        return sum;
    }

    public boolean isPriceHigherThanAverage(Televisore[] catalogo){
        float avrg = (float) sumCatalog(catalogo)/catalogo.length; 
        return this.prezzo > avrg; 
    }

    public static Televisore mostExpensiveTv(Televisore[] catalogo){
        Televisore expensive = catalogo[0];
        for(int i=1; i < catalogo.length; i++){
            if(expensive.prezzo < catalogo[i].prezzo) expensive = catalogo[i];
        }
        return expensive; 
    }

    

}