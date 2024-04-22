import java.util.*;
public class P28_function_of_addition {

    public static void Addition(int a, int b){ // parameters or formal parameters
        int sum = a + b;
        System.out.println("Sum is : "+ sum);
    }
    public static void main(String args[]){ // arguments or actual parameters
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Addition(a, b);
    }
}
