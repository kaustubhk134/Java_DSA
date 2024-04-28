import java.util.*;
public class P32_function_binomial_coefficient {

    public static int Facto(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return(fact);
    }
    public static int BinCoef(int n, int r){
        int nFact = Facto(n);
        int rFact = Facto(r);
        int Sub = Facto(n - r);
        int binCoef = nFact / (rFact * Sub);

        return(binCoef);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.println("Enter R : ");
        int r = sc.nextInt();

        System.out.println("Binomial Coefficient : "+ BinCoef(n, r));
    }

}