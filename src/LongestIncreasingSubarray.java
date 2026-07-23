public class LongestIncreasingSubarray {
    public static void main(String[] args) {

        int[] arr={1,2,3,1,2,3,4,5};

        int maxLen=1;
        int len=1;
        int end=0;

        for(int i=1;i<arr.length;i++){

            if(arr[i]>arr[i-1])
                len++;
            else
                len=1;

            if(len>maxLen){
                maxLen=len;
                end=i;
            }
        }

        System.out.print("Longest Increasing Subarray: ");

        for(int i=end-maxLen+1;i<=end;i++)
            System.out.print(arr[i]+" ");
    }
}