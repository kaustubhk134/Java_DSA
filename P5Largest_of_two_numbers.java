import java.util.*;
public class P5Largest_of_two_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the FIRST NUMBER : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the SECOND NUMBER : ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("FIRST NUMBER is GREATER");
        }else{
            System.out.println("SECOND NUMBER is GREATER");
        }
        }
    }