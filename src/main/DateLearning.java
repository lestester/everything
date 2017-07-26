import org.apache.commons.lang3.time.DateUtils;import java.text.ParseException;import java.util.Calendar;import java.util.Date;/** * Created by teng.liu on 2017/3/22. */public class DateLearning {    private static String DATE_STRING = "yyyy-MM-dd HH:mm:ss";    private static String bornString = "2017-03-03 08:40:00";    private static Date bornDate;    private static Calendar calendar = Calendar.getInstance();    static {        try {            bornDate = DateUtils.parseDate(bornString, DATE_STRING);        } catch (ParseException e) {            e.printStackTrace();        } finally {        }    }    public static void main(String[] args) {        getDays();        System.out.println("-----------------------------------");        System.out.println("-----------------------------------");        System.out.println("-----------------------------------");        System.out.println("-----------------------------------");        System.out.println("-----------------------------------");        addDays(100);    }    private static void getDays() {        //获取当前时间        Date now = new Date();        //计算天数        long diff = now.getTime() - bornDate.getTime();        long days = diff / DateUtils.MILLIS_PER_DAY;        long hours = (diff % DateUtils.MILLIS_PER_DAY) / DateUtils.MILLIS_PER_HOUR;        System.out.println("days : " + days + "\nhour: " + hours);    }    private static void addDays(int day) {        calendar.setTime(bornDate);        calendar.add(Calendar.DATE, day);        System.out.println(calendar.getTime().toString());    }}