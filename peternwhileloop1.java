import java.util.*;

public class peternwhileloop1 {

    public static void main(String args[]) {
        int i = 0, j = 0, k = 0;

        while (i <= 3) {

            k = 1;
            while (k <= i) {
                System.out.print(" ");
                k++;
            }

            j = 3;
            while (j >= i) {
                System.out.print(" *");
                j--;
            }

            System.out.print("\n");
            i++;

        }
    }

}
