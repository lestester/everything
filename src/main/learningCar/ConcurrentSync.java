package learningCar;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by teng.liu on 2017/7/25.
 */
public class ConcurrentSync {

    private static final int MAX_THREAD = 10;

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(MAX_THREAD);

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcurrentSync.class);


    //初始化 完成登录操作
    //private static HttpClient httpClient = new HttpClient();


    public List<String> syncRequest(List<String> params){

        List<Callable<String>> callables = generalThreadInfo(params);

        List<String> reslutList = Lists.newArrayList();


        try {
            List<Future<String>> futures = EXECUTOR_SERVICE.invokeAll(callables);
            for (Future<String> future : futures) {
                String s = future.get();
                reslutList.add(s);
            }

        } catch (InterruptedException e) {
            LOGGER.error("request failed!",e);

        } catch (ExecutionException e) {
            LOGGER.error("get result error!",e);
        }

        return reslutList;

    }


    private  List<Callable<String>> generalThreadInfo(List<String> params){


        ArrayList<Callable<String>> runThreads = Lists.newArrayList();
        for(String s: params){
            runThreads.add(new ActiveSyncThread(s));
        }
        return runThreads;
    }


      class  ActiveSyncThread implements Callable<String>{
        private String param;
        private HttpClient httpClient = new HttpClient(); //todo 放到这里存在死循环 创建完线程执行的时候无法执行 原因待查明
        public ActiveSyncThread(String param ) {
            this.param = param;
        }

        public String call() throws Exception {
            return httpClient.autoClick(param);
        }
    }






}
