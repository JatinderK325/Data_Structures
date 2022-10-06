package loopsPractice;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Enter a choice");
        int choice = sc.nextInt();

        if(choice == 1){
            // print the sum
            int i = 1;
            int sum = 0;
            while(i <= number){
                sum = sum + i;
                i++;
            }
            System.out.println(sum);
        }
        else if (choice == 2){
            int i = 1;
            int product = 1;
            while(i <= number){
                product = product * i;
                i++;
            }
            System.out.println(product);
        }
        else{
            System.out.println("-1");
        }
    }
}
