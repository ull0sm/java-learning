// so this problem the question was to find the first prime number in the range that the user provide

import java.util.Scanner;

public class firstprimenumber {
    static Scanner sc = new Scanner(System.in);

    public static int primeno(int x, int y) {
        try {
            if (x < y) {

                if (x <= 3 && x > 0 && x != 1) {
                    return x;
                } else
                    for (int i = x; i <= y; i++) {
                        if (i % 2 != 0 && i % 3 != 0) { // here i was stuck
                            return i;
                        }
                    }
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("error!!!");
            System.exit(0);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the range:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("the first prime number in %d-%d is %d\n", a, b, primeno(a, b));
    }
}