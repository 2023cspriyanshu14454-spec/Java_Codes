import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd = gcd(num1,num2);
        System.out.println("GCD of two given number is "+gcd);


    }
    public static int gcd(int a, int b) {
        int gcd = 1;
        int i = 2;
        int least = least(a, b);
        while (i <= least) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;

            }i++;
        }

        return gcd;
    }
    public static int least(int a, int b) {
        if(a<b){
            return a;
        }else {
            return b;
        }
    }
}
