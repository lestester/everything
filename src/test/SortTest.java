import org.junit.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sort.BubblingSort;
import sort.QuickSort;

import java.util.Arrays;

/**
 * Created by teng.liu on 2017/7/20.
 */


public class SortTest {

    private int[] testCase ;


    @Before
    public void addTestCase(){
        testCase = new int[]{4,34,3,4,34,1,6,5,65,2,1,43,613,23};
    }

    @Test
    @Ignore("一次只跑一个")
    public void testMethod(){
        int[] integers = BubblingSort.bubblingSort(testCase);
        for (int integer : integers) {
            System.out.println(integer);

        }
    }

    @Test
    public void testQuickSort(){
        int[] integers = QuickSort.quickSort(testCase);
        for (int integer : integers) {
            System.out.println(integer);

        }
    }


}
