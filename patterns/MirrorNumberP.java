package patterns;

import java.util.Scanner;
// incomplete
/*
 * ------1 
   ----12-
   --123--
   1234---

    1. number of rows = n = (4 lets take).
    2. number of columns in ith row = n becoz (spaces + stars)
    3. print = spaces(n-i) then numbers(startingValue)
 */
public class MirrorNumberP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int space = 1;
            while (space <= 8) { //////////
                System.out.print(" ");
                space++;
            }
            int Start = 1;
            int j = 1;
            while (j <= n) {
                System.out.print(Start);
                Start++;
                j++;
            }
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }
            System.out.println();
            i++;
        }
    }
}
