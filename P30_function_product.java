import java.util.*;
public class P30_function_product {

    public static int Multiply(int a, int b){
        int Prod = a * b;
        return (Prod);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        int Prod = Multiply(a, b);

        System.out.println("Product is : "+ Prod);
    }
    
}
