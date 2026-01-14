import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println( num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number");
        }
    }
    public static boolean isPrime(int num) {
        int i = 2;
        while(i<=num/2){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
