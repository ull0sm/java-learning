import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter two digits:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
    }
}