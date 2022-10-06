package patterns;

import java.util.Scanner;

/*
    ****
    ****
    ****
    ****
 */
public class BasicPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1; // i means number of rows
        while(i <= n){
            int j = 1; // j means number of columns
            while(j <= n){ 
                // printing the ith row 
                  System.out.print('*');
                  j = j + 1;
            }
            // for going to the next line
            System.out.println();
            i++;
        }
    }
}
