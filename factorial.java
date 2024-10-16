import java.util.Scanner;

public class factorial {
    static Scanner sc = new Scanner(System.in);
    public static boolean fact(int x){
        if (x == 1) {
            return false;
        }
        else if (x <=3 ) {
            return true;
        }
        else if (x%2==0 || x%3==0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x =0;
        do {
            x = sc.nextInt();
        } while (x<=0);
        System.out.println(fact(x));        
    }
}
