package Graviton;

public class ReverseString {
    public static void main(String [] args){
        reverseString("Hola Papi");

    }

    public static void reverseString(String input){
        String output="";

        for(int i=input.length()-1; i>=0; i--){
            output = output+input.charAt(i);
        }
        System.out.println(output);
    }
}
