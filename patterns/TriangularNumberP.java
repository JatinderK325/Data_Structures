package patterns;

import java.util.Scanner;

/*
 *  1
	22
	333
	4444
    1. number of rows = n = (4 lets take).
    2. number of columns in ith row = i
    3. print = i
 */
public class TriangularNumberP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
