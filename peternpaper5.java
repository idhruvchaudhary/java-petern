import java.util.*;

public class peternpaper5 {
    public static void main(String[] args) {

        int i, j, k;
        int ch = 65;

        for (i = 0; i <= 3; i++) {
            for (k = 0; k <= 3 - i; k++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print((char) (ch + j));
            }
            System.out.print("\n");
        }
    }

}
