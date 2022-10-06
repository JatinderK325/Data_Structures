package loop;
import java.util.Scanner;

public class TempConversion {
    // (32°F − 32) × 5/9 = 0°C
    public static void main(String[] args) {
        System.out.println("Enter a Start Fahrenheit Value");
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        System.out.println("Enter a End Fahrenheit Value");
        int E = s.nextInt();
        System.out.println("Enter a Step Size");
        int W = s.nextInt();

        while(S <= E){
            int SInCelcius = ((5*(S-32))/9);
            System.out.println(S +"\t"+ SInCelcius);
            S = S + W;
        }
    }
}

// Sample Input 1:
// 0 - S
// 100 - E
// 20 - W


// ##### Sample Output 1:
// 0	-17
// 20	-6
// 40	4
// 60	15
// 80	26
// 100	37