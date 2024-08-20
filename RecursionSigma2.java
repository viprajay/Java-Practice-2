public class RecursionSigma2 {

    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void PrintInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        // PrintDec(n);
        PrintInc(n);
        System.out.println();
        System.out.println(Math.pow(2, 3));
    }
}
