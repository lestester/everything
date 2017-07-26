import com.google.common.collect.Maps;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.commons.lang3.text.StrSubstitutor;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by teng.liu on 2017/5/18.
 */
public class StrTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        /*String str = "${username} 很神奇";
        Map<String,Object> param = Maps.newHashMap();

        param.put("username","heihei");
        System.out.println(StrSubstitutor.replace(str, param));*/


        /*String input ="sadw96aeafae4awdw2wd100awd";
        String testStr = "2398djhfjhjf34hfjh";

        Scanner scanner = new Scanner(input);
        scanner.findWithinHorizon("(\\d+){1,}",Pattern.DOTALL);
        MatchResult matchResult = scanner.match();
        System.out.println(matchResult.groupCount());
        System.out.println(matchResult.group(0));


        Pattern pattern = Pattern.compile("(\\d+)",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println(count);

        String[] split = testStr.split("\\d+");
        System.out.println(split.length);
        Arrays.stream(split).forEach(s -> System.out.println(s));*/

        String str = "您的帖子“靠近碧山 MRT 5 分钟组屋，…”有用户在Nestia App中询问“是否可带宠物入住？”。请使用链接下载App后完成注册查看帖子，下载链接：http://branch.io/5g3d8a";
        String str1="https://nustaging.app.link/9ca88YVPmE";
        String str3="收到短短收到短短收到短短收到短短收到短短收到短短收到短短收到短短收到短短收到短短收到短短收到短";

        String str4 = "Your post \"nestia  first sao\" has a new 收到 neshdj Up via https://nustaging.app.link/XhBQPf5evE to view it now.";

        String str5= "帖子\"中文最大长度测试\"有回复\"中文最大长度测试\"点击https://nestiasg.app.link/2MrDkWdjtE 下载查看";

        System.out.println(str5.length());

        System.out.println(str5.getBytes().length);


        Character.UnicodeScript unicodeScript = Character.UnicodeScript.of('哈');
        //System.out.println(str4.getBytes().length);
    }
}
