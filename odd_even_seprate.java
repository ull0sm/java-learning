import java.util.Scanner;

public class odd_even_seprate {
    static Scanner sc = new Scanner(System.in);

    public static int[][] separate(int[] x) {
        int[][] sepa = new int[2][x.length];
        int odd = 0, even = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                sepa[0][even] = x[i];
                even++;
            } else {
                sepa[1][odd] = x[i];
                odd++;
            }
        }
        return sepa;
    }

    public static void main(String[] args) {
        int size;
        System.out.print("Enter the size of the array:");
        size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int[][] ans = separate(a);
        System.out.print("odd: ");
        for (int i = 0; i < a.length; i++) {
            if (ans[0][i] != 0) {
                System.out.print(ans[0][i] + " ");
            }
        }
        System.out.println();
        System.out.print("even: ");
        for (int i = 0; i < a.length; i++) {
            if (ans[1][i] != 0) {
                System.out.print(ans[1][i] + " ");
            }
        }

    }
}