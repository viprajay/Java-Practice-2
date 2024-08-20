import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num = ");
        int n = sc.nextInt();
        int temp = 0;
        if (n == 0 || n == 1) {
            System.out.println("Given number is not prime.");
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp > 0) {
                System.out.println("Given number is not prime.");
            } else {
                System.out.println("Given number is prime.");
            }
        }
    }
}
