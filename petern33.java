import java.util.*;

public class petern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, k, j;

        for (i = 0; i <= 3; i++) {
            for (k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (j = 3; j >= i; j--) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}
