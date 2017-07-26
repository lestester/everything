import java.util.Scanner;

/**
 * Created by teng.liu on 2017/6/28.
 */
public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        //int[][] matrix = new int[][];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == a && j == b) {
                    System.out.print(p + " ");
                    //matrix[i][j] = p;
                    continue;
                }
                int level = Math.abs(i - a);
                int vertical = Math.abs(j - b);
                int differenceValue = Math.max(level, vertical);
                int result = (p - differenceValue) < 0 ? 0 : (p - differenceValue);
                //matrix[i][j] = result;
                System.out.print(result + " ");
            }
            System.out.println();

        }

    }

}
