import java.util.Scanner;

public class TableByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which table you want to see = ");
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(n*i);
        }
    }
}
