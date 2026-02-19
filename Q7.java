//7. Function to swap two numbers (call by value)

public class Q7 {
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping in function: a = "+a+" , b = "+b);
    }
    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println("Before swapping in function: a = "+a+" , b = "+b);

        swap(a, b);
    }
}
