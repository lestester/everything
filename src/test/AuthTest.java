/*
import com.nestia.common.util.JsonUtils;
import com.nestia.scheduler.group.common.Configs;
import com.nestia.scheduler.group.model.InviteDownloadLogContent;
import com.nestia.scheduler.group.model.Log;
import com.nestia.scheduler.group.utils.LogAuthUtils;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

*/
/**
 * Created by teng.liu on 2017/7/20.
 *//*


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AuthTest {


    @Resource
    private Configs configs;

    String  context = "";
    String  userAget = "";

    @Test
    public void testAuth(){

        Log log = new Log();
        log.setUserAgent(userAget);
        log.setContent(context);

        InviteDownloadLogContent content = JsonUtils.readValue(log.getContent() , InviteDownloadLogContent.class);

        String auth = LogAuthUtils.getAuth(log, content, configs.get().getString("log.salt"));

        Assert.assertEquals(auth,content.getNestiaAuth());
    }


}
*/
