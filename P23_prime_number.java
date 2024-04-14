import java.util.*;
public class P23_prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("PRIME NUMBER");
        }else{
            boolean isPrime = true;
            for(int i = 2; i <= n-1; i++){
                if(n % 2 == 0){
                    isPrime = false;
                }
            }

            if (isPrime == true){
                System.out.println("PRIME NUMBER");
            }else{
                System.out.println("NOT PRIME NUMBER");
            }
        }
    }
}