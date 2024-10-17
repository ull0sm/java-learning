import java.util.Scanner;

public class palindrome {
    static Scanner sc = new Scanner(System.in);
    public static boolean ispalindrome(String x){
        int ans = 0;
        int n = x.length();
        for (int i = 0; i < n/2; i++) {
            if(x.charAt(i)!=x.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter the string:");
        String str = sc.next();
        System.out.println(ispalindrome(str));
    }
}
