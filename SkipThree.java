public class SkipThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 3) {
                System.out.println(i);
            }
        }
    }
}
