package loop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            // sum of even numbers
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }
        System.out.println(sum);
    }
}
