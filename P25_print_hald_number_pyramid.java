public class P25_print_hald_number_pyramid {
    public static void main(String args[]){

        int n = 5;
        for (int lines = 1; lines <= n; lines++){
            for (int num = 1; num <= lines; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
