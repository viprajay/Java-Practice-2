import java.util.Scanner;

public class TwoIndexAdd {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Target = ");
        int Target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == Target) {
                    System.out.println("index: " + i + ", " + j);
                    
                }
            }
        
        }
        
    }
}