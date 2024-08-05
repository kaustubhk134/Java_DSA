import java.util.*;
public class P17_sum_of_natural_no {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int range = sc.nextInt();
        int sum = 0;

        int counter = 1;
        while (counter <= range){
            sum = sum + counter;
            counter ++;
        }
        System.out.print(sum);
    }
}
