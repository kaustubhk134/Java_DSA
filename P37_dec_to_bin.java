import java.util.*;
public class P37_dec_to_bin {

    public static void bintoDec(int decNo){
        int bin = 0;
        int pow = 0;
        while(decNo > 0){
            int rem = decNo % 2; // for remainder devide dicimal no with 2.
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow ++;
            decNo = decNo / 2; // to remove last digit from the number.
        }
        System.out.println(bin);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the DECIMAL no : ");
        int decNo = sc.nextInt();
        bintoDec(decNo);
    }
}
