import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num = ");
        int a = sc.nextInt();

        while (a > 0) {
            int n = a % 10;
            System.out.print(n);
            a = a / 10;
        }
    }
}
