import java.util.*;
public class P16_print_no_one_to_n {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int range = sc.nextInt();
        int counter = 1;
        while (counter <= range){
            System.out.print(counter+" ");
            counter ++;
        }
    }
}
