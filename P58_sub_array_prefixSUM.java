// max sub array sum using prefix sum aproch.
public class P58_sub_array_prefixSUM{

    public static void prefixSum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [num.length];

        //prefix for loop
        prefix[0] = num[0];

        for (int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + num[i];
        }

        //main for loop's
        for(int i = 0; i < num.length; i++){
            int start = i;
            for (int j = i; j < num.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // ternary oprator

                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The MAX Sum  "+ maxSum);
    }
    public static void main(String args[]){
        int num[] = {1, -2, 6, -1, 3};

        prefixSum(num);
    }
}