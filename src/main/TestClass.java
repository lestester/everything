/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/


import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        for (int i = 0; i < numCases; i++) {
            int tasks = scanner.nextInt();
            int[] list = convertToArray(scanner);
            System.out.println(getDayOfWeek(tasks, list));
        }

    }

    private static String getDayOfWeek(int tasks, int[] array) {
        int result = -1;
        int sumL = Arrays.stream(array).reduce(0, (sum, iterm) -> sum + iterm);
        int tmp = tasks % sumL;

        if (tmp == 0) {
            //在一个周之内可以做完找到最后一个非0的那一天
            for (int j = 0; j < array.length; j++) {
                if (0 != array[j]) {
                    result = j;
                }
            }
        } else {
            //多少周后 一周内的某一天可以做完
            //tmp 减去每天可以完成的工作量知道为 0
            for (int i = 0; i < array.length; i++) {
                tmp = tmp - array[i];
                if (tmp <= 0) {
                    result = i;
                    break;
                }
            }
        }

        return convertToWeeklyString(result);

    }

    private static String convertToWeeklyString(int result) {
        switch (result) {
            case 0:
                return "MONDAY";
            case 1:
                return "TUESDAY";
            case 2:
                return "WEDNESDAY";
            case 3:
                return "THURSDAY";
            case 4:
                return "FRIDAY";
            case 5:
                return "SATURDAY";
            case 6:
                return "SUNDAY";
            default:
                return "error";
        }
    }

    private static int[] convertToArray(Scanner scanner) {
        //从一行中读取7个放入数组
        int[] list = new int[7];
        int i = 0;
        while (i < 7) {
            list[i] = scanner.nextInt();
            i++;
        }
        return list;
    }

}
