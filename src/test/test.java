package test;

import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.*;
import java.util.stream.Collectors;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @version :V1.0
 * @date :2020-04-07 16:04:43
 */

public class test {
    public static void main(String[] args) {
        List<student> studentArrayList= new ArrayList<>();
        student student1 = new student("zhangsan","qignhua",15);
        student student2 = new student("lisi","beida",44);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        List<SuperClass> superClassList = studentArrayList.stream().map(SuperClass::new).collect(Collectors.toList());
        System.out.println(studentArrayList);
        System.out.println(superClassList);
    }
}
