import java.util.*;
public class P36_bin_to_dec {

    public static void bintoDec(int binNum){
        int pow = 0;
        int dec = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10; //to take last digit from the number.
            dec = dec + (lastDigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum / 10; // to remove last digit from the number.
        }
        System.out.println("Decimal No : "+ dec);
    }
    public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    System.out.println("Enter the BINARY No : ");
    int binNum = sc.nextInt();

    bintoDec(binNum);
    }
}