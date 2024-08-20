public class Recursion {

    public static void FirstRecursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        FirstRecursion(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        FirstRecursion(n);
    }
}
