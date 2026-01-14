import java.util.Scanner;

public class tempConver {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp in faren:");
        float faren = input.nextFloat();

        double c = (faren-32)*5/9;
        System.out.println("Temp in Celcius: " + c);


    }
}
