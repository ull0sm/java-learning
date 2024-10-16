import java.util.Scanner;

public class largest_of_three {
    static Scanner sc = new Scanner(System.in);

    public static int largest(int a,int b,int c){
        if(a>b && b>c){
            return a;
        }
        else if (b>c && b>a) {
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Enter the three number:");
        int x,y,z;
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        System.out.printf("The larges of %d %d %d is %d",x,y,z,largest(x, y, z));
    }
}
