import java.util.Scanner;

public class simInter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p:");
        int p = sc.nextInt();
        System.out.print("Enter rate:");
        float rate = sc.nextFloat();
        System.out.print("Enter time:");
        float time = sc.nextFloat();

        float interest = (p*rate*time)/100;
        System.out.println("Simple Interest :"+interest);
    }
}
