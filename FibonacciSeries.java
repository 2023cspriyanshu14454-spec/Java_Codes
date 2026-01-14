import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which series is printed : ");
        int n = sc.nextInt();
        fibonacci(n);
    }
    public static void fibonacci(int n){
        if(n<0){
            System.out.print("0 ");
        }
        if(n==0) return;
        System.out.print("1 ");
        int first = 0 , second = 1;
        while(first+second<=n){
            int third = first+second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }
    }
}
