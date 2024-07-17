import java.util.*;
public class P13_calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter FIRST Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter SECOND Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Oprator : ");
        char oprator = sc.next().charAt(0);

        switch (oprator){
            case '+' : System.out.println(num1 + num2);
                       break;
            case '-' : System.out.println(num1 - num2);
                       break;
            case '*' : System.out.println(num1 * num2);
                       break;
            case '/' : System.out.println(num1 / num2);
                       break;
            case '%' : System.out.println(num1 % num2);
                       break;
            default : System.out.println("Wrong Opeator");
        }
    }
}
