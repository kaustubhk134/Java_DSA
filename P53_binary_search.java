public class P53_binary_search {

    public static int binarySearch(int num[], int key){
        int start = 0, end = num.length - 1;

        while(start <= end){
            int mid = (start + end)/2;
            // compirasions
            // for mid value
            if(num[mid] == key){
                return(mid);
            }
            if(num[mid] < key){ // right side
                start = mid + 1;
            }else{ // left side
                end = mid -1;
            }
        }
        return(-1);
    }

    public static void main(String args[]){
        int num[] = {2, 4, 6, 8, 10, 12, 14, 18, 20};
        int key = 18;

        System.out.println("The KEY is at : "+ binarySearch(num, key));
    }
}