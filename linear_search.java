public class linear_search {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int found=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = 1;
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }

        if (found == 0) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    
}
