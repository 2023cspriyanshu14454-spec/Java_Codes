import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int sum = digitSum(num);
        System.out.println("Sum is  "+ sum);
    }
    public static int digitSum(int num){
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num /=10;
        }
        return sum;
    }
}
