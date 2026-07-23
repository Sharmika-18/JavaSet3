import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);

    }
}
