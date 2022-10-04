public class CercaElementoInArray{

    public static void main(String[] args){

        int value = 5;
        int[] myArray = { 6,8,10,5,11};

        boolean found = false;

        int i = 0;

        while (!found && i!=myArray.length){
            if(myArray[i]== value){
                found = true;
                break;
            }
            i++;
        } 

        System.out.println(found?"SI":"NO");

        
    }
}