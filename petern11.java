import java.util.*;

public class petern11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = i; j >= 0; j--) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}