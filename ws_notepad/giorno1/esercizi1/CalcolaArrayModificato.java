public class CalcolaArrayModificato{

    
    public static void main(String[] args){

        int[] myArray = {5,3,7,80,45};
        int[] newArray = new int[5];

        for(int i=0; i < newArray.length; i++){
            if(myArray[i]-7 <=0) newArray[i] = 0;
            else{ 
                newArray[i] = myArray[i]-7;
            }
        };

        for(int i=0; i< newArray.length; i++){
            System.out.println(newArray[i]);
        }

        
        
    }
}