public class P46_diamond_pattern {

    public static void diamondPat(int n){
     // 1st half

        // for lines
        for (int i = 1; i <= n; i++){
            // for spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("   ");
            }
            // for stars
            for (int j = 1; j <= (2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        // 2nd half

        for (int i = n; i >= 1; i--){
            // for spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print("   ");
            }
            // for stars
            for (int j = 1; j <= (2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamondPat(5);
    }
}