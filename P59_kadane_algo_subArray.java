public class P59_kadane_algo_subArray {

    public static void kadanesAlgo(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++){
            currSum += num[i];
            if (currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("The MAX Sub-Array Sum : "+ maxSum);
    }
    // this function is to print the min value present in the -ve integer array.

    public static void minkadanesAlgo(int minNum[]){
        int smallest = minNum[0];

        for(int i = 1; i < minNum.length; i++){
            if (minNum[i] > smallest){
                smallest = minNum[i];
            }
        }
        System.out.println("MIN Value is : "+ smallest);
    }
    public static void main(String args[]){
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int minNum[] = {-4, -3, -2, -1};

        kadanesAlgo(num);
        minkadanesAlgo(minNum);
    }
}
