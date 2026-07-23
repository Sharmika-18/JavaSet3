import java.util.HashSet;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        int firstRepeat = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                firstRepeat = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        if (firstRepeat != -1)
            System.out.println("First Repeating Element: " + firstRepeat);
        else
            System.out.println("No Repeating Element");
    }
}