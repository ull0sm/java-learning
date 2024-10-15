import java.util.Scanner;

public class odd_or_even {
    static Scanner sc = new Scanner(System.in);
    public static boolean o_e(int x){
        if (x%2!=0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("TITLE: Checking odd or even\n");
        System.out.println("Enter the number that needs to be checked:");

        int num = sc.nextInt();
        System.out.println("The result is :"+o_e(num));
    }
    
}