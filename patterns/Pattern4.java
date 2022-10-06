package patterns;
// incomplete
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        int val = 1;
        while (i <= n) {
            int space = 1;
            while(space <= n-i){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j <= i){
                System.out.print(val);
                val = val + 1;
                j = j + 1;
                //System.out.println();

            }
            System.out.println();
            while(space <= n-i){
                System.out.print(" ");
                space++;
            }
            i++;

        }


    }
}

/* 6, 4, 2, 0

 *             1
            2 3
        3 4 5
    4 5 6 7
 */