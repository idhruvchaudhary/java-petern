import java.util.*;

public class petern40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k;

        for (i = 0; i <= 3; i++) {
            for (k = 0; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        for (i = 3; i >= 0; i--) {
            for (k = 0; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

}
