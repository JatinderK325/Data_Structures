package loopsPractice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int d = 2; d <= i; d++) {
                if (i % d == 0)
                    count++;
            }
            if (count == 1)
                System.out.println(i);
        }
    }
}
