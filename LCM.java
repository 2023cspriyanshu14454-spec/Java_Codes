import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        int lcm = LCM(num1,num2);
        System.out.println("The lcm of "+num1+" and "+num2+" is "+lcm);
    }
    public static int LCM(int num1, int num2) {
        int i = 1;
        while(true) {
            int factor = num1*i;
            if(factor % num2==0) {
                return factor;
            }
            i++;
        }
    }

}
