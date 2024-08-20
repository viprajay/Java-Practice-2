import java.util.Scanner;

public class SimpleQuestions {
    public static void main(String[] args) {
        int num = 10212;
        while (num != 0) {

            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;

        }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter any Character: ");
        // char ch = sc.next().charAt(0);
        // if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
        // {
        // System.out.println("Vowel");
        // } else {
        // System.out.println("not vowel");
        // }
        // int num = 14;
        // if (num % 7 == 0) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("no");
        // }
        // int r = 3;
        // System.out.println(3.14 * r * r);

    }
}
