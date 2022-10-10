public class TestLavoratore{

    public static void main(String[] args){
        
        Lavoratore lavoratore = new Lavoratore();
        Operaio operaio = new Operaio();
        Volontario volontario = new Volontario();

        System.out.println(lavoratore.percepisco());
        System.out.println(operaio.percepisco());
        System.out.println(volontario.percepisco());
        
    }
}