package Graviton;

public class CheckPrime {
    public static void main(String [] args){

        checkPrime(13);
    }
    public static void checkPrime(int number){

        int check =0;

        for(int i=2; i<=(number/2); i++){
            if (number%i ==0){
                System.out.println(number+ " Not a prime number");
                check =1;
                break;
            }

        }
        if(check ==0)
            System.out.println(number+" is a prime number");

    }
}
