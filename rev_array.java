import java.util.Scanner;

public class rev_array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrj = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t;
        System.out.println("=========================================");
        for (int i = 0; i < n; i++) {
            t = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1] = t;
            arrj[i]=arr[n-i-1];
            System.out.println(arr[i]);
            // System.out.println(arrj[i]);
        }
    }
}
