// keep entering numbers until user enters multiple of 10.
import java.util.*;
public class P21_break_statement {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        for(int i = 1; ; i ++){
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            if (n % 10 == 0){
                break;
            }
        }
        System.out.println("I am out of the LOOP");
    }
    
}
