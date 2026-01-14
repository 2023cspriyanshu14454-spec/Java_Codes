import java.util.Scanner;

public class Bitwise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n1 = input.nextInt();
        System.out.print("Enter the second number:");
        int n2 = input.nextInt();

        int resAnd = n1 & n2;
        int resOr = n1 | n2;
        int resXor = n1 ^ n2;
        int resCom = ~n1;
        int resLeftshift = n1 << 2;
        int resRightshift = n2 >> 2;


        System.out.println(resAnd);
        System.out.println(resOr);
        System.out.println(resXor);
        System.out.println(resCom);
        System.out.println(resLeftshift);
        System.out.println(resRightshift);


    }
}
