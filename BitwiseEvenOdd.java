import java.util.Scanner;

public class BitwiseEvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int res = num & 1;
        if(res == 0){
            System.out.println(num + " is Even");
        }else
            System.out.println(num + " is not Odd");

    }
}
