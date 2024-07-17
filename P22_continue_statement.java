// keep entering numbers and print them but don't print the multiples of 10.
import java.util.*;
public class P22_continue_statement {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        for (int i = 1 ; ; i++){
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                continue;
            }
            System.out.println("Your number was : "+ n);
        }
    }
}
