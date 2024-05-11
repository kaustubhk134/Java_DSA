public class P40_inverted_half_numPyramid {

    public static void invertedNumPyramid(int n){
        // for lines
        for(int i = 1; i <= n; i++){
            // for printing numbers
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        invertedNumPyramid(50);
    }
}