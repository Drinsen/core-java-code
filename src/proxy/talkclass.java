package proxy;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-01-08 15:56:22
 * @Version: V1.0
 */

public class talkclass implements talk {
    @Override
    public void sayHello(String words) {
        System.out.println(words);
    }

    @Override
    public void sayYourName() {
        System.out.println("I am junxin ");
    }
}
