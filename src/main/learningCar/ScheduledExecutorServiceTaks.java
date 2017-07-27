package learningCar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by teng.liu on 2017/7/25.
 */
public class ScheduledExecutorServiceTaks {


    private static Logger logger = LoggerFactory.getLogger(ScheduledExecutorServiceTaks.class);

    public static void execteEightAtNightPerDay(){
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        long oneDay = 24 * 60 * 60 * 1000;
        long initDay = getTimeMillis("08:00:00") -System.currentTimeMillis();
        initDay = initDay > 0? initDay: oneDay + initDay;
        logger.info("task start!!");
        scheduledExecutorService.scheduleWithFixedDelay(new GoingTask(),initDay,oneDay, TimeUnit.MILLISECONDS);
    }

    private static long getTimeMillis(String time) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
            Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
            return curDate.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }


        return 0;
    }

    public static void main(String[] args) {
        execteEightAtNightPerDay();
        //new GoingTask().run();
    }


}
