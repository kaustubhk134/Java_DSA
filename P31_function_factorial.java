import java.util.*;
public class P31_function_factorial {

    public static int factorial(int num){
        int mul = 1;
        for (int i = 1; i <= num; i++){
            mul = mul * i;
        }
        return (mul);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int mulVal = factorial(num);
        System.out.println("Factorial is : "+ mulVal);
    }
}
