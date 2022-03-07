import java.util.*;

public class petern44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k;

        for (i = 0; i <= 3; i++) {

            for (j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }

            for (k = 0; k <= 2 - i; k++) {
                System.out.print("1");
            }

            System.out.print("\n");
        }
    }

}
