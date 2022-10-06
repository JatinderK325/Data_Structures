package patterns;

import java.util.Scanner;

/*
     A
     BC
     CDE
     DEFG
    1. number of rows = n = (4 lets take).
    2. number of columns in ith row = i
    3. print = 'A'+i-1
 */
public class CharactersP4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        int i = 1;
        while (i <= n) {
            char startingChar = (char) ('A' + i - 1);
            int j = 1;
            while (j <= i) {
                System.out.print(startingChar);
                startingChar = (char) (startingChar + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
