import java.util.*;

public class petern24 {

    public static void main(String[] args) {

        int i, j, k;

        for (i = 3; i >= 0; i--) {
            for (k = 3; k >= 3 - i; k--) {
                System.out.print(" ");
            }

            for (j = 3; j >= i; j--) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }

    }

}
