public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 6, 89, 34};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
