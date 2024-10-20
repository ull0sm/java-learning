import java.util.Scanner;

public class negativenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            try {
                x = sc.nextInt();
                
            } catch (Exception e) {
                System.out.println("error!!!");
                sc.next();
            }
        } while (x >= 0);
    }
}