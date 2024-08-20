public class ReverseNum {
    public static void main(String[] args) {
        int num = 687686;
        int revs = 0;
        while (num != 0) {
            int temp = num % 10;
            System.out.print(temp);
            num = num / 10;
        }

    }
}
