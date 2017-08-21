/**
 * Created by teng.liu on 2017/8/17.
 */
public class FinallyLearn {



    public static String forTestFinally(){
        try{
            return "hello World!";
        } finally {
            System.out.println("hei hei hei");
        }
    }

    public static void main(String[] args) {
        System.out.println(forTestFinally());
    }
}
