public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int size = arr.length;
        int temp = 0;
        for (int i = size - 2; i <= arr.length; i--) {
            System.out.println(arr[i]);
            // temp = arr[i];
            // arr[i] = arr[i + 2];
            // arr[i + 2] = temp;
            // System.out.println(temp);

        }
    }
}
