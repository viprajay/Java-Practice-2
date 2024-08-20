public class ReverseStringNew {
    public static void main(String[] args) {
        String name = "viprajay";
        int len = name.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
