import java.util.Scanner;


public class array_sum {
    static Scanner scn = new Scanner(System.in);
    public static int ans(int n){
        int sum =0;
        int[] arr = new int[n];
        System.out.printf("Enter the %d element:\n",n);
        for (int i = 0; i < n; i++) {
            System.out.print(i+1+": ");
            arr[i] = array_sum.scn.nextInt();
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        int n = array_sum.scn.nextInt();
        int[] arr = new int[n];
        System.out.println("the sum: "+ans(n));
    }
}
