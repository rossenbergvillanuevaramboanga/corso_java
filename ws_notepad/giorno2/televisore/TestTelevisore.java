public class TestTelevisore{

    

    public static void main(String[] args){
        
        //Creazione di oggetti Televisore
        Televisore t1 = new Televisore("Sony", "4K", 1234, 50);
        Televisore t2 = new Televisore("Samsung", "8K", 3030, 70);
        Televisore t3 = new Televisore("LG", "6K", 4560, 80);
        Televisore t4 = new Televisore("Apple", "10K", 7609, 60);
        Televisore t5 = new Televisore("Xiaomi", "7K", 2300, 50);
        Televisore t6 = new Televisore("Xiaomi", "7K", 500, 50);

        Televisore t = new Televisore("Xiaomi", "7K", 1000, 50);

        Televisore[] catalogo = {t1,t2,t3,t4,t5,t6};

        //Stampa
        System.out.println(t1.stampaTelevisore());
        System.out.println(t2.stampaTelevisore());
        System.out.println(t3.stampaTelevisore());
        System.out.println(t4.stampaTelevisore());
        System.out.println(t5.stampaTelevisore());
        System.out.println(t6.stampaTelevisore());
        System.out.println(t.stampaTelevisore());

        //Test Metodi

        //--------costaMeno---------
        System.out.println(t1.getMarca() + " costa meno di " + t2.getMarca() + "?: " + t1.costaMeno(t2));

        //--------stessaMarca---------
        System.out.println(t1.getMarca() + " stessa marca di " + t2.getMarca() + "?: " + t1.stessaMarca(t2));

        //--------piuGrandeDi---------
        System.out.println(t1.getMarca() + " più grande di " + t2.getMarca() + "?: " + t1.piuGrandeDi(t2));

        //--------miglioreQualitaPrezzoDi---------
        System.out.println(t1.getMarca() + " ha una migliore qualità prezzo di " + t2.getMarca() + "?: " + t1.miglioreQualitaPrezzoDi(t2));
        
        //--------existCheaperTelevision---------
        System.out.println("Esiste una televisone nel catalogo che costa meno di: " + t.getMarca()+ "?: "+ t.existCheaperTelevision(catalogo));
        
        //--------manyLarger---------
        System.out.println("Quanti televisori sono più grandi di " + t.getMarca()+ "?: "+ t.manyLarger(catalogo));
        
        //--------manyExprensiveSameBrand---------       
        System.out.println("Quanti televisori sono più costosi della stessa marca " + t.getMarca()+ "?: "+ t.manyExprensiveSameBrand(catalogo));
        
        //--------isPriceHigherThanAverage---------
        System.out.println("E' il prezzo di " + t.getMarca()+ " maggiore della media del catalogo?: "+ t.isPriceHigherThanAverage(catalogo));
        
        //--------mostExpensiveTv---------
        System.out.println("Il più costoso nel catalogo è : " + Televisore.mostExpensiveTv(catalogo).stampaTelevisore());

    }
}