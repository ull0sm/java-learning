
public class skipthree {

    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {// change sign to !=
                continue; // remove this
                // System.out.printf("%d ",i);

            }
            System.out.printf("%d ", i);
        }
    }
}