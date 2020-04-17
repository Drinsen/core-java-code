package interfaces;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-01-08 17:10:01
 * @Version: V1.0
 */
public interface B extends A {
    default void hello(){
        System.out.println("hello from A");
    }
}
