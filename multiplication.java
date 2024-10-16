import java.util.Scanner;

public class multiplication {
    static Scanner sc = new Scanner(System.in);
    public static void table(int x,int y){
        System.out.println("============================");
        for (int i = 1; i <= y; i++) {
            System.out.printf("%d x%2d = %3d\n",x,i,x*i);
        }
    }
    public static void main(String[] args) {
        int x,y;
        try {
            System.out.println("enter the table you want:");
            x = sc.nextInt();
            System.out.println("upto where do you want it");
            y = sc.nextInt();
            table(x,y);
        } catch (Exception e) {
            System.out.println("enter only whole numbers!!!");
        }
    }
    
}