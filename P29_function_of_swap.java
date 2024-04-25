import java.util.*;
public class P29_function_of_swap {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value if A : "+ a);
        System.out.println("Value if B : "+ b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        swap(a, b);
    }
    
}
