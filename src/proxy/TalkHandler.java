package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-01-08 15:57:24
 * @Version: V1.0
 */

public class TalkHandler implements InvocationHandler {
    private Object target;

    public TalkHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy 的 invoke方法被执行了！！！！！！！");
        System.out.println(method.getName());
        System.out.println(args);
        return method.invoke(target,args);
    }
}
