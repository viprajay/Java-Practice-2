import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        char ch;
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String = ");
        String st = sc.nextLine();

        for (int i = 0; i < st.length(); i++) {
            ch = st.charAt(i);
            s = ch + s;
            // System.out.println(s);
        }
        System.out.println(s);
    }
}
