import java.util.Scanner;

public class transpose {
    static Scanner sc = new Scanner(System.in);

    public static int[][] transpose_matrix(int[][] matrix, int x, int y) {
        int[][] trans = new int[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
        System.out.print("enter the size of the matrix: ");
        int x_size = sc.nextInt();
        int y_size = sc.nextInt();
        int[][] mat = new int[x_size][y_size];
        for (int i = 0; i < x_size; i++) {
            for (int j = 0; j < y_size; j++) {
                System.out.printf("%d %d :", i, j);
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nyour matrix:");
        for (int i = 0; i < x_size; i++) {
            for (int j = 0; j < y_size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int[][] ans = transpose_matrix(mat, x_size, y_size);

        System.out.print("transposed matrix:\n");
        for (int i = 0; i < y_size; i++) {
            for (int j = 0; j < x_size; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}