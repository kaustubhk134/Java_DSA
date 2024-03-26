import java.util.*;

public class P8_incometax_calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INCOME : ");
        int income = sc.nextInt();

        if (income < 500000){
            System.out.println("Income Tax = 0");
        }
        else if ((income >= 500000) && (income < 1000000)){
            int tax = (int) (income * 0.20); // for 20 % income tax
            System.out.println("Income Tax = "+ tax);
        }
        else if (income >= 1000000){
            int tax = (int) (income * 0.30); // for 30 % income tax
            System.out.println("Income Tax = "+ tax);
        }
    }
}