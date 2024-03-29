import java.util.*;

public class P12_Switch_Statements {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        
        switch(num){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Mango Shake");
            break;
            default : System.out.println("I am Dreaming");
            break;
        }
    }
    
}
