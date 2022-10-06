package patterns;

import java.util.Scanner;

/*
 *  1
    23
    345
    4567
 */
public class TriangularP2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int val = i;
            int j = 1;
            while (j <= i) {
                System.out.print(val);
                val++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
