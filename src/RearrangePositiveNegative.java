import java.util.Arrays;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -1, 5, -6, 7, 8, -4};

        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (num < 0)
                result[index++] = num;
        }

        for (int num : arr) {
            if (num >= 0)
                result[index++] = num;
        }

        System.out.println(Arrays.toString(result));
    }
}