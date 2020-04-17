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

        Thread.sleep(100);
        t.interrupt();

        System.out.println("Main thread stopped.");
    }

    public static class Worker implements Runnable {
        @Override
        public void run() {
            System.out.println("Worker started.");

            try {
                Thread.sleep(500); // 此时被interrupt()会抛出InterruptedException
            } catch (InterruptedException e) {
                Thread thread = Thread.currentThread();
                System.out.println("再次中断之前isInterrupted():" + thread.isInterrupted());
                System.out.println("再次中断之前interrupted():" + Thread.interrupted());
                // 再次调用interrupt方法中断自己，将中断状态设置为“中断”
                thread.interrupt();
                System.out.println("再次interrupt()后isInterrupted():" + thread.isInterrupted());
                System.out.println("再次interrupt()后第一次interrupted()返回:" + Thread.interrupted());// clear status
                // interrupted()判断是否中断，还会清除中断标志位
                System.out.println("interrupted()后此时再判断IsInterrupted: " + thread.isInterrupted());
                System.out.println("---------After Interrupt Status Cleared----------");
                System.out.println("再次interrupt()后第二次interrupted()返回: " + Thread.interrupted());
                System.out.println("此时再判断IsInterrupted: " + thread.isInterrupted());
            }
            System.out.println("Worker stopped.");
        }
    }
}
