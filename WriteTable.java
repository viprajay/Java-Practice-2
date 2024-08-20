import java.util.*;

public class WriteTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num = ");
        int a = sc.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(a*i);
        }
    }
}
