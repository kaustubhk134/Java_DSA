public class P41_floyd_triangular_pattern {

    public static void floydTriangle(int n){
        int counter = 1;
        // for lines
        for(int i = 1; i <= n; i++){
            // how many times counter will be printed
            for(int j = 1; j <= i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        floydTriangle(3);
    }
}
