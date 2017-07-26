import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by teng.liu on 2017/6/26.
 */
public class NewOne {

    private static Pattern pattern = Pattern.compile("\\d+$");

    private static String regex = "\\d+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTests = scanner.nextInt();
        while (numTests > 0) {
            int caseStrLength = scanner.nextInt();
            String s = scanner.next();

            System.out.println(getResult(s));
            numTests--;
        }
    }

    private static int getResult(String s) {
        int reuslt = 0;
        //split函数如果被分割字符串开头匹配成功 分割后会产生一个空的字符结果
        if (pattern.matcher(s).find()) {
            reuslt = s.split(regex).length;
            return reuslt;
        }

        reuslt = s.split(regex).length - 1;
        return reuslt;

    }
}
