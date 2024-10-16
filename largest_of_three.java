import java.util.Scanner;

public class largest_of_three {
    static Scanner sc = new Scanner(System.in);

    public static int largest(int a,int b,int c){
        if(a>=b && b>=c){
            return a;
        }
        else if (b>=c && b>=a) {
            return b;
        }
        return c;
    }
    public static int smallest(int a,int b,int c){
        if(a<=b && b<=c){
            return a;
        }
        else if (b<=c && b<=a) {
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Enter the three number:");
        int x=0,y=0,z=0;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();  
        } catch (Exception e) {
            System.out.println("please enter only integers!!!");
        }
        System.out.printf("The largest of %d %d %d is %d",x,y,z,largest(x, y, z));
        System.out.printf("\nThe smallest of %d %d %d is %d",x,y,z,smallest(x, y, z));
    }
}
