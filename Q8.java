//8. Function to swap two numbers (call by reference)

public class Q8 {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10};
        swap(arr);
        System.out.println(arr[0] + " " + arr[1]);  
    }
}
