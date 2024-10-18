import java.util.Scanner;
/* 
the main objective is to print a pyramid like this
1
1 2
1 2 3
.........
1 2 3
1 2
1
*/

public class Pyramid {
    static Scanner sc = new Scanner(System.in);

    public static void pyramid_construction(int x) {
        for (int i = 1; i <= x; i++) {          // code for larger base pyramid
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        System.out.println("==================");
        for (int i = x; i >= 1; i--) {          // code for smaller base pyramid
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the n value:");
        int x = sc.nextInt();
        pyramid_construction(x);
    }
}