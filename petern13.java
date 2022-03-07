import java.util.*;

public class petern13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        for (i = 3; i >= 0; i--) {
            for (j = i; j <= 3; j++) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}