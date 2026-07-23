import java.util.*;
    public class SmallestElement {
        public static void main(String[] args) {
            int[] arr = {12, 45, 6, 89, 34};



            /*for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }*/
           Arrays.sort(arr);
            int smallest = arr[0];
            System.out.println("Smallest Element: " + smallest);
        }
    }

