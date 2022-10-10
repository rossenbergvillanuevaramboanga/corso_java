public  class Persona{

   private String nome, cognome;
   private int eta;
   private Passaporto passaporto;

   public Persona(String nome,String cognome, int eta, Passaporto passaporto){
    this.nome = nome; 
    this.cognome = cognome;
    this.eta = eta;
    this.passaporto = passaporto;
   }

   public Persona(String nome,String cognome, int eta){
    this.nome = nome; 
    this.cognome = cognome;
    this.eta = eta;
   }
   // Metodi get() e set()
   public String getNome(){
    return this.nome; 
   }

   public String getCognome(){
    return this.cognome; 
   }

   public int getEta(){
    return this.eta; 
   }

   public Passaporto getPassaporto(){
    return this.passaporto; 
   }

   public void setNome(String nome){
    this.nome=nome; 
   }

   public void setCognome(String cognome){
    this.cognome=cognome; 
   }

   public void setEta(int eta){
    this.eta=eta; 
   }

   public void setPassaporto(Passaporto passaporto){
    this.passaporto=passaporto; 
   }

   public String toString(){
      return this.nome+" "+
      this.cognome+" "+
      this.eta+" "+
      this.passaporto.getCodiceIdentificativo();
   }

}