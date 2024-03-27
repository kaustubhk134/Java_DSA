import java.util.*;
public class P10_ternary_oprator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        String numType = ((num % 2 == 0) ? "EVEN" : "ODD");
        System.out.println(numType);
    }
    
}
