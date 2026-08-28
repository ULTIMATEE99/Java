

import java.util.Scanner;

class EXP_1{

    static boolean isPowerOfTwo(int n) {

        // Base case
        if (n == 1) {
            return true;
        }

        // Base case
        if (n <= 0 || n % 2 != 0) {
            return false;
        }

        // Recursive case
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter a number testinggit : ");

        boolean result = isPowerOfTwo(n);

        System.out.println(result);

        sc.close();
    }
}