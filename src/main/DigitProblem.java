import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by teng.liu on 2017/6/29.
 * 
 * https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/digit-problem/
 * 
 */
public class DigitProblem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split(" ");
        String[] xStrs = strings[0].split("");
        int k = Integer.valueOf(strings[1]);
        for(int i=0;i < k;i++){
            xStrs[i] = "9";
        }
        System.out.println(Arrays.stream(xStrs).reduce("", (sum,str) -> sum + str ));


    }
    
}
