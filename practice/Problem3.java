package practice;
import java.util.Scanner;

/*
 * Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
##### Note : For this question, you can assume that 0 raised to the power of 0 is 1
 */
public class Problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        System.out.println("Enter a power");
        int power = s.nextInt();
        int p = 1;
        int i = 1;
        
        while(i <= power){
            p = number*p;
            i++;
        }
        System.out.println(p);
    }
}
