package cocurrentLearning;

/**
 * Created by teng.liu on 2017/7/25.
 */
public class RunnableDemo implements Runnable {

    private int i=10;
    @Override
    public void run() {
        //这里写要并发的代码
        System.out.println( Thread.currentThread().getName()+ " runnableDemo runing: " + i--);
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo();
        new Thread(runnableDemo,"1").start();
        new Thread(runnableDemo,"2").start();
        new Thread(runnableDemo,"3").start();
    }
}
