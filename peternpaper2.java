import java.util.*;

public class peternpaper2 {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        int i, j, k;
        for (i = 0; i <= 6; i++) {
            for (j = 0; j <= i; j++) {

                if (i % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.print("\n");
        }
    }

}
