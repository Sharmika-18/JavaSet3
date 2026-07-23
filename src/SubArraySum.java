public class SubArraySum {
    public static void main(String[] args) {

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int start = 0;
        int sum = 0;
        boolean found = false;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);

                System.out.print("Subarray: ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray found");
        }
    }
}