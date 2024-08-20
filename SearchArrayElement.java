import java.util.Scanner;

public class SearchArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array
        int[] array = { 2, 4, 6, 8, 10, 12, 14, 16 };

        System.out.print("Enter the number you want to search for: ");
        int target = input.nextInt();

        int index = searchElement(array, target);

        if (index != -1) {
            System.out.println(target + " is found at index " + index);
        } else {
            System.out.println(target + " is not found in the array.");
        }
    }

    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found in the array
    }
}
