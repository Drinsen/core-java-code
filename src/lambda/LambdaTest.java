package lambda;

import javax.swing.*;
import java.util.*;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-01-06 13:56:19
 * @Version: V1.0
 */

public class LambdaTest {
    public static void repeat(int n,IntConsumer action){
        for (int i = 0; i < n ; i++) {
            action.accept(i);
        }
    }

    final static String salutation = "Hello! ";

    public static void main(String args[]){
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
