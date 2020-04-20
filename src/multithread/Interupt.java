package multithread;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @version :V1.0
 * @date :2020-04-17 14:44:41
 */

public class Interupt {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Worker());
        t.start();
        Thread.sleep(1000);
//        t.interrupt();
        System.out.println("Main thread stopped.");
    }

    public static class Worker implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            System.out.println("打断之前的标志位  "+thread.isInterrupted());
            thread.interrupt();
            System.out.println("打断之后的标志位  "+thread.isInterrupted());
            System.out.println("interrupted 结果 "+Thread.interrupted());;
            System.out.println("再次打断之后的标志位  "+thread.isInterrupted());
            System.out.println("11111");
            System.out.println(22222);
            System.out.println("Worker started.");
            }
        }
    }

