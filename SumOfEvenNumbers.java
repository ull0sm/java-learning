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
        System.out.print("enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum: " + even(arr));
    }
}