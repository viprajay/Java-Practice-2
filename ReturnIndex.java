public class ReturnIndex {
    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("index : " + i);
            }
        }
    }
}
