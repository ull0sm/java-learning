import java.util.Scanner;

public class divisible_by_seven {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the range:");
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        for (int i = x; i < y + 1; i++) {
            if (i % 7 == 0) {
                System.exit(0);
            }
            System.out.printf("%d ", i);
        }
    }
}