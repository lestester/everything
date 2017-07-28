import org.junit.*;
import org.junit.Test;
import prepare.DigitProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by teng.liu on 2017/7/28.
 */
public class CommonElementsTest {
    List<Integer> listA = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 6, 13, 14, 34, 45, 56, 143));
    List<Integer> listB = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 10, 13, 14, 34, 45, 143));
    int[] expectArray =new int[]{2,13,14,34,143} ;
    DigitProblems digitProblems = new DigitProblems();


    @org.junit.Test
    public void commonElemetsTest() {
        List<Integer> integers = digitProblems.commonElements(listA, listB,0);
        System.out.println(integers);
    }


    @Test
    @Ignore
    public void findMaxCommonDivisorTest() {
        Assert.assertEquals(0,  digitProblems.findMaxCommonDivisor(36, 49).intValue());

        Assert.assertEquals(4,  digitProblems.findMaxCommonDivisor(36, 64).intValue());

        Assert.assertEquals(6,  digitProblems.findMaxCommonDivisor(36, 102).intValue());




    }

}
