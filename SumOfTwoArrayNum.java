import java.util.Scanner;

public class SumOfTwoArrayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] > n) {
                    System.out.println("Grater");
                } else if (a[i] + a[j] >= n) {
                    System.out.println("equal");
                    // System.exit(0);
                } else {
                    System.out.println("less");
                }
            }
        }
    }
}
