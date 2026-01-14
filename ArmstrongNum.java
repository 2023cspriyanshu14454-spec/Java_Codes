import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num  = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong Number ");
        }else
            System.out.println("Your number is not Armstrong Number ");
    }
    public static boolean isArmstrong(int n){
        int digit = noDigit(n);
        int numCopy = n;
        int finalNum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            finalNum += pow(rem,digit);
        }
        return finalNum==numCopy;
    }

    public static int pow(int n1, int n2){
        int result = 1;
        int i = 0;
        while(i<n2){
            result *= n1;
            i++;
        }return result;
    }
    public static int noDigit(int num){
        int digit = 0;
        while(num>0){
            digit++;
            num = num/10;
        }
        return digit;
    }
}
