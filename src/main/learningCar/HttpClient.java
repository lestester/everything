package learningCar;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by teng.liu on 2017/7/24.
 */
public class HttpClient {

    private static String ua = "Mozilla/5.0 (iPhone; CPU iPhone OS 10_3_2 like Mac OS X) AppleWebKit/603.2.4 (KHTML, like Gecko) Mobile/14F89 MicroMessenger/6.5.12 NetType/WIFI Language/zh_CN";

    private static String loginUrl = "http://xueyuan.byjx-0530.com/Server/AccountServer.asmx/MobileLogin?_=";

    private static String coachUrl = "http://xueyuan.byjx-0530.com/Server/OrderCoachServer.asmx/GetTimesInfoByCoachIDNew?_=";

    private static String waitUrl = "http://xueyuan.byjx-0530.com/Server/OrderCoachServer.asmx/GetRandomWaitTimes?_=";

    private static String orderCoach = "http://xueyuan.byjx-0530.com/Server/OrderCoachServer.asmx/orderCoach?_=";

    private static String loginInfo = "{\"UserName\":\"372928198804043223\",\"Password\":\"13295404209\",\"LoginType\":0}";

    private static String cookieEnds = "; password=13295404209; rmbUser=true; username=372928198804043223";

    private static String pattern_String = " (\\d)+";

    private  CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent(ua).setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(1000).setSocketTimeout(1000).build()).build();


    private  Map<String, String> commonHeaderMap = Maps.newHashMap();


    private static Logger logger = LoggerFactory.getLogger(HttpClient.class);

    public HttpClient() {
        commonHeaderMap.put("Host", "xueyuan.byjx-0530.com");
        commonHeaderMap.put("Accept", "application/json");
        commonHeaderMap.put("X-Requested-With", "XMLHttpRequest");
        commonHeaderMap.put("Accept-Language", "zh-cn");
        commonHeaderMap.put("Origin", "http://xueyuan.byjx-0530.com");
        commonHeaderMap.put("Accept-Encoding", "gzip, deflate");
        commonHeaderMap.put("Connection", "keep-alive");
        commonHeaderMap.put("Referer", "http://xueyuan.byjx-0530.com/NMobile/page/time.html?version=20160927");

        String cookies = loginForCookies();
        if (!StringUtils.isBlank(cookies)) {
            commonHeaderMap.put("Cookie", cookies);
            logger.info("login success! Cookie: " + cookies);
        } else {
            logger.error("夭寿啦！登录失败");
        }


    }

    private CloseableHttpResponse postRequest(String url, Map<String, String> uniqueHeaderMap, String param) {
        HttpPost post = new HttpPost(url);
        if (!StringUtils.isBlank(param)) {
            StringEntity stringEntity = new StringEntity(param, Charset.forName("UTF-8"));
            stringEntity.setContentType("application/json");
            post.setEntity(stringEntity);
        }

        //设置通用header
        for (Map.Entry<String, String> entry : commonHeaderMap.entrySet()) {
            post.setHeader(entry.getKey(), entry.getValue());
        }

        if (null != uniqueHeaderMap && !uniqueHeaderMap.isEmpty()) {
            //设置非通用header
            for (Map.Entry<String, String> entry : uniqueHeaderMap.entrySet()) {
                post.setHeader(entry.getKey(), entry.getValue());
            }
        }

        //发送请求时检查是否有cookie 如果没有不在发送请求
        if (null == post.getHeaders("Cookie") || post.getHeaders("Cookie").length == 0) {
            return null;
        }
        CloseableHttpResponse closeableHttpResponse = null;
        //logger.debug("debug end!" + url);
        try {
            closeableHttpResponse = httpClient.execute(post);
            return closeableHttpResponse;
        } catch (IOException e) {
            logger.error("请求失败了！", e);
        }
        return null;

    }

    public String loginForCookies() {
        Map<String, String> uniqueMap = Maps.newHashMap();
        uniqueMap.put("Referer", "http://xueyuan.byjx-0530.com/NMobile/mLogin.htm");
        uniqueMap.put("Cookie", "password=13295404209; rmbUser=true; username=372928198804043223");
        logger.info("login ing ~");
        CloseableHttpResponse closeableHttpResponse = postRequest(loginUrl + System.currentTimeMillis(), uniqueMap, loginInfo);
        if (null == closeableHttpResponse || closeableHttpResponse.getStatusLine().getStatusCode() != 200) {
            return null;
        }
        String setCookies = closeableHttpResponse.getHeaders("Set-Cookie")[0].getValue();
        List<String> strings = Splitter.on(';').trimResults().omitEmptyStrings().splitToList(setCookies);

        if (strings.size() == 3) {
            return strings.get(0) + cookieEnds;
        }
        return null;

    }

    public String getRandom() throws IOException {
        Map<String, String> uniqueMap = Maps.newHashMap();
        String timpStamp = String.valueOf(System.currentTimeMillis());
        //uniqueMap.put("Cookie", cookie);
        CloseableHttpResponse closeableHttpResponse = postRequest(waitUrl + timpStamp, uniqueMap, null);
        String result = null;
        if (null != closeableHttpResponse && closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
            String resultString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
            Pattern pattern = Pattern.compile(pattern_String);
            Matcher matcher = pattern.matcher(resultString);
            if (matcher.find()) {
                result = matcher.toMatchResult().group(0).trim();
            }
        }

        return result;
    }


    public String findCoach(String cookie) throws IOException {

        //Map<String, String> uniqueMap = Maps.newHashMap();
        //uniqueMap.put("Referer", "http://xueyuan.byjx-0530.com/NMobile/page/time.html?version=20160927");
        //uniqueMap.put("Cookie", cookie);
        String timpStamp = String.valueOf(System.currentTimeMillis());
        String param = "{\"coachID\":\"ygd201607160015\",\"date\":\"2017-7-28\",\"subid\":0}";

        CloseableHttpResponse closeableHttpResponse = postRequest(coachUrl + timpStamp, null, param);

        if (null != closeableHttpResponse && closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
            return EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
        }

        return null;

    }

    public String orderCoah(String param) throws IOException {

        String timpStamp = String.valueOf(System.currentTimeMillis());

        //param = "{\"tbTimeNo\":\"sjd201702210011\",\"trainDate\":\"2017-07-26\",\"coachNo\":\"ygd201607160015\",\"subID\":\"3\"}";
        //logger.debug(param);
        //return param + " " + timpStamp;

        CloseableHttpResponse closeableHttpResponse = postRequest(orderCoach + timpStamp, null, param);

        if (null != closeableHttpResponse && closeableHttpResponse.getStatusLine().getStatusCode() == 200) {
            return EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
        }

        return null;


    }

    public String autoClick(String param) throws Exception {
        String random = getRandom();
        logger.info("Param： " + param + ". waitTime: " + random + " seconds");
        int waitTime = Integer.valueOf(random) * 1000;
        //Thread.sleep(waitTime);
        TimeUnit.MILLISECONDS.sleep(waitTime);
        String result = orderCoah(param);
        logger.info("result: " + result);
        return result;
    }

    public static void main(String[] args) throws IOException {
        HttpClient httpClient = new HttpClient();

        String coach = httpClient.findCoach("");
        System.out.println(coach);
    }
}
