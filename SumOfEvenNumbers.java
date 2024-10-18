import java.util.Scanner;

public class SumOfEvenNumbers {
    static Scanner sc = new Scanner(System.in);

    public static int even(int[] x) {
        int sum = 0;
        for (int i : x) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("enter the number upto where you want sum:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        System.out.println("Sum: " + even(arr));
    }
}