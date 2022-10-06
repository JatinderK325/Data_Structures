package patterns;
import java.util.Scanner;

/*
 *  4444
    4444
    4444
    4444
 */
public class SquarePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1; // i means number of rows
        while(i <= n){
            int j = 1; // j means number of columns
            while(j <= n){ 
                // printing the ith row 
                  System.out.print(n);
                  j = j + 1;
            }
            // for going to the next line
            System.out.println();
            i++;
        }
    }
}
