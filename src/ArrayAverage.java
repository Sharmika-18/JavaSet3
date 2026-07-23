public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {12, 45, 6, 89, 34};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);
    }
}
