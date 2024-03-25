import java.util.*;

public class P6odd_or_evem {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter NUMBER : ");
        int num =sc.nextInt();

        if (num%2==0){
            System.out.println("The NUMBER is EVEN");
        }else{
            System.out.println("The NUMBER is ODD");
        }
    }
    
}
