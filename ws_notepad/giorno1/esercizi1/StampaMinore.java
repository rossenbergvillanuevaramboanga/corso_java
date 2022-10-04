public class StampaMinore{

    public static void main(String[] args){

        int[] myArray = {5,3,7,80, 15};
        int minore = myArray[0];

        for(int i =1; i<myArray.length; i++){
            if(minore > myArray[i]) minore = myArray[i];
        }

        System.out.println(minore);
        
    }
}