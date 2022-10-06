public class TestPersona{

    public static void main(String[] args){
        
        //Test Persona 1 - Creazione tramite costruttore di default
        Persona p1 = new Persona(); 
        p1.setNome("Rossenberg");
        p1.setCognome("Ramboanga");
        p1.setEta(25);
        
        System.out.println("Creata la prima persona: "+ p1.getNome() + " " + p1.getCognome()+ ", "+ p1.getEta());

        //Test Persona 2 - Creazione tramite costruttore 
        Persona p2 = new Persona("Rene","Neumann",21);

        System.out.println("Creata la seconda persona: "+ p2.getNome() + " " + p2.getCognome()+ ", "+ p2.getEta());

        System.out.println("La persona più anziana è: " + p1.piuAnziano(p2));

        System.out.println("E' "+p1.getNome() +" più vecchio di " +p2.getNome() +"?: "+p1.isOlderThan(p2));
    }
    
}