public class StampaCaratteriAlContrario{

    public static void main(String[] args){
        String myName = new String("Rossenberg");
        for(int i=myName.length()-1; i>0; i--){
            System.out.println(myName.charAt(i));
        }

    }
}