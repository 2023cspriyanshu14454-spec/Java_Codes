import java.util.Scanner;

public class OddNumSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range to find sum : ");
        int n = sc.nextInt();
        oddSum(n);

    }
    public static void oddSum(int n){
        int sum = 0;
        int i = 1;
        while(i<=n){
            if(i%2!=0){
                sum +=i;
            }
             i++;

        }
        System.out.println("Sum is  "+sum);
    }
}
