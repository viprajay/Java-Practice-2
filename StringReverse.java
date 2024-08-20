import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        String name = "viprajay";
        StringBuilder str = new StringBuilder(name);
        String n = str.reverse().toString();
        System.out.println(n);

    }
}