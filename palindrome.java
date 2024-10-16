import java.util.Scanner;

public class palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void ispalindrome(String x){
        int ans = 0;
        int n = x.length();
        for (int i = 0; i < n/2; i++) {
            if(x.charAt(i)==x.charAt(n-i-1)){
                ans = 1;
            }
            else{
                ans = 0;
            }
        }
        if(ans != 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the string:");
        String str = sc.next();
        ispalindrome(str);
    }
}
