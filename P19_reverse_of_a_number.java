import java.util.*;
public class P19_reverse_of_a_number {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        while (n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
    }
    
}
