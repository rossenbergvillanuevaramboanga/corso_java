public class stampaCaratteriDispari{

    public static String caratteriDispari(String input){
        String result = "";
        for(int i=1; i< input.length(); i+=2){
            result += input.charAt(i);
        }
        return result;
    }

    public static void main(String[] args){
        String myStringTest1 = "Rossenberg";

        //------- TEST: caratteriDispari -------
        System.out.println("------- TEST 1: caratteriDispari -------");
        System.out.println("Input String: " + myStringTest1);
        System.out.println("Output String: " + caratteriDispari(myStringTest1));
    }
}