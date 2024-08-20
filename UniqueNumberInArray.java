public class UniqueNumberInArray {
    public static void main(String[] args) {
        int a[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] != a[j]) {
                    a[i]++;
                    System.out.println(a[i]);
                }

            }

            // if (a[i] == a[i + 1]) {
            // a[i]++;
            // count++;
            // if (count == 0) {
            // System.out.println(a[i]);
            // }
            // } else {
            // System.out.println("No Unique Value");
            // }
            // for (int j = 1; j < a.length; j++) {
            // if (a[i] != a[j]) {
            // System.out.println(a[i]);
            // }
            // }

        }
    }
}
