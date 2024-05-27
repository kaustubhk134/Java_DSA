import java.util.*;

public class P51_array_linear_search {

    public static int linearSearch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return (i);
            }
        }
        return (-1);
    }
    public static void main(String args[]){
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Number : ");
        int key = sc.nextInt();


        // int key = 6;

        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("KEY not Found");
        }else{
            System.out.println("The KEY is at : "+ index);
        }
    }
}