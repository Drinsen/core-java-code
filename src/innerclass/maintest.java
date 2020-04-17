package innerclass;

import innerclass.innerrelection.Math;

import java.util.Timer;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-01-08 09:42:54
 * @Version: V1.0
 */

public class maintest {
    public static void main(String[] args) {
        Math math = new Math(){
            @Override
            public void printValue(String a) {
                System.out.println("去他妈的");
            }
        };
        math.printValue("1");
    }
}
