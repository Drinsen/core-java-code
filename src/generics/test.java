package generics;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.*;
import static javafx.scene.input.KeyCode.T;

/**
 * description:
 * @author :刘俊新(junxin.liu@ucarinc.com)
 * @Date :2020-02-26 16:06:21
 * @Version: V1.0
 */

public class test {
    public static void main(String[] args) {
       Pair pair = new Pair();
       DateInterval dateInterval = new DateInterval();
       pair = (DateInterval)pair;
       dateInterval =  dateInterval;
    }
}
