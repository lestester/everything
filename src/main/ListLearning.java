import com.google.common.collect.Lists;

import javax.sound.midi.Soundbank;
import java.util.Iterator;
import java.util.List;

/**
 * Created by teng.liu on 2017/7/5.
 */
public class ListLearning {

    public static void main(String[] args) {


        List<Integer> list = Lists.newArrayList();
        for(int i = 1; i< 11; i++){
            list.add(i);
        }

        System.out.println(" before " + list.size());


        Iterator<Integer> iterator = list.iterator();

        /*while (iterator.hasNext()){
            Integer next = iterator.next();

            if(next.equals(4)){
                iterator.remove();
                continue;
            }
        }*/

        System.out.println(" after  "+ list.size());


        List<List<Integer>> partition = Lists.partition(list, 3);

        System.out.println(partition);


    }
}
