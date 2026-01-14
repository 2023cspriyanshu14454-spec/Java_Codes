import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr number : ");
        int num  = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Given number is Palindrome");
        }else{
            System.out.println("Given number is not Palindrome");
        }

    }
    public static boolean isPalindrome(int num){
        //return num== reverse(num);
        int reversedNum = reverse(num);
        //  return num == reversedNum;
        if(num==reversedNum){
            return true;
        }
        return false;
    }
    public static int reverse(int num){
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }
        return rev;
    }
}
