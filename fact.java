import java.util.Scanner;

public class fact {
    static Scanner sc = new Scanner(System.in);
    public static long factorial(int x){
        long ans=1l;
        for (int i = 0; i < x; i++) {
            ans *= (x-i);
            ans = (long) ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int val = 1;
            try {
                if (val%1==0 && val>=0) {
                    System.out.print("enter the number:");
                    val = sc.nextInt();
                    System.out.printf("%d! = %d",val,factorial(val));
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("enter only whole numbers");
            }
    }
}