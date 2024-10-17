import java.util.Scanner;
public class enhanced_for {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("this is done using enhanced for loop");
        for(int i : array){  
            System.out.println(i);
        }
    }
}