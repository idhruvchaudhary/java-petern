import java.util.*;

public class petern42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k;

        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (i = 0; i <= 3; i++) {
            for (j = 3; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
