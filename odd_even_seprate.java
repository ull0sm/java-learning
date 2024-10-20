import java.util.Scanner;

public class odd_even_seprate {
    static Scanner sc = new Scanner(System.in);

    public static int[][] separate(int[] x) {
        int[][] sepa = new int[x.length][x.length];
        for (int i = 0; i < sepa.length; i++) {
            for (int j = 0; j < sepa.length; j++) {
                if (x[j] % 2 == 0) {
                    sepa[1][j] = x[j];
                } else {
                    sepa[2][j] = x[j];
                }
            }
        }
        return sepa;
    }

    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of the array:");
        size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int[][] ans = separate(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[2][i] + " ");
        }

    }
}