import java.util.*;

public class petern12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        for (i = 3; i >= 0; i--) {
            for (j = 3; j >= i; j--) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }
    }

}