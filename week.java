import java.util.Scanner;

public class week {
    static Scanner sc = new Scanner(System.in);

    public static String day(int x) {
        switch (x) {
            case 1:
                return "Sunday";

            case 2:
                return "Monday";

            case 3:
                return "Tuesday";

            case 4:
                return "Wednesday";

            case 5:
                return "Thursday";

            case 6:
                return "Friday";

            case 7:
                return "Saturday";

            default:
                return "Invalid";

        }
    }

    public static void main(String[] args) {
        System.out.println("enter the day number:");
        int c = sc.nextInt();
        System.out.println(day(c));
    }
}