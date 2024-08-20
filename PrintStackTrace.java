public class PrintStackTrace {
    public static void main(String[] args) {

        try {
            int a = 100;
            int b = 2;
            int c = a / b;
            System.exit(0);
        } catch (Exception e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("hello");
        }
    }
}
