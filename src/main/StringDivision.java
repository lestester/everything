import java.util.HashSet;
import java.util.Set;

/**
 * Created by teng.liu on 2017/8/2.
 * https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/string-division/
 */
public class StringDivision {


    public boolean stringDivision(String string) {
        if (string.length() < 4) {
            return false;
        }

        Set<String>  result = new HashSet<String>();

        int length = string.length();
        int index = 0 ;
        int i=1;
        String partOne = string.substring(index,index);
        String partTwo = string.substring(index+i,index+i);
        if(partOne.equals(partTwo)){
            i++;
            partTwo = string.substring(index+i++,index+i);
        }


        return false;




    }


}
