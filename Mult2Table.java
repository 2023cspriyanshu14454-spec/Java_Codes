import java.util.Scanner;

public class Mult2Table {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no . to get its multiplication table : ");
        int n = sc.nextInt();
        MultiplicationTable(n);

    }
    public static void MultiplicationTable(int n){
        int i = 1;
        while(i<=10){
            System.out.println(n+" X "+i+" = "+(n*i));
            i++;
        }

    }
}
