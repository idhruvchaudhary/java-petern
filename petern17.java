import java.util.*;

public class petern17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        for (i = 0; i <= 3; i++) {
            for (j = i; j <= 3; j++) {
                System.out.print(" " + (i + 1) * (j + 1));
            }
            System.out.print("\n");
        }

    }

}
