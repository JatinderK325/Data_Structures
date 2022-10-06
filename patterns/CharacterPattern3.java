package patterns;

import java.util.Scanner;

/*
     A
     BB
     CCC
    1. number of rows = n = (3 lets take).
    2. number of columns in ith row = i
    3. print = i
 */
public class CharacterPattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print((char)('A'+i-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
