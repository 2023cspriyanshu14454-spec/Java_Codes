import java.util.Scanner;

public class Pattern2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        ReverseRightHalfPattern(rows);
        LeftHalfPattern(rows);

    }
    public static void LeftHalfPattern(int rows){
        System.out.println("Here is Left  Half Pattern : \n");
        int row =0;
        while(row<rows){
            int j=rows-row-1;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            int k=0;
            while(k<=row){
                System.out.print("*");
                k++;
            }
            System.out.println();
            row++;
        }
    }





    public static void ReverseRightHalfPattern(int rows){
        System.out.println(" Here is Reverse Right Half Pattern  : \n");
        int row = rows;
        while(row>0){
            int col=0;
            while(col<row){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row--;
        }
    }
}
