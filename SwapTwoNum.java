public class SwapTwoNum {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);
    }
}
