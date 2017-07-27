package prepare;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by teng.liu on 2017/7/27.
 */
public class DigitProblems {


    /**
     * 求一个数字的质因式分解
     * 任何一个数字可以分解成几个质数相乘的形式
     * <p>
     * 求解思路：
     * 对于给定的数n
     * 从最小的质因数开始k=2 如果
     * 1,n % k == 0 则print k ，n=n/k 如果 n< 2 则停止  否则重复步骤1
     * 2.n % k !=0  则 k=k+1 重复步骤1
     */
    public void getPrimeDigit(int n, List<Integer> list) {
        if (n == 2) {
            list.add(n);
            System.out.println(n);
        }
        if (n < 2) {
            return;
        }

        int k = 2;
        while (k <= n) {
            if (n % k == 0) {
                list.add(k);
                System.out.println(k);
                n = n / k;
                getPrimeDigit(n, list);
                break;
            }
            k++;
        }
    }

    /**
     * 求两个数的最大公约数
     * 思路:
     * 1.求出每个数的质因式分解
     * 2.然后从两个数的质因式分解中找出相同的不重复的质数的乘积即是最大公约数
     *
     * 注意 对于步骤二 隐含的问题是在两个已经排序的数组中 如何快速的找出同时出现的数字
     */


    /**
     * 返回两个列表中的公共元素
     *
     * @param listA 已经排序好顺序从小到大
     * @param listB 已经排序好顺序从小到大
     * @return
     */
    public List<Integer> commonElements(List<Integer> listA, List<Integer> listB) {
        //对于两个list都是有序的,顺序从小到大
        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < listA.size() && j < listB.size()) {
            if (listA.get(i) == listB.get(j)) {
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != listA.get(i)) {
                    resultList.add(listA.get(i));
                }
                i++;
                j++;
                continue;
            } else if (listA.get(i) < listB.get(j)) {
                i++;
                continue;
            } else {
                j++;
                continue;
            }

        }
        return resultList;

    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        List list = new ArrayList<Integer>();
        new DigitProblems().getPrimeDigit(64, list);
        System.out.println("list: " + list);
    }
}
