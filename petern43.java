import java.util.*;

public class petern43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i, j;

        for (i = 0; i <= 3; i++) {
            if (i == 0 || i == 3) {
                for (j = 0; j <= 3; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*  *");
            }

            System.out.print("\n");
        }

    }

}
