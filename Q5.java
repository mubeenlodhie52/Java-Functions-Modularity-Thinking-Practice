//5. Function to check palindrome
public class Q5 {
    public static boolean isPalindrome(int num){
        int originalNum = num;
        int revNum = 0;
        while (num != 0) {
            int last_digit = num % 10;
            revNum = (revNum * 10) + last_digit;
            num/=10;
        }

        if (revNum == originalNum) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}
