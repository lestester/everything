import java.util.*;

/**
 * Created by teng.liu on 2017/8/2.
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/remove-duplicates-3/
 */
public class RemoveDuplicates {

    public static String removeDuplicate(String input) {

        Set<String> sets = new HashSet<>();  //存放字母

        String[] split = input.split("");


        List<String> resultList = new ArrayList<>();

        for (String s : split) {

            if (sets.contains(s)) {
                continue;
            }
            resultList.add(s);
            sets.add(s);

        }
        String result = "";
        for (String s : resultList) {
            result += s;

        }

        return result;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String line = s.nextLine();
            System.out.println(removeDuplicate(line));
        }
    }

}
