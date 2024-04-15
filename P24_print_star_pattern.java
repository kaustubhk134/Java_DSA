public class P24_print_star_pattern {
    public static void main(String args[]){
        for (int lines = 1; lines <= 5; lines ++){
            for (int star = 1; star <= lines; star ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}