package loop;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = 2;

        while (d <= n - 1) {
            if (n % d == 0) {
                System.out.println("Not Prime");
                return;
            }
            d = d + 1;
        }
        System.out.println("Prime");

    }
}
