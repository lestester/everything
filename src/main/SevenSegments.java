import java.util.*;

/**
 * Created by teng.liu on 2017/6/28.
 * questions :
 * https://www.hackerearth.com/zh/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/jarvis-and-seven-segments-1/
 *
 */
public class SevenSegments {

    private static Map<Integer, Integer> bulbs = new LinkedHashMap<>();

    static {
        bulbs.put(1, 2);
        bulbs.put(2, 5);
        bulbs.put(3, 5);
        bulbs.put(4, 4);
        bulbs.put(5, 5);
        bulbs.put(6, 6);
        bulbs.put(7, 3);
        bulbs.put(8, 7);
        bulbs.put(9, 6);
        bulbs.put(0, 6);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            int length = scanner.nextInt();
            String[] arrayList = readArray(scanner);
            int aimInteger = findleast(arrayList);
            if (aimInteger != Integer.MAX_VALUE) {
                System.out.println(aimInteger);
            } else {
                throw new Exception();
            }
            n--;
        }


    }

    private static int findleast(String[] arrayList) {
        int result = Integer.MAX_VALUE, resultBulbs = Integer.MAX_VALUE;
        for (String integer : arrayList) {
            int tmpBulbs = getBulbs(integer);
            if (tmpBulbs < resultBulbs) {
                resultBulbs = tmpBulbs;
                result = Integer.valueOf(integer);
            }
        }

        return result;

    }

    private static int getBulbs(String integer) {
        String[] chars = integer.split("");
        int result = 0;
        for (String aChar : chars) {
            result += bulbs.get(Integer.valueOf(aChar));
        }

        return result;
    }

    private static String[] readArray(Scanner scanner) {
        if(scanner.hasNext()){
            scanner.nextLine();
            String input = scanner.nextLine();

            String[] split = input.split(" ");
            return split;
        }
        return null;
    }


}
