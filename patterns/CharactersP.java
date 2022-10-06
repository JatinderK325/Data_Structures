package patterns;

import java.util.Scanner;

/*
 ABCD
 ABCD
 ABCD
 ABCD
    1. number of rows = n = (4 lets take).
    2. number of columns in ith row = n
    3. print = "A" + j - 1
 */
public class CharactersP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print((char)('A'+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
