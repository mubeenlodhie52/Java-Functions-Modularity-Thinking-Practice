//6. Function to find sum of array elements
public class Q6 {
    public static int sumOfArray(int array[]){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(sumOfArray(arr));
    }
}
