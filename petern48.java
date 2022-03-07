import java.util.*;

public class petern48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;

        for (i = 0; i <= 3; i++) {
            for (k = i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (j = 3; j >= i; j--) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (i = 1; i <= 3; i++) {
            for (k = 0; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

}
