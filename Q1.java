//1. Function to check prime number
public class Q1 {
    public static Boolean isPrime(int num){

        if (num <= 1) {
            return false;
        }
        int i = 2;
        while (i < num) {
            if(num % i == 0){
                return false;
            }

            i++;
        }

        return true;
    }
    public static void main(String[] args) {
        int num = 4;
        System.out.println(isPrime(num));
    }
}