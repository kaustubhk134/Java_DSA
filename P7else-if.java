import java.util.*;

public class JavaBasics{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int age;
        System.out.println("Enter the AGE : ");
        age = sc.nextInt();

        if (age >= 18){
            System.out.println("ADULT");
        }
        else if ((age >= 13) && (age < 18)){
            System.out.println("TEENAGER");
        }
        else{
            System.out.println("MINOR");
        }
    }
}