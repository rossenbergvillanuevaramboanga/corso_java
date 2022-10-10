public class TestPassaporto{

    public static void main(String[] args){
        Passaporto passaporto1 = new Passaporto("AX1234EF", "Roma", 2002);
        Passaporto passaporto2= new Passaporto("EX2345FS", "Napoli", 2016);
        Passaporto passaporto3= new Passaporto("CG34343PO", "Terni", 2008);
        Passaporto passaporto4= new Passaporto("JK23324PJ", "Roma", 2018);

        Persona persona1 = new Persona("Rossenberg", "Ramboanga", 25, passaporto1);
        Persona persona2 = new Persona("Rene", "Neumann", 21, passaporto2);
        Persona persona3 = new Persona("Nemo", "Gonzaga", 24, passaporto3);
        Persona persona4 = new Persona("Joel", "Gonzaga", 21, passaporto4);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
        System.out.println(persona4.toString());


    }
}