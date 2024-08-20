import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSort {

    public void ReturnSortString() {
        String s = "viprajay";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
    }

    public static void main(String[] args) {
        StringSort ss = new StringSort();
        ss.ReturnSortString();
    }
}
