import java.util.*;

public class petern31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j, k;

        for (i = 3; i >= 0; i--) {
            for (k = 3; k >= i; k--) {
                System.out.print(" ");
            }
            for (j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}
