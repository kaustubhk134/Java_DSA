public class P55_pairs_in_array {

    public static void pairArray(int num[]){
        int tp = 0;
        for (int i = 0; i < num.length; i++){
            int curr = num[i]; // in curr we will print value for 10's place
            for (int j = i+1; j < num.length; j++){
                System.out.print("("+curr+","+num[j]+") ");   // here all the printing oprarions take place.
                tp ++;  // adding total pairs by one after each opration
            }
            System.out.println();
        }
        System.out.println("Total Pairs are : "+ tp);
    }
    public static void main(String args[]){
        int num[] = {2, 4, 6, 8, 10};

        pairArray(num);
    }
}