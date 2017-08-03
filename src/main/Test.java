import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;

/**
 * Created by teng.liu on 2017/1/22.
 */
public class Test {
    public static void main(String[] args) throws IOException {


        //读取标准输入n
        int n = 9;
        System.out.println(--n);
        System.out.println(n);

        System.out.println("~~~~~~~~~");

        int m=9;
        System.out.println(m--);
        System.out.println(m);

        Integer.parseInt("A");
        /*while (true) {
            System.out.print("请输入数字N(0~10): ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            N = Integer.parseInt(line);
            if (0 <= N && N <= 10) {
                break;
            } else {
                System.out.println("数字输入不合法，输入数字需要大于等于0 且小于等于10");
            }
        }



        String str = null;
        while (true){
            System.out.print("请输入字符串:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            int strLength = str.length();

            if(strLength > 15 || strLength < 1){
                System.out.println("请确认输入的字符串长度在1~15之间");
            } else{
                break;
            }
        }
        System.out.println(N*2);
        System.out.println(str);*/



        //String strlong = " this  is  a  long token eyJhbGciOiJSUzI1N iIsInR5cCI6Ikp XVCJ9.eyJBdXRo VmFsd WUi Ojcs IklkI joxN zIs IlV  zZXJu YW1lIj oidGVzdGV yQG5lc3RpYS 5jb20iLCJ leHAiOj E0ODcyM zc3Mjd9.ci 0sCcthE DmB TT9Ok5pzfDqN1 PpywzIOZ iyean wui0tV ohqdeQ gH9kb 0S8gcJDa9 Pt3qGh 03w9d -un981z fuVKsrW170 w8EBCc J2-6 FB_e3R ZmWF2 oU-PB8_G- vFnL3N BbcOvF0ef ldqBMSQl ysY_we pTnRxnYRn 2B qo_TsCDvE-q X04oXDg OTVQ 1npqgWe YwmZ VCFG v7_gj7 BkigOY lDa3kuem QQpwpY76z7 cuyRfh0 0jIPE- UDW6-cW aHALH CF8gF5eO tHmCgX feBj7POutql3  6agHjoWh sqz-x LTtKrH YPhfeG z7MK -Y4vTrRbe 1tctz9Q S44Pz HMdCT lfDSWd";

        //System.out.println(strlong.length());
        char[] chars = {'1'};
         //String string = RandomStringUtils.random(1500);
        //System.out.println("1." +string);

        //String string2 = RandomStringUtils.randomAlphabetic(1500);
        //System.out.println(string2);


        //String chinese = "四个，字符g";

        //System.out.println(chinese.length());

        //String english = "我看那边月台的栅栏外有几个卖东西的等着顾客。走到那边月台，须穿过铁道，须跳下去又爬上去。父亲是一个胖子，走过去自然要费事些。我本来要去的，他不肯，只好让他去。我看见他戴着黑布小帽，穿着黑布大马褂，深青布棉袍，蹒跚地走到铁道边，慢慢探身下去，尚不大难。可是他穿过铁道，要爬上那边月台，就不容易了。他用两手攀着上面，两脚再向上缩；他肥胖的身子向左微倾，显出努力的样子。这时我看见他的背影，我的泪很快地流下来了。我赶紧拭干了泪，怕他看见，也怕别人看见。我再向外看时，他已抱了朱红的橘子望回走了。过铁道时，他先将橘子散放在地上，自己慢慢爬下，再抱起橘子走。到这边时，我赶紧去搀他。" ;

        //System.out.println(english.length());

        //System.out.println(english.substring(0,149));


        /*String str = "帖子\"盛港有房出租anch\"有回复\"老板，房子还出租吗\"点击https://nustaging.app.link/6KFJtOe8wE 下载查看";

        System.out.println(str.length());


        String tmp ="Your post \"Master Bedroom For R...\" has a new comment \"I'm interesting in t...\"! Sign Up via https://nustaging.app.link/A7UgXd87wE to view it now.";

        System.out.println( tmp.length() == tmp.getBytes().length);*/

        //String usc2 = "å¸–å\u00AD\u0090\\\"ç››æ¸¯æœ‰æˆ¿å‡ºç§Ÿ2n\\\"æœ‰å›žå¤\u008D\\\"è€\u0081æ\u009D¿ï¼Œæˆ¿å\u00AD\u0090è¿˜å‡ºç§Ÿ\\\"ç‚¹å‡»https://nustaging.app.link/6KFJtOe8wE ä¸‹è½½æŸ¥çœ‹";

        //String unicode = new String(usc2.getBytes(),"UTF-16");

        //StringBuilder sb = new StringBuilder();

        /*int i = 0 ;
        while (i < 1) {
            sb.append("很长的文本");
            i++;
        }*/
        //String json = "%5B%7B%22module%22%3A%22group%22%2C%22area_id%22%3A%221%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1655282717821385%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A0%7D%7D%5D%7D%5D";

        //String json = "%5B%7B%22module%22%3A%22group%22%2C%22area_id%22%3A%222%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A1%2C%22source_api_id%22%3A%22ca-app-pub-1182739567323523%2F4423954893%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A0%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A3%7D%7D%2C%7B%22source%22%3A1%2C%22source_api_id%22%3A%22ca-app-pub-1182739567323523%2F4423954893%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A6%7D%7D%2C%7B%22source%22%3A1%2C%22source_api_id%22%3A%22ca-app-pub-1182739567323523%2F4423954893%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A9%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A12%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A15%7D%7D%2C%7B%22source%22%3A1%2C%22source_api_id%22%3A%22ca-app-pub-1182739567323523%2F4423954893%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A18%7D%7D%5D%7D%5D";
        //String json = "%5B%7B%22module%22%3A%22group%22%2C%22area_id%22%3A%222%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A1%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A4%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A7%7D%7D%2C%7B%22source%22%3A1%2C%22source_api_id%22%3A%22ca-app-pub-1182739567323523%2F4423954893%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A10%7D%7D%2C%7B%22source%22%3A1%2C%22source_api_id%22%3A%22ca-app-pub-1182739567323523%2F4423954893%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A13%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A16%7D%7D%2C%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A19%7D%7D%5D%7D%5D";
        //String  json= "%5B%7B%22module%22%3A%22group%22%2C%22area_id%22%3A%221%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1655282717821385%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A0%7D%7D%5D%7D%5D" ;

        //String json = "%5B%7B%22module%22%3A%22lottery%22%2C%22area_id%22%3A%221%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A3%7D%7D%5D%7D%2C%7B%22module%22%3A%22lottery%22%2C%22area_id%22%3A%222%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1652044054811918%22%2C%22type%22%3A5%7D%5D%7D%5D";


        //String json = "%5B%7B%22module%22%3A%22lottery%22%2C%22area_id%22%3A%221%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1651708411512149%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A3%7D%7D%5D%7D%2C%7B%22module%22%3A%22lottery%22%2C%22area_id%22%3A%222%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1652044054811918%22%2C%22type%22%3A5%7D%5D%7D%5D";


        /*String json ="%5B%7B%22module%22%3A%22group%22%2C%22area_id%22%3A%221%22%2C%22ad_list%22%3A%5B%7B%22source%22%3A2%2C%22source_api_id%22%3A%22967102759972721_1655282717821385%22%2C%22type%22%3A1%2C%22properties%22%3A%7B%22insert_index%22%3A0%7D%7D%5D%7D%5D";
        System.out.println(URLDecoder.decode(json,"UTF-8"));*/




    }


}
