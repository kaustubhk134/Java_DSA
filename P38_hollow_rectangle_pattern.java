public class P38_hollow_rectangle_pattern {

    public static void hollo_rectangel(int totRows, int totCols){
        // outer loop
        for (int i = 1; i <= totRows; i++){
            // inner columbs
            for (int j = 1; j <= totCols; j++){
                // cell - (i, j)
                if (i ==1 || i == totRows || j == 1 || j == totCols){
                    // boundry cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollo_rectangel(4, 5);
    }
}