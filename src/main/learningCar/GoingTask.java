package learningCar;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by teng.liu on 2017/7/25.
 */
public class GoingTask implements Runnable {


    private static Logger logger = LoggerFactory.getLogger(GoingTask.class);
    /**
     * sjd2016071600103 08:40~09:20
     * sjd2016071600113 09:20~10:00
     * sjd201702210011  16:20~17:00
     * sjd2016071600143 10:00~10:40
     *
     * @param list
     */
    private void buildParams(List<String> list) {
        String date = getDate();
        // param = "{\"tbTimeNo\":\"sjd201702210011\",\"trainDate\":\"2017-07-26\",\"coachNo\":\"ygd201607160015\",\"subID\":\"3\"}";
        list.add("{\"tbTimeNo\":\"sjd2016071600103\",\"trainDate\":\"" + date + "\",\"coachNo\":\"ygd201607160015\",\"subID\":\"3\"}");
        list.add("{\"tbTimeNo\":\"sjd2016071600113\",\"trainDate\":\"" + date + "\",\"coachNo\":\"ygd201607160015\",\"subID\":\"3\"}");
        //list.add("{\"tbTimeNo\":\"sjd2016071600143 \",\"trainDate\":\"" + date + "\",\"coachNo\":\"ygd201607160015\",\"subID\":\"3\"}")
        list.add("{\"tbTimeNo\":\"sjd201702210011\",\"trainDate\":\"" + date + "\",\"coachNo\":\"ygd201607160015\",\"subID\":\"3\"}");
    }

    private String getDate() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(cal.getTime());
        return format;

    }

    @Override
    public void run() {
        logger.info( " task runing " );
        ConcurrentSync concurrentSync = new ConcurrentSync();
        List<String> list = Lists.newArrayList();
        buildParams(list);
        int i = 10;
        while (i-- > 0) {
            logger.info("runing " + i + " times");
            List<String> strings = concurrentSync.syncRequest(list);
        }
        logger.info("task end!!!");
    }
}