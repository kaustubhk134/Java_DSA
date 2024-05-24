public class P50_array_function {

    public static void addArray(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){

        int marks[] = {1, 2, 3, 4, 5};
        addArray(marks);
        // for printing
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}