import java.util.*;

public class petern10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j, k = 1;
        for (i = 0; i < 4; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.print("\n");
        }
    }

}