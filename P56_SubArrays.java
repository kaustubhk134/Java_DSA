public class P56_SubArrays {

    public static void subArray(int num[]){
        int ts = 0;   // to print total sub-array
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
            int start = i;
            for (int j = i; j < num.length; j ++){
                int end = j;
                int sum = 0; // initilising sum = 0 for printing sum of every sub array in front of it.
                for (int k = start; k <= end; k++){
                    System.out.print(num[k] +" ");
                    sum = sum + num[k];
                }
                ts ++;
                System.out.println("= " + sum);
                totalSum = totalSum + sum;

                if (sum > maxSum){
                    maxSum = sum;
                }
                if (sum < minSum){
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total Sub-Array are : "+ ts);
        System.out.println("Total Sum of all the Sum-Array : "+ totalSum);
        System.out.println("The MAX Sum in Sub-Array : "+ maxSum);
        System.out.println("The MIN Sum in Sub-Array : "+ minSum);
    }
    public static void main(String args[]){
        int num[ ]= {2, 4, 6, 8, 10};
        subArray(num);
    }
}
