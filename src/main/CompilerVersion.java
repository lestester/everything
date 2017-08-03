
import java.util.Scanner;

/**
 * Created by teng.liu on 2017/8/2. //
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/compiler-version-2/
 */
public class CompilerVersion {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String line = s.nextLine();
            String replaceVersion = replaceVersion(line);
            System.out.println(replaceVersion);
        }
    }

    public static String replaceVersion(String line) {

        if (line.indexOf("->") == -1) {
            return line;
        }

        int index = line.indexOf("//");

        if (index == -1 ){
            return line.replace("->", ".");
        }

        String substring = line.substring(0, index);
        String replace = substring.replace("->", ".");
        return replace + line.substring(index);
    }
}
