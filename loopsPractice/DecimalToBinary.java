package loopsPractice;
// incomplete
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        
        if (num==0)
        {
            System.out.print("0");
            return;
        }
        int binary[] = new int[40];
        int index = 0;

        while(num > 0){
        binary[index] = num%2;
        num = num/2;
        index++;
        }
        for(int i = index-1;i >= 0;i--){
        System.out.print(binary[i]);
        }
  }
}
