//import java.util.*;

public class petern30 {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int i, j, k;

        for (i = 3; i >= 0; i--) {
            for (k = 0; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}
