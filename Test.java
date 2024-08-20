import java.util.*;

public class Test {

    // public static void update(int []arr){
    // for(int i=0;i<arr.length;i++){
    // arr[i]=arr[i]+1;
    // }
    // }
    // public static int binarySearch(int[] arr, int key) {
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (arr[mid] == key) {
    // return mid;
    // }
    // if (arr[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }
    // public static void reverse(int[] arr) {
    // int first = 0;
    // int last = arr.length - 1;
    // while (first < last) {
    // int temp = arr[last];
    // arr[last] = arr[first];
    // arr[first] = temp;

    // first++;
    // last--;
    // }
    // }
    // public static void pair(int[] arr) {
    // int totpair = 0;
    // for (int i = 0; i < arr.length; i++) {
    // int current = arr[i];
    // for (int j = i + 1; j < arr.length; j++) {
    // System.out.print("(" + current + "," + arr[j] + ")");
    // totpair++;
    // }
    // System.out.println();
    // }
    // System.out.println(totpair);
    // }

    // public static void subarray(int[] arr) {
    // int totsubarr = 0;
    // int currentsum = 0;
    // int maxsum = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // int start = i;
    // for (int j = i; j < arr.length; j++) {
    // int end = j;
    // currentsum = 0;
    // for (int k = start; k <= end; k++) {
    // System.out.print(arr[k]);
    // currentsum = currentsum + arr[k];

    // }
    // if (maxsum < currentsum) {
    // maxsum = currentsum;
    // }

    // totsubarr++;
    // System.out.println();
    // }
    // System.out.println();

    // }
    // System.out.println("totsubarr : " + totsubarr);
    // System.out.println("maxsum : " + maxsum);
    // }

    public static void kadanesAlgo(int[] arr) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        kadanesAlgo(arr);

        // subarray(arr);
        // pair(arr);

        // reverse(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // int key = 15;
        // System.out.println("index number : " + binarySearch(arr, key));
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(n);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(i);
        // }

        // for(int i=0;i<arr.length;i++){
        // if(arr[i]==key){
        // System.out.println("index= " + arr[i]);
        // break;
        // }
        // else{
        // System.out.println("not found");
        // }
        // }
        // int []arr = new int[10];
        // System.out.println(arr.length);

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // update(arr);
        // for(int i=0;i<arr.length;i++){
        // System.out.println(arr[i]);
        // }
    }
}