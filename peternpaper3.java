import java.util.*;

public class peternpaper3 {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);
        int i, j, k;

        for (i = 0; i <= 3; i++) {
            for (k = i; k >= 0; k--) {
                System.out.print("5");
            }
            for (j = 3; j >= i; j--) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}
