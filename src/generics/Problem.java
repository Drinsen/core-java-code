package generics;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-03-10 18:13:58
 * @Version: V1.0
 */

public class Problem<T>{
    static class  MyInnerException extends Exception { // won't compile

        public <T extends Exception> void throwIt(T t) throws T {
            throw t;
        }

        public void catchIt() {
            try {
                throwIt(new Exception());
            } catch (Exception e) {
            }
        }
    }
}
