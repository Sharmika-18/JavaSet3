public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {
            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}