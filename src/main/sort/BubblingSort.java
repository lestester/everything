package sort;

import java.util.List;

/**
 * Created by teng.liu on 2017/7/20.
 * <p>
 * <p>
 * 冒泡排序
 * 对于一组序列a 4 75 8 34 34 12 34 43 12 45 12 43 54 34 12 34 34 12
 * 1.从第二个开始 比较 a[1] <  a[0] 交换两个的位置
 */
public class BubblingSort {

    public static int[] bubblingSort(int[] integers) {

        for (int j = 0; j < integers.length; j++) {
            for (int i = integers.length - 1; i > 0; i--) {
                Integer tmpA = integers[i];
                Integer tmpB = integers[i - 1];
                //交换
                if (tmpA > tmpB) {
                    integers[i] = tmpB;
                    integers[i - 1] = tmpA;
                }
            }
        }
        return integers;
    }


    /**
     * 增加标记位标记是否交换过 若没有交换则停止循环
     * @param integers
     * @return
     */
    public static int[] bubblingSortOptimize(int[] integers){
        for (int j = 0; j < integers.length; j++) {
            boolean exchange = false;
            for (int i = integers.length - 1; i > 0; i--) {
                Integer tmpA = integers[i];
                Integer tmpB = integers[i - 1];
                //交换
                if (tmpA > tmpB) {
                    exchange =true ;
                    integers[i] = tmpB;
                    integers[i - 1] = tmpA;
                }
            }
            if(exchange){
                break;
            }
        }
        return integers;


    }




}
