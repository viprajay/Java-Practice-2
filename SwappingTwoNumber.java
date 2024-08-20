import java.util.*;

public class SwappingTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = sc.nextInt();

        System.out.print("Enter b = ");
        int b = sc.nextInt();

        // int c;
        // c = a;
        // a = b;
        // b = c;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
