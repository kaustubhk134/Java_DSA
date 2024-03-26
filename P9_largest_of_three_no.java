import java.util.*;

public class P9_largest_of_three_no {
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
     System.out.println("Enter the A Num : ");
     int a = sc.nextInt();
     System.out.println("Enter the B Num : ");
     int b = sc.nextInt();
     System.out.println("Enter the C Num : ");
     int c = sc.nextInt();

     if ((a >= b) && (a >= c)){
        System.out.println("A is GREATER");
     }else if (b >= c){
        System.out.println("B is GREATER");
     }else{
        System.out.println("C is GREATER");
     }
    
}
}