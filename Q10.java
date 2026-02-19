//10. Recursive function for Fibonacci
public class Q10 {
    public static int fibonacci(int n) {
        if(n == 0 || n == 1 ){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int num = 6;
        System.out.println(fibonacci(num));
    }
}
