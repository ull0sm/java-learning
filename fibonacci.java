import java.util.Scanner;

public class fibonacci {
    static Scanner sc = new Scanner(System.in);
    public static void fibo(int x){
        System.err.print("0\t1");
        int curr =1,pre=0;
        int sum = 0;
        
        for (int i = 1; i < x-1; i++) {
            sum = curr + pre;
            System.out.print("\t"+sum);
            pre = curr;
            curr = sum;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n:");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("the series are:");
            fibo(a);    
        } else {
            System.out.println("wrong entry");
        }
    }
    
}