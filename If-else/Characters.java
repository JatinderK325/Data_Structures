import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char a = str.charAt(0);
        int n = a;
        if(n>=65 && n<=90)
        {
            System.out.print("1");
        }
        else if(n>=97 && n<=122)
        {
             System.out.print("0");
        }
        else
        {
             System.out.print("-1");
        }

    }
}
