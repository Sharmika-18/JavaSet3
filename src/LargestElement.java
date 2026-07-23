import java.util.*;
    public class LargestElement {
        public static void main(String[] args) {
            int[] arr = {12, 45, 6, 89, 34};

            /*int largest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }*/
            Arrays.sort(arr);

            System.out.println("Largest Element: " + arr[arr.length-1]);
        }
}
