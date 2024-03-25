// this program is for adding two numbers by taking iput from the user.
import java.util.*;
public class P2sum_of_a_and_b {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the FIRST number : ");
        int numA = sc.nextInt();
        System.out.println("Enter the SECOND number :");
        int numB = sc.nextInt();
        System.out.println("the sum of TWO no : "+ (numA + numB));
    }
}