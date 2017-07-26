package sort;

import com.sun.tools.javac.comp.Lower;
import sun.java2d.pipe.AAShapePipe;

/**
 * Created by teng.liu on 2017/7/20.
 * 快速排序 quickSort
 *
 * 在一个序列中选取一个基准 根据基准分为左右两个区间 然后在对每个区间使用相同的方法
 *
 */
public class QuickSort {

    public static int[] quickSort(int[] array){
        quickSortBase(array,0,array.length-1);
        return array;

    }

    public static void quickSortBase(int[] array, int begain, int end){

        if( begain > end){
            return ;
        }

        int baseLocation = partition(array,begain,end);
        quickSortBase(array,begain,baseLocation-1);
        quickSortBase(array,baseLocation+1,end);
    }

    private static int partition(int[] array, int begain, int end) {
        int base = array[begain];

        while(begain < end ){
            //大于base移动到array的后边
            while(begain< end && array[end] >= base){
                --end;    //TODO 为什么不是end--
            }
            array[begain] = array[end];

            //小于base移动到array的左边
            while(begain < end && array[begain] <= base){
                ++begain;
            }
            array[end] = array[begain];
        }

        array[begain] = base;

        return begain;

    }

}
