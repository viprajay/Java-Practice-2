public class Print1To100PrimeNum {
    public static void main(String[] args) {
        int num = 200;
        int temp = 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(i + ", ");
            } else {
                temp = 0;
            }
        }
    }
}
