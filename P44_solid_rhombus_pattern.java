public class P44_solid_rhombus_pattern {

    public static void rhombusPattern(int n){
        // for lines
        for (int i = 1; i <= n; i ++){
            // for space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // for stars
            for(int j = 1; j <= n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombusPattern(45);
    }
    
}
