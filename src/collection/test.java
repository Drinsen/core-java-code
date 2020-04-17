package collection;

import java.lang.reflect.Array;
import java.util.*;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-03-30 10:00:23
 * @Version: V1.0
 */

public class test {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        List<Integer> subList = intList.subList(1,3);
        subList.set(1,100);
        intList.forEach(System.out::println);


//        Integer[] integers = new Integer[30];
//        List<Integer> list = Arrays.asList(integers);
//        list.add(1);

//        ArrayList<String> strings = new ArrayList<>();
//        ArrayList rawList = strings;
//        rawList.add(new Date());
//        rawList.add(new Integer(1));
//        rawList.add(new Boolean(true));
//        rawList.forEach(System.out::println);

//        Integer[] intList = new Integer[]{1,2,3,4};
//        Arrays.asList(intList);

    }
}
