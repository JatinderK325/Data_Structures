package practice;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Basic salary");
        int salary = s.nextInt();
        System.out.println("Enter the Grade");
        String str = s.next();
        char grade = str.charAt(0);

        /*
         * hra = 20% of basic
         * da = 50% of basic
         * allow = 1700 if grade = ‘A’
         * allow = 1500 if grade = ‘B’
         * allow = 1300 if grade = ‘C' or any other character
         * pf = 11% of basic.
         * 
         * double hra = 20 / 100 * salary;
         * double da = 50 / 100 * salary;
         * double pf = 11 / 100 * salary;
         */

        int allowance;

        if (grade == 65) {
            allowance = 1700;
        } else if (grade == 66) {
            allowance = 1500;
        } else {
            allowance = 1300;
        }

        double totalSalary = ((salary + (0.20 * salary) + (0.50 * salary) + allowance) - (0.11 * salary));
        double p = Math.round(totalSalary);
        int ts = (int) (p);
        System.out.println(ts);

    }
}
