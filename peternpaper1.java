import java.util.*;

public class peternpaper1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j, k;

        for (i = 0; i <= 5; i++) {
            for (k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {

                if (i % 2 == 0) {
                    System.out.print(" 0");
                } else {
                    System.out.print(" 1");
                }
            }
            System.out.print("\n");
        }
    }

}
