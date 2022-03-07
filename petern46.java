import java.util.*;

public class petern46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j;

        for (i = 0; i <= 3; i++) {

            if (i == 0 || i == 3) {
                for (j = 0; j <= 3; j++) {
                    System.out.print("1");
                }
            } else {

                System.out.print("1");
                System.out.print(((i + 1) * 3));
                System.out.print(((i + 1) * 2));
                System.out.print("1");
            }

            System.out.print("\n");
        }

    }
}
