import java.util.*;
public class P11_pass_or_fail {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your MARKS : ");
        int marks = sc.nextInt();

        /*if ((marks >= 33) && (marks <= 100)){
            System.out.println("Student is PASS");
        }else if (marks < 33){
            System.out.println("Student is FAIL");
        }else{
            System.out.println("INVALID ENTRY");
        }
        */

        // now using ternary oprator

        String m = ((marks >= 33) ? "PASS" : "FAIL");
        System.out.println(m);


    }
}
