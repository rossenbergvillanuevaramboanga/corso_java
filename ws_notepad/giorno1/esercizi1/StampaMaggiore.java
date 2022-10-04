public class StampaMaggiore{

    public static void main(String[] args){

        int[] myArray = {5,3,7,80,15};
        int maggiore = myArray[0];

        for(int i =1; i<myArray.length; i++){
            if(maggiore <= myArray[i]) maggiore = myArray[i];
        }

        System.out.println(maggiore);
        
    }
}