package patterns;

import java.util.Scanner;

/*
 * 1
 * 2 3
 * 3 4 5
 * 4 5 6 7 
 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while(i <= n){
            int j = 1;
            int val = i;
            while (j <= i) {
                System.out.print(val);
                val = val + 1;
                j = j + 1;
            }
            System.out.println();
            i++;
        }

    }
}

