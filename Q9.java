//9. Recursive function for factorial

public class Q9 {
    public static int factorial(int num){
        int factorial = 1;

        if(num == 1){
            return factorial;
        }
        return factorial =  num *  factorial(num - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
