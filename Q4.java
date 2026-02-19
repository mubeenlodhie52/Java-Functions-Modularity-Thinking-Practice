//4. Function to reverse a number
public class Q4 {
    public static int reverseNum(int num){
        int revNum = 0;
        while (num != 0) {
            int last_digit = num % 10;
            revNum = (revNum * 10) + last_digit;
            num/=10;
        }

        return revNum;
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverseNum(num));
    }
}
