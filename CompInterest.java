import java.util.Scanner;

public class CompInterest
{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int P = input.nextInt();
        System.out.print("Enter Rate: ");
        float R = input.nextFloat();
        System.out.print("Enter Time: ");
        float T = input.nextFloat();

        double ci = P* Math.pow((1+R/100),T);

        System.out.println("Compound Interest :"+ci);

    }
}
