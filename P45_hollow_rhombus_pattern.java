public class P45_hollow_rhombus_pattern {

    public static void hollowRhombus(int n){
        // for lines
        for(int i = 1; i <= n; i++){
            // for spaces
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // for printing stars in hollow pattern.
            for (int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        hollowRhombus(5);
    }
}
