import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int n = sc.nextInt();
        factorial(n);
        System.out.println("The factorial of "+n+" is "+factorial(n));

    }
    public static int factorial(int n){
        if (n<2){
            return 1;
        }
        int i = 2;
        int fact = 1;
        while(i<=n){
            fact *=i;
            i++;
        }
        return fact;
    }
}
