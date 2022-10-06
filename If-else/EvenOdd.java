import java.util.*;

public class EvenOdd{
    public static void main(String args[]){
        System.out.println("Please enter a number");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%2 == 0){
            System.out.println("Number is even!");
        }
        else{
            System.out.println("Number is odd!");
        }
        
    }
}