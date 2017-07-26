package cocurrentLearning;

/**
 * Created by teng.liu on 2017/7/25.
 */
public class ThreadDemo extends Thread {

    public ThreadDemo() {
        super();
    }

    public ThreadDemo(String name) {
        super(name);
    }

    private int i = 10;

    @Override
    public void run() {
        //并发逻辑需要在此处
        System.out.println(Thread.currentThread().getName() + " ThreadDemo running " + i--);
    }

    public static void main(String[] args) {
        new ThreadDemo("01").start();
        new ThreadDemo("02").start();
        new ThreadDemo("03").start();
    }

}
