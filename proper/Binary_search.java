package proper;

import java.util.Arrays;

public class Binary_search {

    public static void main(String[] args) {

        // Java inbuilt binary search using Arrays class
        // Arrays.binarySearch(arrayName, targetKey)

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = Arrays.binarySearch(arr, target);

        System.out.println("Element found at position: " + (result + 1));
        System.out.println("Element found at Index: " + (result));

    }
}