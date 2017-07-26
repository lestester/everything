package z;

/**
 * Created by teng.liu on 2017/7/6.
 *
 */
public class firstDay {


    public static void main(String[] args) {

        //oct2Bin(-16);
        System.out.println(4>>>31);
        System.out.println(Integer.numberOfLeadingZeros(64));

        System.out.println(Integer.toBinaryString(-64));

        System.out.println(Integer.toOctalString(14));



    }


/*
    public static String oct2Bin(int a) {
        int tmp = 0;

        StringBuilder stringBuilder = new StringBuilder();
        String result = "";

        if (a < 0) {
            tmp = -a;
        } else {
            tmp = a;
        }

        while (tmp / 2 > 0) {
            stringBuilder.append(tmp % 2);
            tmp = tmp / 2;
        }

        stringBuilder.append(tmp);

        System.out.println(stringBuilder.reverse().toString());


        //负数需要用补码标识
        //先转成反码 然后反码加1
        System.out.println("Integer" +  Integer.toBinaryString(a));

        return null;
    }
*/
}
