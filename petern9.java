import java.util.*;

public class petern9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" " + (i + 1) * (j + 1));
            }
            System.out.print("\n");
        }
    }

}