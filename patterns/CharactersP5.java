package patterns;

import java.util.Scanner;

/*
    E
    DE
    CDE
    BCDE
    ABCDE
    1. number of rows = n = (5 lets take).
    2. number of columns in ith row = i
    3. print = 'A' + num - 1
 */
public class CharactersP5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        int num = n;
        int i = 1;
        while (i <= n) {
            char startingChar = (char) ('A' + num - 1);
            int j = 1;
            while (j <= i) {
                System.out.print(startingChar);
                startingChar = (char) (startingChar + 1);
                j++;
            }
            System.out.println();
            num--;
            i++;
        }
    }
    
}
