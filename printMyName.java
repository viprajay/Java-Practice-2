import java.util.*;

public class printMyName {
    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();

        printName(name);
    }
}
