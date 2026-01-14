import java.util.Scanner;

public class Pattern1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        int i=0;
        while(i<n){
            System.out.print("*");
            int j = 0;
            while(j<i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
