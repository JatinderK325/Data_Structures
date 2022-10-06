package loopsPractice;

import java.util.Scanner;

/*
 * Write a program to print first x terms of the series 3N + 2 which are not multiples of 4. 
 */
public class TermsOfAP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n=1,sum,i=1;
		while(n<=x && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		}

    }
}
