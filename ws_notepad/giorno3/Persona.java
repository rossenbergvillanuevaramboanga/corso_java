import javax.management.relation.InvalidRelationIdException;

public class Persona{

    private String nome;
    private String cognome;
    private int eta;
    private Indirizzo indirizzo;

    //costruttore
    public Persona(String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome; 
        this.eta = eta;
    }

    //overloading constructor
    public Persona(String nome, String cognome, int eta, Indirizzo indirizzo){
        this.nome = nome;
        this.cognome = cognome; 
        this.eta = eta;
        this.indirizzo = indirizzo; 
    }


    //Metodi get() e set()
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public int getEta(){
        return this.eta;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    public Indirizzo getIndirizzo(){
        return this.indirizzo; 
    }

    public void setIndirizzo(Indirizzo indirizzo){
        this.indirizzo= indirizzo;
    }

    //String
    public String stringPersona(){
        return this.nome + " " + 
        this.cognome + " " + 
        this.eta + " " + 
        this.indirizzo.getCitta() + " " + 
        this.indirizzo.getVia() + " " + 
        this.indirizzo.getCivico()
        ;
    }

    //AbitaA
    public boolean abitaA(String citta){
        return this.indirizzo.getCitta().equals(citta);
    }

    //HaAlmenoUnConcittadino
    public boolean haAlmenoUnConcittadino(Persona[] elenco){
        for(Persona persona : elenco){
            if(this.indirizzo.getCitta().equals(persona.getIndirizzo().getCitta())) return true;
        }
        return false;
    }

    //sonoTuttiPiuAnziani
    public boolean sonoTuttiPiuAnziani(Persona[] elenco){
        for(Persona persona: elenco){
            if(this.eta > persona.getEta()) return false;
        }
        return true; 
    }

    //Quandi abitano nel mio palazzo
    public int quantiAbitanoNelMioStessoPalazzo(Persona[] elenco){
        int  count = 0; 
        for (Persona persona: elenco){
            if(this.getIndirizzo().equals(persona.getIndirizzo())) count += 1;
        }
        return count; 
    }

    //Viena a coabitare con te
    public void vieneACoabitareConTe(Persona nuovoInquilino){
        nuovoInquilino.setIndirizzo(this.indirizzo);
    }

    //Restituisci una lista di indirizzi di persona over60

    public static int numberOver60(Persona[] elenco){
        int result=0; 
        for(Persona persona :elenco){
            if(persona.eta > 60) result+=1; 
        }
        return result;
    }

    public boolean isOver60(){
        return this.eta > 60; 
    }

    public static Indirizzo[] getIndirizziOver60(Persona[] elenco){
        Indirizzo listaIndirizzi[] = new Indirizzo[Persona.numberOver60(elenco)];
        for(int i=0; i < listaIndirizzi.length; i++){
            if(elenco[i].isOver60()) listaIndirizzi[i]= elenco[i].getIndirizzo();
        }
        return listaIndirizzi; 
    }

    //Metodi Statici
    public static String stringElenco(Persona[] elenco){
        String result = "";
        for(Persona persona:elenco){
            result += persona.stringPersona()+"\n";
            
        }
        return result; 
    }

    //Metodi Statici
    public static String stringElencoIndirizzi(Indirizzo[] elencoIndirizzo){
        String result = "";
        for(Indirizzo indirizzo : elencoIndirizzo){
            result += indirizzo.stringIndirizzo()+"\n";
        }
        return result; 
    }


    


}