public class Operaio extends Lavoratore {

    private int salario; 

    public Operaio(){}

    public Operaio(int salario){
        this.salario = salario; 
    }

    public Operaio(String nome, String cognome,int salario){
        super(nome,cognome);
        this.salario = salario; 
    }

    //Metodi get() e set()
    public int getSalario(){
        return this.salario; 
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public String percepisco(){
        return "Percepisco: "+ salario;
    }

}
