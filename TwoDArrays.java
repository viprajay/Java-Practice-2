import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows= ");
        int rows = sc.nextInt();
        System.out.print("Enter the cols= ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter which num you want find = ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j]==x){
                    System.out.print("X find in location = ("+i+","+j+")");
                }
               
            }
        }

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
