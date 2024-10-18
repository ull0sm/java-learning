import java.util.Scanner;

public class calculator {
    static Scanner sc = new Scanner(System.in);

    public static float cal(int a, int b, char c) {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.print("enter the operation you want to perform:");
        char c = sc.next().charAt(0);
        System.out.println("enter the two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(cal(n1, n2, c));

    }
}