import java.util.Scanner;

public class GradeCalc {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in % :");
        double marks = sc.nextDouble();

        if(marks<0 || marks>100){
            System.out.println("Marks must be between 0 and 100");

        }else if(marks>=90){
            System.out.println("A");
        }else if(marks>=75){
            System.out.println("B");
        }else if(marks>=60){
            System.out.println("C");
        }
        else if(marks>=30){
            System.out.println("D");
        }else
            System.out.println("F");
    }
}
