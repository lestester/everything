
/**
 * Created by teng.liu on 2017/8/21.
 */
public class ForEightTest {


    public int getInt(int number, int m) {

        if (m > 32) {
            System.out.println("不符合条件 m必须小于32");
            return 0;
        }

        System.out.println(Integer.toBinaryString(number));

        int mm = 0xffffffff >>> (32 - m);

        System.out.println("mm: " + Integer.toBinaryString(mm));

        int result = number | mm;

        System.out.println(Integer.toBinaryString(result));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ForEightTest().getInt(100, 4));
        System.out.println(new ForEightTest().getInt(378437, 5));

    }
}
