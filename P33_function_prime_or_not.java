import java.util.*;
public class P33_function_prime_or_not {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i = 2; i <= n-1; i++){
            if (n % i == 0){
                isPrime = false;
            }
        }
        return (isPrime);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(isPrime(n));


    }
}