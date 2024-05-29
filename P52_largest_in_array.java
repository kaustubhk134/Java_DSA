import java.util.*;

public class P52_largest_in_array {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;   // (-)infinity
        // int smallest = Integer.MAX_VALUE;   // (+)infinity

        for(int i = 0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return(largest);
    }
    public static void main(String args[]){
        int num[] = {1, 3, 4, 6, 8, 9, 5, 7};

        System.out.println("Largest No : "+ getLargest(num));
    }   
}