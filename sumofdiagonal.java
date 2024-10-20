import java.util.Scanner;

public class sumofdiagonal {
    static Scanner sc = new Scanner(System.in);

    public static int sumofmat(int[][] x, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += x[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int size;
        System.out.println("enter the size or the square matrix");
        size = sc.nextInt();
        int[][] mat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum: " + sumofmat(mat,size));
    }
}