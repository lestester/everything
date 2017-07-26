import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by teng.liu on 2017/6/27.
 */
public class MinMax {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] readArray = readArray(scanner, n);

        //quickSort(readArray);

        //sorted函数将数组从小到大排序
        int[] sorted = Arrays.stream(readArray).sorted().toArray();
        for (int i = 0; i < sorted.length-1; i++) {
            if ( sorted[i] !=sorted[i+1] && sorted[i] + 1 != sorted[i + 1]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    private static int[] readArray(Scanner scanner, int n) {

        int[] inputArray = new int[n];
        while (n > 0) {
            inputArray[n - 1] = scanner.nextInt();
            n--;
        }

        return inputArray;
    }
}
