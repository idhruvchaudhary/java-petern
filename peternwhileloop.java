import java.util.*;

public class peternwhileloop {
    public static void main(String args[]) {

        int i = 0, j = 0, k = 0;

        while (i <= 3) {

            while (k <= 3 - i) {
                System.out.print(" ");
                k++;
            }

            while (j <= i) {
                System.out.print(" *");
                j++;
            }

            System.out.print("\n");
            i++;
            j = 0;
            k = 0;
        }

    }

}
