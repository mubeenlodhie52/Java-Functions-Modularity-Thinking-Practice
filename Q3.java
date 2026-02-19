//3. Function to find maximum of two numbers
public class Q3 {

    public static int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max(10, 20));
    }
}
