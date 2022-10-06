package loopsPractice;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        int digit;
        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            if (digit != 0){
                System.out.print(digit);
            }
        }
    }
}
