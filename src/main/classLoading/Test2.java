package classLoading;

import com.sun.media.sound.SoftTuning;

/**
 * Created by teng.liu on 2017/8/7.
 */
class InitClass2 {

    static {
        System.out.println("InitClass2 static code");
    }

    public static Filed1 filed1 = new Filed1();
    public Filed2 filed2 = new Filed2();

    public InitClass2() {
        System.out.println("InitClass2 constructor");
    }
}

class SubInitClass2 extends InitClass2 {
    public SubInitClass2() {
        System.out.println("SubInitClass2 constructor");
    }

    static {
        System.out.println("subInitClass static code");
    }

    public static Filed3 filed3 = new Filed3();
}

public class Test2 {
    public static void main(String[] args) {
        new SubInitClass2();
    }


    public int division(int a, int b) {
        int c = 0;
        if (a > 0 || b > 0) {
            c = a - b;
        }
        return a / c;
    }
}