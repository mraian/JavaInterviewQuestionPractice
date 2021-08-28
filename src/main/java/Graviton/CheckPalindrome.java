package Graviton;

public class CheckPalindrome {
    public static void main(String [] args){
        checkPalindrome("Dad");

    }

    public static void checkPalindrome(String input){
       // ReverseString str = new ReverseString();

        String reversedString= ReverseString.reverseString(input);

        if(input.equalsIgnoreCase(reversedString)){
            System.out.println("It is a palindrome");

        }
        else {
            System.out.println("it is not a palindrome");
        }
    }
}
