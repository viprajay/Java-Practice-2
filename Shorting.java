import java.util.*;

public class Shorting {

    public static void printArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 7, 9, 4, 1, 2 };

        // Bubble sort

        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // printArrays(arr);

        // Selection sort
        // for (int i = 0; i < arr.length - 1; i++) {
        //     int smallest = i;
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if (arr[smallest] > arr[j]) {
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // printArrays(arr);
    }
}
