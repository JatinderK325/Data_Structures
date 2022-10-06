package patterns;

import java.util.Scanner;
/*
    ---*            *
    --**           **
    -***    =     *** 
    ****         ****
    1. number of rows = n = (4 lets take).
    2. number of columns in ith row = n becoz (spaces + stars)
    3. print = spaces(n-i) then stars(i)
 */
public class ReverseTriangleP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int space = 1;
            while (space <= n-i) {
                // for printing spaces
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while (j <= i) {
                // for printing stars
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
