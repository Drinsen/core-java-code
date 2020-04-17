package proxy;

import java.lang.reflect.Proxy;
import java.util.List;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-01-08 15:55:59
 * @Version: V1.0
 */

public class maintest {

    public static void main(String[] args) {
//        talkclass talkclass = new talkclass();
//        TalkHandler talkHandler = new TalkHandler(talkclass);
//        Class[] interfaces = new Class[]{talk.class};
//        talk proxy = (talk) Proxy.newProxyInstance(maintest.class.getClassLoader(), interfaces, talkHandler);
//        proxy.sayHello("嘎嘎");
//        proxy.sayYourName();
//        String s = new String("123");
        talk talk = new talkclass();
        talk.sayYourName();
        talk.sayHello("哈哈");
    }
}
