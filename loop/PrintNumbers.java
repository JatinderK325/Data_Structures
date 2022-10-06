package loop;
import java.util.*;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
        while(i <= n){
            System.out.println(i);
            i = i+1;
        }
    }
}
