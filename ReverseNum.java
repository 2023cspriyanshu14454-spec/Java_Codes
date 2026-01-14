import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        reverse(num);
        System.out.println("Reversed Number for " + num + " is " + reverse(num));

    }
    public static int reverse(int num) {
        int rev = 0;
        while(num>0){
            int  digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;

        }
        return rev;
    }
}
