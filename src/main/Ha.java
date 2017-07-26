import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.List;

/**
 * Created by teng.liu on 2017/6/15.
 * <p>
 * input ：  abcxyzabcrst
 * opqrstabc
 * <p>
 * output：  abc
 * abc
 * rst
 *
 *
 *
 * 主要是考察动态规划算法 求解最长公共子字符串
 *
 */
public class Ha {


    public static void main(String[] args) {

        String s1 = "djhfjksdhfjds";
        String s2 = "ahjfkdshfjk";

        Ha ha = new Ha();

        List<String> pulicStringList = ha.findPulicSubString(s1, s2);

        System.out.println(pulicStringList);

    }


    public List<String> findPulicSubString(String s1, String s2) {

        List<String> resultList = Lists.newArrayList();

        if(s1.length() == 0 || s2.length() == 0 ){
            return resultList;
        }

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            int index = s2.indexOf(c1);
            if (index == StringUtils.INDEX_NOT_FOUND) {
                continue;
            }
            int x = 0;
            while (true) {
                if (((i + x) >= s1.length() || (index + x >= s2.length())) || (s1.charAt(i + x) != s2.charAt(index + x))) {
                    break;
                }
                x++;
            }
            if (x > 1) {
                resultList.add(s1.substring(i, i + x));
            }
        }

        resultList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2.length() - o1.length());
            }
        });
        return resultList;
    }
}
