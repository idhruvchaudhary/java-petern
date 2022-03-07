import java.util.*;

public class petern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k;

        for (i = 3; i >= 0; i--) {
            for (k = 3; k >= 3 - i; k--) {
                System.out.print(" ");
            }
            for (j = i; j <= 3; j++) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}
