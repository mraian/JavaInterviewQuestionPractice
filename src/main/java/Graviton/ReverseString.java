package Graviton;

public class ReverseString {
    public static void main(String [] args){
        System.out.println(reverseString("Hola Papi"));


    }

    public static String reverseString(String input){
        String output="";

        for(int i=input.length()-1; i>=0; i--){
            output = output+input.charAt(i);
        }
        //System.out.println(output);
        return output;
    }
}
