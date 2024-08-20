import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
     
        System.out.print("Enter the num = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;

        while(n>0){
        a = n%10;
        System.out.print(a);
        n = n/10;
        }
    }
}
